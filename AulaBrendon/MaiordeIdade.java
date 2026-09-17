import java.util.Scanner;

public class ContagemMaioresIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int qtdMaiores = 0;
        int idade;

        System.out.println("--- Sistema de Contagem de Maiores de Idade ---");
        System.out.println("Digite a idade das pessoas (informe um valor negativo para encerrar):");

        while (true) {
            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            if (idade >= 18) {
                qtdMaiores++;
            }
        }

        System.out.println("\n---------------------------------");
        System.out.println("Total de pessoas maiores de idade: " + qtdMaiores);
        System.out.println("---------------------------------");

        scanner.close();
    }
}