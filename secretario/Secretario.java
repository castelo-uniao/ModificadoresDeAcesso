public class Secretario {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        // Isso não funciona!!!
        // aluno1.nome = "teste";

        // Isso funciona:
        aluno1.setNome("teste");
        System.out.println(aluno1.getNome());

        aluno1.setRepetente(true);

        System.out.println("O aluno é repetente? " + aluno1.isRepetente());

    }
}