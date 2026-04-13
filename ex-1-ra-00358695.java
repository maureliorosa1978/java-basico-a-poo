public class Pessoa {
    private String nome;
    private int idade;
    private String ra;

    public Pessoa(String nome, int idade, String ra) {
        this.nome = nome;
        this.idade = idade;
        this.ra = ra;
    }

    public void apresentar() {
        System.out.println("=============================");
        System.out.println("  Olá! Eu sou " + nome + ".");
        System.out.println("  Tenho " + idade + " anos.");
        System.out.println("  Meu RA: " + ra);
        System.out.println("=============================");
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getRa() { return ra; }
    public void setRa(String ra) { this.ra = ra; }

    // Exemplo de uso
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Marco", 47, "00358695");
        p.apresentar();
    }
}

