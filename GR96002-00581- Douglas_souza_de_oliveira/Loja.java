public class Loja {
    //Atributos da Classe
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    //Metodo Contrutor 1 da Classe Loja
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    //Metodo Contrutor 2 da Classe Loja
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao ) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.salarioBaseFuncionario = -1;
    }

    //Metodos Get and Set
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

    //Metodo de FormataÃ§Ã£o de texto
    @Override
    public String toString(){
        return "Nome da loja: " + nome +
               "\nQuantidade de funcionarios: " + quantidadeFuncionarios +
               "\nSalário base dos funcionarios: " + salarioBaseFuncionario +
               "\nEndereço: " + endereco +
               "\nData de Fundação: " + dataFundacao;
    }
}