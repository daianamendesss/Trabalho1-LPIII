class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá! Sou o aluno " + getNome() + ", tenho " + getIdade() + " anos e estudo " + curso + ".");
    }

    public void estudar() {
        System.out.println(getNome() + " está estudando no curso de " + curso + ".");
    }
}
