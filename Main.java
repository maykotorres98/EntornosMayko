import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cantidad de usuarios:");
        int cantidad = teclado.nextInt();
        Usuario[] usuarios = crearUsuarios(cantidad); // Puedes cambiar el número a cualquiera
        mostrarUsuarios(usuarios);
    }

    public static Usuario[] crearUsuarios(int cantidad) {
        Scanner teclado = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[cantidad];
        for (int i = 0; i < cantidad; i++) {
            usuarios[i] = new Usuario();
            System.out.println("Introduce nombre del usuario " + (i + 1) + ": ");
            usuarios[i].nombre = teclado.nextLine();
            System.out.println("Introduce apellidos del usuario " + (i + 1) + ": ");
            usuarios[i].apellidos = teclado.nextLine();
            System.out.println("Introduce email del usuario " + (i + 1) + ": ");
            usuarios[i].email = teclado.nextLine();
        }
        return usuarios;
    }

    

    public static void mostrarUsuarios(Usuario[] usuarios) {
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Nombre: " + usuarios[i].nombre);
            System.out.println("Apellidos: " + usuarios[i].apellidos);
            System.out.println("Email: " + usuarios[i].email);
        }
    }








}

