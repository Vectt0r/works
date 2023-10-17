public class Loja{
    //Atributos da Classe
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    //Metodo Contrutor 1 da Classe Loja
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario)
    {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    //Metodo Contrutor 2 da Classe Loja
    public Loja(String nome, int quantidadeFuncionarios)
    {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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

    public int getQuantidadeFuncionarios()
    {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios)
    {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario()
    {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario)
    {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    //Metodo de verificacao do total gasto com salario
    public double gastosComSalario()
    {
        if(salarioBaseFuncionario != - 1) {
            double salarioTotal = quantidadeFuncionarios * salarioBaseFuncionario;
            return salarioTotal;
        }
        else {
            return -1;
        }
    }

    //Metodo de Verificacao do tamanho da loja
    public char tamanhoDaLoja()
    {
        if(quantidadeFuncionarios < 10) {
            return 'P';
        }  
        else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';

        } 
        else {
            return 'G';
        }
    }

    //Metodo de Formatação de texto
    @Override
    public String toString()
    {
        return "Nome da loja: " + nome +
               "\nQuantidade de funcionários: " + quantidadeFuncionarios +
               "\nSalário base dos funcionários: " + salarioBaseFuncionario;
    }
}