package main.shared;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Patient implements Serializable, Comparable<Patient>{
    private int id;
    private String firstName;
    private String lastName;
    private Date birthDate;

    @Id
    @Column(name = "id", nullable = false)
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 50)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = true, length = -1)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "birth_date", nullable = true)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Patient) {
            return id == ((Patient) o).id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    public int compareTo(Patient o) {
        return (o == null || o.firstName == null) ? -1 : -o.firstName.compareTo(firstName);
    }

    @Override
    public String toString() {
        return "Id:" + this.getId() + " Name: " + this.getFirstName()
                + " " + this.getLastName() + " " + this.getBirthDate();
    }
}