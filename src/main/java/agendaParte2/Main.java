package agendaParte2;

public class Main {

    public static void main(String[] args) {
        Agenda ag = new Agenda();
        Contact ctc1 = new Contact("Fabricio","Figueroa","Maracaibo",36720, "11223344A");
        Contact ctc2 = new Contact("Pedro", "Picapiedra", "Rocápolis", 963852, "22334455B");
        Contact ctc3 = new Contact("Pablo","Marmol","Rocapolis",333666, "33445566C");
        ctc1.addNumber("986112233");
        ctc1.addNumber("886223344");
        ctc1.addNumber("666554433");
        ctc2.addNumber("622619717");
        ctc2.addNumber("911132017");
        ctc3.addNumber("123123123");
        ctc3.addNumber("234234234");
        ctc3.addNumber("567567567");
        //ctc2.phoneCall(ctc3);
        ag.getPhoneBook().put(ctc1.getDni(),ctc1);
        ag.getPhoneBook().put(ctc2.getDni(),ctc2);
        ag.getPhoneBook().put(ctc3.getDni(),ctc3);

        //ag.getPhoneBook().get("22334455B").phoneCall(ag.getPhoneBook().get("33445566C"));

        Contact ctc20 = ag.getPhoneBook().get("22334455B");
        Contact ctc40 = ag.getPhoneBook().get("33445566C");
        //ctc20.phoneCall(ctc40);

        ag.showPhoneBook();

    }
}
