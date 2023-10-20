public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor que inicializa os atributos e verifica se a data √© v√°lida
    public Data(int dia, int mes, int ano) 
    {
        if (verificaDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } 
        else {
            System.out.println("Data inv√°lida. Definindo a data para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // MÈtodo para verificar se o ano È bissexto
    public boolean verificaAnoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        }
        return false;
    }

    // MÈtodo privado para verificar se a data v·lida
    public boolean verificaDataValida(int dia, int mes, int ano) {
        if (ano < 0 || mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return false;
        }

        // Verifica meses com menos de 31 dias
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30){
                return false;
            }
        }

        // Verifica fevereiro e anos bissextos // 
        if (mes == 2) {
            if (verificaAnoBissexto()) {
                if (dia > 29) {
                    return false;
                }
            }
            else {
               if (dia > 28) {
                    return false;
                }
            }
        }
        return true;
    }

    public int getDia() {       
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // MÈtodo toString para representar a data no formato dia/mes/ano
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}