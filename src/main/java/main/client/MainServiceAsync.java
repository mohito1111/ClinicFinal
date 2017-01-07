package main.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import main.shared.Patient;

import java.util.List;

public interface MainServiceAsync {

    void getAllPatients(AsyncCallback<List<Patient>> async);

    void findPatient(String searchValue, AsyncCallback<List<Patient>> async);

    void deletePatient(Patient patient, AsyncCallback<Void> async);

    void updatePatient(Patient patient, AsyncCallback<Void> async);

    void addNewPatient(Patient patient, AsyncCallback<Void> async);
}
