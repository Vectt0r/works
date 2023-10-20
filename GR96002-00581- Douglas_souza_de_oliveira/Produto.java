public class Produto {
    //Atributos da Classe Produto
    private String nome;
    private double preco;
    private Data dataValidade;

    //Metodo Contrutor da Classe Produto
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    //Metodos Get and Set
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataAtual) {
    // Comparar a data de validade com a data atual operador || 'or'
        return dataValidade.getAno() < dataAtual.getAno() ||
               (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() < dataAtual.getMes()) ||
               (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() == dataAtual.getMes() && dataValidade.getDia() < dataAtual.getDia());
    }
    
    //Metodo de Formatacao de texto
    @Override
    public String toString(){
        return "Nome do Produto: " + nome +
               "\nPreço do Produto: " + preco +
               "\nData de Validade" + dataValidade;
    }
}
