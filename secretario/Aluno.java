public class Aluno {

    // Essas variáveis (private) somente são acessíveis dentro desta classe
    private String nome;
    private boolean repetente;
    //

    // Esse método é usado para acessar a variável privada nome
    public String getNome()
    {
        return nome;
    }

    public void setNome(String n)
    {
        nome = n;
    }

    public boolean isRepetente()
    {
        return repetente;
    }

    public void setRepetente(Boolean r)
    {
        repetente = r;
    }
}