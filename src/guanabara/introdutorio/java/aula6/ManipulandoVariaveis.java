package guanabara.introdutorio.java.aula6;

import java.util.Scanner;

public class ManipulandoVariaveis {
    public static void main(String[] args) {
//      Exemplo 1 - Atribuindo a diretamente a Variável
            String aluno = "Rogerio";
            float nota1 = 3.59f;
            System.out.println("Sua nota é: " + nota1);
            System.out.printf("A nota de %s é %.2f\n", aluno, nota1);

//      Exemplo 2 - Lendo o teclado
            Scanner teclado = new Scanner(System.in);
            System.out.println("Qual o nome do aluno?");
            String aluno2 = teclado.nextLine();
            System.out.printf("Qual a nota do %s?\n", aluno2);
            float nota2 = teclado.nextFloat();
            System.out.printf("A nota de %s é %.2f", aluno2, nota2);
    }
}