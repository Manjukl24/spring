package repository;

import model.Doctor;

import java.util.List;

public interface IDoctorRepository {
    void  addDoctor(Doctor doctor);
    void  updateDoctor(int doctorId, double fees);
    void  deleteDoctor(int doctorId);
    Doctor findById(int doctorId);
    List<Doctor> findAll();
    List<Doctor> findBySpeciality(String speciality);
    List<Doctor> findBySpecialityAndExp(String spececiality, int experience);
    List<Doctor> findBySpecialityAndLessFess(String spececiality, double fees);
    List<Doctor> findBySpecialityAndRatings(String spececiality, int ratings);
    List<Doctor> findBySpecialityAndNameContains(String spececiality, String doctorName);
}
