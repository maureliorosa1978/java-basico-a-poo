javapublic class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibir() {
        System.out.println("=============================");
        System.out.println("  Nome: " + nome);
        System.out.println("  Idade: " + idade + " anos");
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Marco", 47);
        p.exibir();
    }
}
