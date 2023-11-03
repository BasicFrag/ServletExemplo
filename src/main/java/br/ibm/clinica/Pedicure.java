package br.ibm.clinica;

public class Pedicure extends Funcionario{

    public Pedicure(int id, String nome, String especializacao) {
        super(id, nome, especializacao);
    }
    public Pedicure() {

    }
    @Override
    public String tipoServico(String nomeServico) {
        return getNome() + "é profissional em vários procedimentos com os pês, se especializando em " + getEspecializacao() + " e "+ nomeServico;
    }
}
