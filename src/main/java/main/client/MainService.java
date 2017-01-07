package main.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import main.shared.Patient;

import java.util.List;

@RemoteServiceRelativePath("MainService")
public interface MainService extends RemoteService {

    List<Patient> getAllPatients();
    void addNewPatient(Patient patient);
    void updatePatient(Patient patient);
    List<Patient> findPatient(String searchValue);
    void deletePatient(Patient patient);

    public static class App {
        private static MainServiceAsync ourInstance = GWT.create(MainService.class);

        public static synchronized MainServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
