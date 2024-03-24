import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);


        System.out.println("Cual es tu edad?");
        int edad = myObj.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
            int i;
            for (i = 10; i < 0; i--) {
                System.out.println(i);
            }
        }else {
            System.out.println("Eres menor de edad");
        }

    }

    private static void bomba() {
        int i;
        
//        System.out.println("BOOM");
//        return i;
    }
}