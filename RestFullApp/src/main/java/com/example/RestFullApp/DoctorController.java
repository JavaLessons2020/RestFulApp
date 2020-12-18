package com.example.RestFullApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    DAO dao = new DAO();

    @GetMapping("")
    public Doctor getDoctor() {
        Animal animal = new Animal(1L, "Tuzuk", 5, "cat");
        return new Doctor(1L, "Dulitl", 4, 5, animal);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Doctor> newDoctor(@PathVariable("id") Long id) {
        if (dao.getDoctorById(id) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(dao.getDoctorById(id), HttpStatus.OK);
        }
    }

    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable("id") Long id,
                               @RequestParam(value = "name", required = false) String name) {
        Doctor doctor = dao.getDoctorById(id);
        doctor.setName(name);
        return dao.doctors.set(Math.toIntExact(id), doctor);
    }
}
