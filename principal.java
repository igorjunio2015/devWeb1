import java.util.Scanner;
import java.lang.StringBuilder;

public class principal extends pessoa{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        pessoa pessoas = new pessoa();
        pessoas.setNome(input.nextLine());
        pessoas.setIdade(Integer.parseInt(input.nextLine()));

        pessoa pessoasNew = new pessoa();
        pessoasNew.setNome(input.nextLine());
        pessoasNew.setIdade(Integer.parseInt(input.nextLine()));

        StringBuilder nome1 = new StringBuilder();
        StringBuilder nome2 = new StringBuilder();
        nome1.append("\nNome: ").append(pessoas.getNome()).append(", idade: ").append(pessoas.getIdade()).append(" anos, ");
        nome2.append("\nNome: ").append(pessoasNew.getNome()).append(", idade: ").append(pessoasNew.getIdade()).append(" anos, ");


        System.out.print(nome1.toString());
        pessoas.falar();
        System.out.print(nome2.toString());
        pessoasNew.falar();
    }
}