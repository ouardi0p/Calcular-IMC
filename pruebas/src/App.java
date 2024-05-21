import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Dime cual es tu altura");
        Float altura = sc.nextFloat();
        System.out.println("Dime cual es tu peso");
        Float peso = sc.nextFloat();

        Float imc = peso / (altura *altura);
        System.out.println("Tu IMC es: "+imc);
       
    }

    
}
