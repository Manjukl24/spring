package service;

import model.Doctor;
import repository.DoctorRepositoryImpl;
import repository.IDoctorRepository;

import java.util.List;

public class DoctorServiceImpl  implements  IDcotorService{

    private IDoctorRepository doctorRepository = new DoctorRepositoryImpl();

    public void addDoctor(Doctor doctor) {
        doctorRepository.addDoctor(doctor);

    }

    public void updateDoctor(int doctorId, double fees) {

    }

    public void deleteDoctor(int doctorId) {

    }

    public Doctor getById(int doctorId) {
        return null;
    }

    public List<Doctor> getAll() {
        return null;
    }

    public List<Doctor> getBySpeciality(String speciality) {
        return null;
    }

    public List<Doctor> getBySpecialityAndExp(String spececiality, int experience) {
        return null;
    }

    public List<Doctor> getBySpecialityAndLessFess(String spececiality, double fees) {
        return null;
    }

    public List<Doctor> getBySpecialityAndRatings(String spececiality, int ratings) {
        return null;
    }

    public List<Doctor> getBySpecialityAndNameContains(String spececiality, String doctorName) {
        return null;
    }
}
