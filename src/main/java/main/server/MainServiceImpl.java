package main.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import main.client.MainService;
import main.shared.Patient;

import java.util.List;

public class MainServiceImpl extends RemoteServiceServlet implements MainService {

    public List<Patient> getAllPatients()
    {
        return ContactDatabase.getPatientsList();
    }

    public void addNewPatient(Patient patient)
    {
        ContactDatabase.addNewPatient(patient);
    }

    public void updatePatient(Patient patient) {
        ContactDatabase.updatePatient(patient);
    }

    public List<Patient> findPatient(String searchValue)
    {
        return ContactDatabase.findPatientByFirsName(searchValue);
    }

    public void deletePatient(Patient patient)
    {
        ContactDatabase.deletePatient(patient);
    }
}