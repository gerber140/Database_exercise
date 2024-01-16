package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Client implements Serializable {
    private static final long serialVersionUID = 42L;
    @Id
    @GeneratedValue
    private long id;
    private String nameAndSurname;
    private String pesel;
    protected LocalDate dateOfVisit;

    public Client() {
    }

    public Client(String nameAndSurname, String pesel, LocalDate dateOfVisit) {
        this.nameAndSurname = nameAndSurname;
        this.pesel = pesel;
        this.dateOfVisit = dateOfVisit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public LocalDate getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(LocalDate dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(nameAndSurname, client.nameAndSurname) && Objects.equals(pesel, client.pesel) && Objects.equals(dateOfVisit, client.dateOfVisit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameAndSurname, pesel, dateOfVisit);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nameAndSurname='" + nameAndSurname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", dateOfVisit=" + dateOfVisit +
                '}';
    }
}
