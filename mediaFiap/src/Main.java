import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner leitor= new Scanner(System.in);

    //ler os dados do aluno (Nome, RM, e notas)

        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.next() + leitor.nextLine() ;

        System.out.println("Digite o RM do aluno: ");
        int RM = leitor.nextInt();

        System.out.println("Qual a nota do checkpoint  1 do aluno? Digite: ");
        float cp1 = leitor.nextFloat();

        System.out.println("Qual a nota do checkpoint  2 do aluno? Digite: ");
        float cp2 = leitor.nextFloat();

        System.out.println("Qual a nota do checkpoint  3 do aluno? Digite: ");
        float cp3 = leitor.nextFloat();

        System.out.println("Qual a nota do globalSolution deste aluno? Digite: ");
        float GS = leitor.nextFloat();

        System.out.println("Qual a nota do challenge deste aluno? Digite: ");
        float challenge = leitor.nextFloat();

        //criar um objeto aluno
        Aluno aluno = new Aluno();

        //alocando dados no objeto
        aluno.nome = nome;
        aluno.RM = RM;
        aluno.cp1 = cp1;
        aluno.cp2 = cp2;
        aluno.cp3 = cp3;
        aluno.GS = GS;
        aluno.challenge = challenge;

        aluno.calcularMedia();

        System.out.println("RM" + aluno.RM);
        System.out.println("A nota do " + aluno.nome + " é:"  + aluno.calcularMedia());


    }
}