package service;

import model.Doctor;

import java.util.List;

public interface IDcotorService  {
    void  addDoctor(Doctor doctor);
    void  updateDoctor(int doctorId, double fees);
    void  deleteDoctor(int doctorId);
    Doctor getById(int doctorId);
    List<Doctor> getAll();
    List<Doctor> getBySpeciality(String speciality);
    List<Doctor> getBySpecialityAndExp(String spececiality, int experience);
    List<Doctor> getBySpecialityAndLessFess(String spececiality, double fees);
    List<Doctor> getBySpecialityAndRatings(String spececiality, int ratings);
    List<Doctor> getBySpecialityAndNameContains(String spececiality, String doctorName);
}
