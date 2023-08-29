class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }
    public void apresentar() {
        System.out.println("Olá! Sou o professor " + getNome() + ", tenho " + getIdade() + " anos e leciono " + disciplina + ".");
    }

    public void ensinar() {
        System.out.println(getNome() + " está ensinando a disciplina de " + disciplina + ".");
    }
}
