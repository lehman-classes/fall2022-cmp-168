/*
 
class Patient
numPatients: static int  //initialize to 0, increment inside the constructor
name: String
birthYear: int
patientNumber: int
ailment: String
Patient(String, int, String)	//name, birthYear, ailment
getName(): String
getBirthYear(): int
getPatientNumber(): int
getAilment(): String
toString(): String 
//"Patient [name= %20s | birthYear= %04d | patient number= %06d | ailment= %20s]\n", name, birthYear, patientNumber, ailment
equals(Object) : boolean

 */
public class Patient implements Cloneable {

    private static int numPatients; // initialize to 0, increment inside the constructor
    private String name;
    private int birthYear;
    private int patientNumber;
    private String ailment;

    private Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    Patient(String name, int birthYear, String ailment) {
        this.name = name;
        this.birthYear = birthYear;
        this.ailment = ailment;
        hospital = new Hospital();

    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public String getAilment() {
        return ailment;
    }

    public Patient getCopy() {
        /// this COULD BE a deep copy
        return new Patient(this.name, this.birthYear, this.ailment);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // this is a shadow copy
    }

}
