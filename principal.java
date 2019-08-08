import java.util.Scanner;

public class principal extends pessoa{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        pessoa pessoas = new pessoa();
        pessoas.setNome(input.nextLine());
        pessoas.setIdade(Integer.parseInt(input.nextLine()));

        System.out.print("\nNome: " + pessoas.getNome() + ", idade: " + pessoas.getIdade() + " anos, ");
        pessoas.falar();
    }
}