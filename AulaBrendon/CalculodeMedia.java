import java.util.Scanner;

public class AulaBrendon {

    public static double calcularMedia(double n1, double n2, double n3) {
        double soma = n1 + n2 + n3;
        double media = soma / 3;
        return media; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Média com Métodos ---");
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double resultadoFinal = calcularMedia(nota1, nota2, nota3);

        System.out.printf("\nA média final é: %.2f\n", resultadoFinal);

        scanner.close();
    }
}