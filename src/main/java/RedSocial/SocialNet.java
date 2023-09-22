package RedSocial;

import java.util.ArrayList;
import java.util.List;

public class SocialNet {

    private List<Users> userList = new ArrayList<>();

    public static void main(String[] args) {
        SocialNet sn = new SocialNet();
        sn.populateSocialNet();
        sn.init();
    }

    private void init() {
        int option = 0;
        do {
            System.out.println("Bienvenido a SocialNet");
            System.out.println("1. Registrarme");
            System.out.println("2. Acceder");
            System.out.println("0. Salir");
            option = Utils.integer("Selecciona la opción deseada: ");
            switch (option) {
                case 1:
                    this.register();
                    break;
                case 2:
                    this.access();
                    break;
                default:
                    break;
            }
        }while(option != 0);
    }


    private void register() {
        String username = Utils.string("Introduce el nombre del nuevo usuario: ");
        Users user = new Users(username);
        this.getUserList().add(user);

    }

    private void populateSocialNet() {
        Users u1 = new Users("Fabricio");
        Users u2 = new Users("Henry");
        Users u3 = new Users("Gabriel");
        this.getUserList().add(u1);
        this.getUserList().add(u2);
        this.getUserList().add(u3);

    }

    public List<Users> getUserList() {
        return userList;
    }

    private void access(){
        int option = 0;
        do {
            System.out.println("****************************");
            System.out.println(" Bienvenido a la SocialNet ");
            System.out.println("****************************");
            System.out.println("0. Retroceder");
            System.out.println("1. Añadir post");
            System.out.println("2. Comentar post");
            System.out.println("3. Listar post de usuario");
            System.out.println("4. Listar comentarios de usuarios");
            System.out.println("5. Listar post de otros usuarios");
            System.out.println("6. Gestionar contacto (posts, comentarios, cuenta)");

            option = Utils.integer("Selecciona la opción deseada: ");

            switch (option) {
                case 0:
                    break;
                case 1:
                    this.addPost();
                    break;
                case 2:
                    this.commentPost();
                    break;
                case 3:
                    this.ListMyPost();
                    break;
                case 4:
                    this.viewCommentsOtherUser();
                    ;
                    break;
                case 5:
                    this.listingPostOtherUsers();
                    break;
                case 6:
                    this.workContacts();
                    break;

            }
        } while (option != 0);

    }
        private void ListMyPost () {
    }

        private void viewCommentsOtherUser () {
    }

        private void listingPostOtherUsers () {
    }

        private void workContacts () {
    }

        private void addPost () {
    }
        private void commentPost () {
    }
    }