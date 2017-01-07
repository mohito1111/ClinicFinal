package main.shared;

public class FieldChecker {
    public static final String firstNameDefault = "Фамилия";
    public static final String lastNameDefault = " Имя и отчество";

    public String verifyPatient(Patient patient){
        if (patient.getFirstName().equals(""))
            return "Введите по крайней мере фамилию";
        if (patient.getFirstName().length()<2)
            return "Фамилия должна быть минимум из 2 букв";
        if (patient.getFirstName().equals(firstNameDefault))
            return "Проверьте данные на корректность";
        if (patient.getLastName().equals(lastNameDefault))
            return "Проверьте данные на корректность";
        return "";
    }
}

