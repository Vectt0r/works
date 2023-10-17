public class Produto {
    //Atributos da Classe Produto
    private String nome;
    private double preco;

    //Metodo Contrutor da Classe Produto
    public Produto(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    //Metodos Get and Set
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    //Metodo de Formatacao de texto
    @Override
    public String toString() 
    {
        return "Nome do Produto: " + nome +
               "\nPreço do Produto: " + preco;
    }
}
