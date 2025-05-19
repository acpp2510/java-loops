import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, escribe un bucle que siga ejecutándose y devuelva 'Datos incorrectos por favor vuelve a intentar' mientras el nombre de usuario o la contraseña sean incorrectos.
        //Cuando el usuario y la constraseña sean correctos imprime en terminal: ¡Acceso concedido!

        String correctUsername = "Pepita";
        String correctPassword = "pepi123";
        String userName;
        String password;

        do {
            Scanner scanner= new Scanner(System.in);
            System.out.print("Ingresa tu nombre de usuario: "+ "\t");
            userName = scanner.nextLine();
            System.out.print("Ingresa tu contraseña: "+ "\t");
            password = scanner.nextLine();
                if (correctUsername.equals(userName) && correctPassword.equals(password)){
                    System.out.println("¡Acceso concedido!");
                } else System.out.println("Datos incorrectos");
        } while (!correctUsername.equals(userName) && !correctPassword.equals(password));
    }
}
