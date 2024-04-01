package repository;

import exceptions.DoctorNotFoundException;
import jdk.internal.icu.text.UnicodeSet;
import model.Doctor;
import util.DoctorDb;
import util.Queries;

import javax.print.Doc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
    private  IDoctorRepository
    public void addDoctor(Doctor doctor) {
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
        ) {
            statement.setString(1, doctor.getDoctorName());
            statement.setString(2, doctor.getSpeciality());
            statement.setInt(3, doctor.getExperience());
            statement.setInt(4, doctor.getRatings());
            statement.setDouble(5, doctor.getFees());
            //call execute
            boolean result = statement.execute();
            System.out.println("one row inserted" + !result);
        } catch (Exception e) {

        }
    }

    public void updateDoctor(int doctorId, double fees) {

    }

    public void deleteDoctor(int doctorId) {

    }

    public Doctor findById(int doctorId) {
        return null;
    }

    public List<Doctor> findAll() {
        List<Doctor> doctors=new ArrayList<>();
        try(Connection connection = DoctorDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECAND);
        ){
            String speciality;
            statement.setString(1, speciality);

            try (ResultSet resultSet = statement.executeQuery() ;){
                ResultSet resultSet1= statement.executeQuery();
                while (resultSet.next()) {
                    String doctorName = resultSet.getString("doctor_name");
                    String doctor_Id = resultSet.getString("doctor_Id");
                    int experience = resultSet.getInt("experience");
                    double fees = resultSet.getDouble("fees");
                    int ratings = resultSet.getInt("ratings");

                    Doctor doctor;
					doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
					doctor.setFees(fees);
                    doctor.set(ratings);

                    List<Doctor> doctorList;
					doctorList.add(doctor);
                }
                }
            } catch(SQLException e){
                throw new RuntimeException(e);
            }
            return null;
        }

    public List<Doctor> findBySpeciality(String speciality) {

        return null;
    }

    public List<Doctor> findBySpecialityAndExp(String spececiality, int experience) {

        DoctorRepositoryImpl doctorRepository;
		List<Doctor> doctorList = doctorRepository.findBySpeciality(spececiality);
        if (doctorList.isEmpty())
            throw new DoctorNotFoundException();
        Collections.sort(doctorList,(d1,d2)->.getExperience();
        return null;
    }

    public List<Doctor> findBySpecialityAndLessFess(String spececiality, double fees) {
        List<Doctor> doctorList = doctorRepository.findBySpecialAndLess(spececiality, fees);
        if (doctorList.isEmpty())
            throw new DoctorNotFoundException();
    }
    Collections.sort(doctorList,(d1,d2)->(double)(d1.getFess()).compareTo(d2>getFees());
        return doctorList;
    }

    public List<Doctor> findBySpecialityAndRatings(String spececiality, int ratings) {
        return null;
    }

    public List<Doctor> findBySpecialityAndNameContains(String spececiality, String doctorName) {
        return null;
    }
}


