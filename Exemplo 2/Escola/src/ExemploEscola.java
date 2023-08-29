public class ExemploEscola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João Pedro", 25, "Licenciatura em Computação");
        Professor professor = new Professor("Augusto", 60, "Matematica");

        Pessoa pessoa1 = aluno;
        Pessoa pessoa2 = professor;

        pessoa1.apresentar();
        pessoa2.apresentar();

        pessoa1 = new Professor("Alisson", 40, "Engenharia de Software");
        pessoa1.apresentar();
    }
}
