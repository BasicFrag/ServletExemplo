package br.ibm.clinica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Spa {

    private List<Funcionario> funcionarios;
    private Funcionario funcionario;
    private Manicure manicure;
    private Pedicure pedicure;

    public Spa() {
        this.funcionarios = new ArrayList<>();
    }

    public List<Funcionario> getAll() {
        while (funcionario != null) {
            funcionarios.add(funcionario);
        }
        return funcionarios;
    }
    public List<Funcionario> getManicures() {
        return getAll().stream()
                .filter(funcionario ->funcionario instanceof Manicure)
                .peek(debug -> System.out.println("Add" + manicure.getNome()))
                .collect(Collectors.toList());

    }

    public List<Funcionario> getPedicures() {
        return funcionarios.stream()
                .filter(funcionario -> funcionario instanceof Pedicure)
                .collect(Collectors.toList());
    }
    public Funcionario getPedicureById(int id) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario instanceof Pedicure && pedicure.getId() == id)
                .findAny().get();
    }
    public Funcionario getManicureById(int id) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario instanceof Manicure && manicure.getId() == id)
                .findFirst().orElse(null);


    }
}