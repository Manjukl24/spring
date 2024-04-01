package model;

public enum Specialization {
    ORTHO("ORTHOPEDIC"),
    PEDIA("PEDIATRICIAN"),
    PHYSICIAN("DENTIST PHYSICIAN"),
    GYNAEO("GYNAECOLOGIST"),
    DERMA("DERMATOLOGIST");

    private  String speciality;
    Specialization(String speciality){
        this.speciality=speciality;
    }

    public String getSpeciality() {
        return speciality;
    }
}
