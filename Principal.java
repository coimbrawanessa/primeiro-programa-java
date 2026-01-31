import java.util.Scanner;

public class Principal {
   //enunciado: escreva um programa que peça ao usuário o seu  nome e 3 notas com uma casa decimal,
   // que devem ser inseridas individualmente e exiba a média aritimética delas.

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




    }
}
