package agendaParte2;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private String surname;
    private String city;
    private int zipCode;
    private List<String> phoneList = new ArrayList<>();
    private String mainNumber;
    private String dni;

    public Contact(String name, String surname, String city, int zipCode, String document) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.zipCode = zipCode;
        this.dni = document;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public List<String> getPhoneList() {
        return phoneList;
    }

    public String getMainNumber() {
        return mainNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setPhoneList(List<String> phoneList) {
        this.phoneList = phoneList;
    }

    public void setMainNumber(String mainNumber) {
        this.mainNumber = mainNumber;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void addNumber(String number) {
        this.getPhoneList().add(number);
        if (this.getMainNumber() == null){
            this.setMainNumber(number);
        }
    }

    public void phoneCall(Contact ctc) {
        System.out.println(this.getName() + " " + this.getSurname() + " llama a " + ctc.getName() + " " + ctc.getSurname() + " (" + ctc.getMainNumber() + ")");
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                ", phoneList=" + phoneList +
                ", mainNumber='" + mainNumber + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

}
