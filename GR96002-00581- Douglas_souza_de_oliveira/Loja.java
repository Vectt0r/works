import java.util.Arrays;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[capacidadeEstoque];
    }

    //Metodo Contrutor 2 da Classe Loja
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int capacidadeEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto[capacidadeEstoque];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    //Metodo de verificacao do total gasto com salario
    public double gastosComSalario() {
        if(salarioBaseFuncionario != - 1){
            double salarioTotal = quantidadeFuncionarios * salarioBaseFuncionario;
            return salarioTotal;
        }
        else {
            return -1;
        }
    }

    //Metodo de Verificacao do tamanho da loja
    public char tamanhoDaLoja() {
        if(quantidadeFuncionarios < 10){
            return 'P';
        }  
        else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30){
            return 'M';

        } 
        else {
            return 'G';
        }
    }

    // Método para obter o estoque de produtos da loja
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    // Método para imprimir os produtos no estoque da loja
    public void imprimeProdutos() {
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }

    // Método para inserir um produto no estoque da loja
    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    // Método para remover um produto do estoque da loja com base no nome
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    //Metodo de Formatação de texto
    @Override
    public String toString() {
        return "Nome da loja: " + nome +
               "\nQuantidade de funcionarios: " + quantidadeFuncionarios +
               "\nSalário base dos funcionarios: " + salarioBaseFuncionario +
               "\nEndereço: " + endereco +
               "\nData de Fundação: " + dataFundacao +
               "\nEstoque de Produtos: " + Arrays.toString(estoqueProdutos);
    }
}