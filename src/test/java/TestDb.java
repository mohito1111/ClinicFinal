import main.server.ContactDatabase;
import main.shared.Patient;

import java.util.List;

public class TestDb {
    public static void main(String[] args) {
        List<Patient> patientsList = ContactDatabase.getPatientsList();
        print(patientsList);
    }
    public static void print(List<Patient> patientsList){
        for (Patient o:patientsList) {
            System.out.println(o);
        }
    }
    public static void add(Patient p){
        ContactDatabase.addNewPatient(p);
    }
}
