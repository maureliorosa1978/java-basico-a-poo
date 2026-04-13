public class CalculadoraIMC {

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Baixo peso";
        } else if (imc <= 24.9) {
            return "Peso normal";
        } else if (imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public static void exibirResultado(double peso, double altura) {
        double imc = calcularIMC(peso, altura);
        System.out.println("=============================");
        System.out.printf("  Peso:          %.1f kg%n", peso);
        System.out.printf("  Altura:        %.2f m%n", altura);
        System.out.printf("  IMC:           %.2f%n", imc);
        System.out.println("  Classificação: " + classificarIMC(imc));
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        exibirResultado(80, 1.75);
    }
}
