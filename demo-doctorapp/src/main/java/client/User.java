package client;

import model.Doctor;
import model.Specialization;
import service.DoctorServiceImpl;
import service.IDcotorService;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        IDcotorService dcotorService = new DoctorServiceImpl();
        Specialization specialization=Specialization.GYNAEO;
        String speciality=specialization.getSpeciality();
        Doctor doctor = new Doctor("RAM",speciality,1400,8,7);
        dcotorService.addDoctor(doctor);
    }
}