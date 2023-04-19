import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        valor1 = leia.nextDouble();
        System.out.println("Digite o segundo valor: ");
        valor2 = leia.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        valor3 = leia.nextDouble();

        System.out.println("Números na ordem em que foram digitados: ");
        System.out.println("\n1º - " + valor1 + "\n2º - " + valor2 + "\n3º - " + valor3);

        System.out.println("-----------------------------------------------------");

        System.out.println("Números na ordem crescente: ");
        if (valor1 > valor3){
            double temp = valor3;
            valor3 = valor1;
            valor1 = temp;
        }
        if (valor1 > valor2){
            double temp = valor2;
            valor2 = valor1;
            valor1 = temp;
        }
        if (valor2 > valor3){
            double temp = valor3;
            valor3 = valor2;
            valor2 = temp;
        }
        System.out.println("\n1º - " + valor1 + "\n2º - " + valor2 + "\n3º - " + valor3);

        System.out.println("-----------------------------------------------------");

        System.out.println("Números na ordem decrescente: ");
        if (valor1 < valor3){
            double temp = valor3;
            valor3 = valor1;
            valor1 = temp;
        }
        if (valor1 < valor2){
            double temp = valor2;
            valor2 = valor1;
            valor1 = temp;
        }
        if (valor2 < valor3){
            double temp = valor3;
            valor3 = valor2;
            valor2 = temp;
        }
        System.out.println("\n1º - " + valor1 + "\n2º - " + valor2 + "\n3º - " + valor3);


    }

}
