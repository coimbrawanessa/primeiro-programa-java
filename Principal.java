import java.util.Scanner;

public class Principal {
    /* enunciado: escreva um programa que peça ao usuário 3 notas
    com uma casa decimal, que devem ser inseridas individualmente, exiba a média
    aritimética delas e exiba se APROVADO se a média for maior a 7,
    caso contrario exiba reprovado
     */
    public static void main (String[] args){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Inserir quantidade de notas");
        int qtdNotas = entrada.nextInt();
        double[] notas= new double[qtdNotas];

        double somatorio =0;
        for(int posicao = 0; posicao < qtdNotas; posicao++){
            int ordemNota = posicao + 1;
            System.out.println("Insira nota "+ordemNota);
            notas[posicao] =entrada.nextDouble();
            somatorio = somatorio + notas[posicao];
        }

        double media = (somatorio)/ qtdNotas;
        System.out.println("a média das notas é: " + media);
        if (media >7 ){
            System.out.println(" Aprovado ");
        } else if(media >=5){
            System.out.println(" Em recuperação!!!!! ");
        }
        else {
            System.out.println(" REPROVADO ");
        }




    }
}
