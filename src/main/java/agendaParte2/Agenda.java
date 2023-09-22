package agendaParte2;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String, Contact> phoneBook = new HashMap<>();

    //Un constructor vacío como este es lo mismo que no poner nada
    //    public Agenda() {
    //    }


    public Map<String, Contact> getPhoneBook() {
        return phoneBook;
    }

    //NO SE USA, POR ESO ESTÁ COMENTADO
//    public void setAgenda(Map<String, Contact> agenda) {
//        this.agenda = agenda;
//    }

    public void showPhoneBook(){
        for (Map.Entry<String, Contact> e : this.getPhoneBook().entrySet()){
            System.out.println("DNI → "+ e.getKey() + " Contacto → " + e.getValue());
        }
    }

}
