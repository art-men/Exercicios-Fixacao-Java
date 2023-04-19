import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int respSim =0;
        int respNao = 0;
        int masculino =0;
        int feminino = 0;
        String sexo;
        int respMascSim = 0;
        int respMascNao = 0;
        int respFemSim = 0;
        int respFemNao = 0;
        String resposta;


        Scanner leia = new Scanner(System.in);

        for (int i = 1; i<=10; i++) {
            System.out.println("Por favor nos infprme seu sexo:");
            System.out.println("Digite M para masculino e F para feminino");
            sexo = leia.next();

            //Validacao sexo
            if (sexo.equalsIgnoreCase("M")){
                masculino = 1;
                feminino = 0;
            } else {
                if (sexo.equalsIgnoreCase("F")){
                    feminino = 1;
                    masculino = 0;
                }
            }

            //Validacao Respostas
            System.out.println("Referente a pesquisa da empresa, responda \nS para sim e N para não");
            resposta = leia.next();

            if (resposta.equalsIgnoreCase("S") && masculino ==1){
                respMascSim += 1;
                respSim += 1;
            } else if (resposta.equalsIgnoreCase("N") && masculino ==1){
                respMascNao += 1;
                respNao += 1;
            } else if (resposta.equalsIgnoreCase("S") && feminino ==1) {
                respFemSim += 1;
                respSim += 1;
            } else if (resposta.equalsIgnoreCase("N") && feminino ==1) {
                respFemNao += 1;
                respNao += 1;
            }
        }

        // Exiber Respostas
        System.out.println("Tivemos " + respMascSim + " respostas SIM de HOMENS");
        System.out.println("Tivemos " + respMascNao + " respostas NÃO de HOMENS");
        System.out.println("Tivemos " + respFemSim + " respostas SIM de MULHERES");
        System.out.println("Tivemos " + respFemNao + " respostas NÃO de MULHERES");
        System.out.println("Tivemos " + respSim + " respostas SIM (juntando os sexos)");
        System.out.println("Tivemos " + respNao + " respostas NÃO (juntando os sexos)");




        }
    }

