import java.util.Scanner;

public class Principal {
    /* enunciado: escreva um programa que peça ao usuário 3 notas
    com uma casa decimal, que devem ser inseridas individualmente, exiba a média
    aritimética delas e exiba se APROVADO se a média for maior a 7,
    caso contrario exiba reprovado
     */
    public static void main (String[] args){
        Scanner entrada= new Scanner(System.in);
        System.out.println(" Nota 1: ");
        double nota1 = entrada.nextDouble();
        System.out.println(" Nota 2: ");
        double nota2 = entrada.nextDouble();
        System.out.println(" Nota 3: ");
        double nota3 = entrada.nextDouble();
        double media = (nota1 + nota2 + nota3)/3;
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
