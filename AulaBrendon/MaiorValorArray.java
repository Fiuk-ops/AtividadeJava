public class MaiorValorArrayFixo {
    public static void main(String[] args) {
        double[] valores = { 15.5, 42.0, 8.3, 99.1, 23.4 };
        
        System.out.println("--- Identificação do Maior Valor (Valores Fixos) ---");
        
        System.out.print("Valores no array: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();

        double maiorValor = valores[0];

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
            }
        }

        System.out.println("---------------------------------");
        System.out.println("O maior valor encontrado foi: " + maiorValor);
        System.out.println("---------------------------------");
    }
}