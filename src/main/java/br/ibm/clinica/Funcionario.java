package br.ibm.clinica;

public class Funcionario implements IServicos{
    private  int id;
    private   String nome;
    private  String especializacao;

    public Funcionario(int id, String nome, String especializacao) {
        this.id = id;
        this.nome = nome;
        this.especializacao = especializacao;
    }
    public Funcionario() {

    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }


    public String tipoServico(String nome){
        return String.format("Nossos funcionários providenciam os mais diferentes serviços, inclusive %s", nome);
    }

    public String tempoServico(int tempo) {

        return "O tempo do serviço pode demorar até " + tempo + " minutos";
    }


    public String precoServico(double preco) {
        return String.format("O preço do serviço é de %.2f",preco);
    }


    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especializacao='" + especializacao + '\'' +
                '}';
    }

}
