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

    // Método para inserir uma loja no array a partir da entrada, 'for' ultilizado para buscar um espaço null no array, caso bem sucedido retorna true caso contrario false
    public boolean insereLoja(Loja loja) {
        for(int i = 0; i < lojas.length; i++) {
            if(lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    // Método para remover uma loja, uma busca é feita no array a partir do nome de entrada, caso a loja exista, seu espaço no array sera setado como Null e retornara true
    public boolean removeLoja(String nome) {
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equals(nome)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    // Método para contar o número de lojas com um tipo específico (busca parcial do nome)
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int count = 0;
        
        // Transforma o tipoLoja em minúsculas e remove espaços em branco
        tipoLoja = tipoLoja.toLowerCase().trim();
            
        // Percorre o array de lojas e compara cada uma delas
        for (Loja loja : lojas) {
            if (loja != null) {
                // Transforma o nome da loja em minúsculas e remove espaços em branco
                String nomeLoja = loja.getNome().toLowerCase().trim();

                // Verifica se o nome da loja contém o termo de busca (busca parcial) caso sim é adicionado ao contador
                if (nomeLoja.contains(tipoLoja)) {
                    count++;
                }
            }
        }
        // Retorna o contador como numero de lojas encontradas
        return count;
    }

    // Método para encontrar a loja de informática com o seguro eletrônico mais caro
    public Informatica lojaSeguroMaisCaro() {

        Informatica lojaMaisCara = null;  // Inicializa uma variável para armazenar a loja mais cara
        double maiorValorSeguro = 0;  // Inicializa uma variável para armazenar o maior valor de seguro

        // Percorre o array de lojas
        for (Loja loja : lojas) {
            // Verifica se a loja é uma instância de Informatica (loja de informática)
            if (loja instanceof Informatica) {
                // Converte a loja para o tipo Informatica
                Informatica lojaInformatica = (Informatica) loja;
                
                // Compara o valor do seguro eletrônico da loja atual com o maior valor encontrado até agora
                if (lojaInformatica.getSeguroEletronicos() > maiorValorSeguro) {
                    // Atualiza a variável de loja mais cara com a loja atual
                    lojaMaisCara = lojaInformatica;
                    // Atualiza o maior valor de seguro encontrado até agora
                    maiorValorSeguro = lojaInformatica.getSeguroEletronicos();
                }
            }
        }
        // Retorna a loja de informática com o seguro eletrônico mais caro ou null se não houver nenhuma loja de informática
        return lojaMaisCara;
    }
}