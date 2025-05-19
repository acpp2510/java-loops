import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber
        int num = 0;
        while (num!=7){
            num=getRandomNumber(7);
            System.out.println(num);
        }
        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        int num2 = 0;
        while (num2<=70){
            num2=getRandomNumber(100);
            System.out.println(num2);
        }
        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber
        Scanner scanner= new Scanner(System.in);
        int numRandom =getRandomNumber(101);
        int numUser;
        System.out.println("Adivina un número entre 1 y 100.");

        System.out.println();

        do {
            System.out.println("Ingresa el número con el que te gustaría probar: ");
            numUser= scanner.nextInt();
            if (numUser==numRandom){
                System.out.println("Felicitaciones hasta acertado!!");
            } else if (numUser<numRandom) {
                System.out.println("El número indicado es menor al deseado");
            } else {
                System.out.println("El número indicado es mayor al deseado");
            }
        } while( numRandom != numUser);


    
    }

    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){
        return (int)(Math.random() * number) + 1;
    }

}
