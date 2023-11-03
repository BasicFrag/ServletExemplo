package br.ibm.clinica;

public class Manicure extends Funcionario {


    public Manicure(int id, String nome, String especializacao) {
        super(id, nome, especializacao);
    }

    public Manicure() {
        super();
    }

    @Override
    public String tipoServico(String nomeServico) {
        return getNome() + " é profissional em vários procedimentos com as mãos, se especializando em " + getEspecializacao() + " e " + nomeServico;
    }


}
