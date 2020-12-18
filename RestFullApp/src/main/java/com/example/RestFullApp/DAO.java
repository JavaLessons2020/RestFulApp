package com.example.RestFullApp;

import java.util.ArrayList;
import java.util.List;

public class DAO {

    ArrayList<Doctor> doctors = new ArrayList<>();


    public DAO() {
        doctors.add(new Doctor(1L, "Petrov", 3,5));
        doctors.add(new Doctor(2L, "Ivanov", 4,5));
        doctors.add(new Doctor(3L, "Kirilow", 5,5));
        doctors.add(new Doctor(4L, "Zemlana", 7,5));
    }

    public void saveDoctor(Doctor doctor){
        if (doctor!=null){
            doctors.add(doctor);
        }
    }


    public Doctor getDoctorById(Long id){
        try {
            return doctors.get(Math.toIntExact(id));
        }catch (IndexOutOfBoundsException e){
            return null;
        }
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        System.out.println(dao.getDoctorById(5L));
    }

}
