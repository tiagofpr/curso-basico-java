package EstruturaControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        //calcular a media das notas dos alunos.
        //notas de 0 a 10
        //armazenar na variavel total
        //armazenar na variavel válida as notas validas
        //para sair deve digitar -1

        Scanner e = new Scanner(System.in);
        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1){
            System.out.println("Digite a nota do Aluno ou -1 para sair : ");
            nota = e.nextDouble();

        if (nota <= 10 && nota >= 0) {
            total += nota;
            quantidadeDeNotas++;
        } else if (nota != -1) {
            System.out.println("Nota Inválida!");
        }
    }
        //calcular a media
        double media = total / quantidadeDeNotas;
        System.out.println("Média = " + media);
        System.out.println("O Total de notas válidas foi: " + quantidadeDeNotas);

        e.close();
    }


}
