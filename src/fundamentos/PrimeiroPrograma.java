package fundamentos;


import java.util.Scanner;

public class PrimeiroPrograma {

   //public static void main(String [] args ){
     //  System.out.println("Ola Mundo!!");   }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String input = "";
        while (!"q".equalsIgnoreCase(input)){

            System.out.print("Enter something (q to quit): ");

            input = scanner.nextLine();
            System.out.println("input :" + input);
        }
        System.out.println("bye bye!");
    }
    }
