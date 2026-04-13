import java.util.Arrays;

public class CopaOrdenada {

    public static void main(String[] args) {

        String[] paises = {
            "Canadá", "Estados Unidos", "México",
            "Arábia Saudita", "Austrália", "Catar", "Coreia do Sul",
            "Irã", "Iraque", "Japão", "Jordânia", "Uzbequistão",
            "África do Sul", "Argélia", "Cabo Verde", "Costa do Marfim",
            "Egito", "Gana", "Marrocos", "RD do Congo", "Senegal", "Tunísia",
            "Argentina", "Brasil", "Colômbia", "Equador", "Paraguai", "Uruguai",
            "Nova Zelândia",
            "Alemanha", "Áustria", "Bélgica", "Bósnia e Herzegovina", "Croácia",
            "Escócia", "Espanha", "França", "Holanda", "Inglaterra", "Noruega",
            "Portugal", "República Tcheca", "Suécia", "Suíça", "Turquia",
            "Curaçau", "Haiti", "Panamá"
        };

        // Ordem alfabética
        Arrays.sort(paises);

        System.out.println("========================================");
        System.out.println("   Países da Copa 2026 - Ordem Alfabética");
        System.out.println("========================================");
        for (int i = 0; i < paises.length; i++) {
            System.out.println("  " + (i + 1) + ". " + paises[i]);
        }

        // Ordem inversa
        System.out.println("\n========================================");
        System.out.println("   Países da Copa 2026 - Ordem Inversa");
        System.out.println("========================================");
        for (int i = paises.length - 1; i >= 0; i--) {
            System.out.println("  " + (paises.length - i) + ". " + paises[i]);
        }

        System.out.println("========================================");
        System.out.println("  Total de países: " + paises.length);
        System.out.println("========================================");
    }
}
