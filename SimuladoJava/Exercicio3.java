import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

       int numero = 0;
       int nPositivos = 0;
       int nNegativos = 0;
       int soma = 0;
       int somaNegativos = 0;
       int somaPosiivos = 0;
       int n = 0;

       Scanner leia = new Scanner(System.in);

       System.out.println("Digite quantos números quer colocar no programa: ");
       n = leia.nextInt();

       for(int i = 1; i <= n; i++){
           System.out.println("Digite um número: ");
           numero = leia.nextInt();

           //Ver se eh positivo ou negativo
           if (numero < 0){
                nNegativos += numero;
            } else{
                nPositivos += numero;
            }

           soma = nPositivos + nNegativos;

       }

        System.out.println("Soma dos números Positivos: " + nPositivos);
        System.out.println("Soma dos números Negativos: " + nNegativos);
        System.out.println("SOma de tudo: " + soma);

    }

}
