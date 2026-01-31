import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Scanner entrada= new Scanner(System.in);
        System.out.println("escreva o seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Qual seu dia de nascimento?");
        int dia = entrada.nextInt();
        System.out.println("Qual seu mês de nascimento?");
        int mes = entrada.nextInt();
        System.out.println("Qual seu ano de nascimento?");
        int ano = entrada.nextInt();
        System.out.println("Qual seu peso?");
        double peso = entrada.nextDouble();
        System.out.println("Qual sua altura?");
        double altura = entrada.nextDouble();
        System.out.println("hello world " + nome + "!");
        System.out.println("Você nasceu dia " + dia + "/" + mes + "/" + ano );
        System.out.println("seu peso é " + peso + " e sua altura é " + altura );

    }
}
