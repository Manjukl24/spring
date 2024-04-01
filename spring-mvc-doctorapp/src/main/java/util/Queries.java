package util;

public class Queries {
    public  static  final  String INSERTQUERY =
            "insert into doctor(doctor_name,speciality,experience,ratings,fees) values(?,?,?,?,?);";
    public  static  final  String UPDATEQUERY =
            "UPDATE DOCTOR SET fees=? WHERE doctor_id=?";
    public  static  final  String DELETEQUERY=
            "DELETE FROM DOCTOR SET fees=? WHERE doctor_id=?";
    public  static  final  String FINALQUERY =
            "SELECT * FROM DOCTOR";
    public  static  final  String FINDBYSPECIALITY =
            "SELECT * FROM DOCTOR WHERE speciality";
    public  static  final  String FINDBYSPECANDEXP =
            "SELECT * FROM DOCTOR WHERE speciality = ? AND experience >= ?";
    public  static  final  String FINDBYSPECANDRATINGS =
            "SELECT * FROM DOCTOR WHERE speciality=? AND ratings >= ?";
    public  static  final  String FINDBYSPECANDFEES =
            "SELECT * FROM DOCTOR WHERE speciality=? AND fees >= ?";
    public  static  final  String FINDBYSPECAND =
            "SELECT * FROM DOCTOR WHERE speciality=? AND fees >= ?";
    public  static  final  String FINDBYSPECANDFEES1 =
            "SELECT * FROM DOCTOR WHERE speciality=? AND fees >= ?";


}
