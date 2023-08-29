public class ExemploAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Pedro", 25, "Licenciatura em Computação");
        Aluno aluno2 = new Aluno("Daiana", 19, "Sistemas de Informação");

        aluno1.apresentar();
        aluno2.apresentar();
    }
}