package br.ibm.clinica;

public interface IServicos {
    String tipoServico(String nome);
    String tempoServico(int tempo);
    String precoServico(double preco);

}
