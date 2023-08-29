class Aluno {
    String nome;
    int idade;
    String curso;

    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + ", tenho " + idade + " anos e estudo " + curso + ".");
    }
}

