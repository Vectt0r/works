public class Shopping {
    public String nome;
    public Endereco endereco;
    public Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int numeroLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[numeroLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    // M�todo para inserir uma loja no array a partir da entrada, 'for' ultilizado para buscar um espa�o null no array, caso bem sucedido retorna true caso contrario false
    public boolean insereLoja(Loja loja) {
        for(int i = 0; i < lojas.length; i++) {
            if(lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    // M�todo para remover uma loja, uma busca � feita no array a partir do nome de entrada, caso a loja exista, seu espa�o no array sera setado como Null e retornara true
    public boolean removeLoja(String nome) {
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equals(nome)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    // M�todo para contar o n�mero de lojas com um tipo espec�fico (busca parcial do nome)
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int count = 0;
        
        // Transforma o tipoLoja em min�sculas e remove espa�os em branco
        tipoLoja = tipoLoja.toLowerCase().trim();
            
        // Percorre o array de lojas e compara cada uma delas
        for (Loja loja : lojas) {
            if (loja != null) {
                // Transforma o nome da loja em min�sculas e remove espa�os em branco
                String nomeLoja = loja.getNome().toLowerCase().trim();

                // Verifica se o nome da loja cont�m o termo de busca (busca parcial) caso sim � adicionado ao contador
                if (nomeLoja.contains(tipoLoja)) {
                    count++;
                }
            }
        }
        // Retorna o contador como numero de lojas encontradas
        return count;
    }

    // M�todo para encontrar a loja de inform�tica com o seguro eletr�nico mais caro
    public Informatica lojaSeguroMaisCaro() {

        Informatica lojaMaisCara = null;  // Inicializa uma vari�vel para armazenar a loja mais cara
        double maiorValorSeguro = 0;  // Inicializa uma vari�vel para armazenar o maior valor de seguro

        // Percorre o array de lojas
        for (Loja loja : lojas) {
            // Verifica se a loja � uma inst�ncia de Informatica (loja de inform�tica)
            if (loja instanceof Informatica) {
                // Converte a loja para o tipo Informatica
                Informatica lojaInformatica = (Informatica) loja;
                
                // Compara o valor do seguro eletr�nico da loja atual com o maior valor encontrado at� agora
                if (lojaInformatica.getSeguroEletronicos() > maiorValorSeguro) {
                    // Atualiza a vari�vel de loja mais cara com a loja atual
                    lojaMaisCara = lojaInformatica;
                    // Atualiza o maior valor de seguro encontrado at� agora
                    maiorValorSeguro = lojaInformatica.getSeguroEletronicos();
                }
            }
        }
        // Retorna a loja de inform�tica com o seguro eletr�nico mais caro ou null se n�o houver nenhuma loja de inform�tica
        return lojaMaisCara;
    }
}