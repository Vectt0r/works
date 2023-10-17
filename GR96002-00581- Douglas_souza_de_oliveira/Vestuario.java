public class Vestuario extends Loja{
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
    // Chama o construtor da classe pai (Loja)
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    private char testaLoja() {
        return produtosImportados ? 'S' : 'N';
    }

    @Override
    public String toString() {
        return super.toString() + "\nVende Produtos Importados? " + testaLoja();
    }
}
