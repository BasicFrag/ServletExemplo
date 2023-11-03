package br.ibm;

import br.ibm.clinica.*;



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet({"/spa","/erro"})
public class ClinicaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {


            Manicure roberta = new Manicure();
        Manicure joan = new Manicure();
        Pedicure marcia = new Pedicure();
        Pedicure vanda = new Pedicure();
        Spa spa = new Spa();

        roberta.setId(1);
        roberta.setNome("Roberta");
        roberta.setEspecializacao("Aplicação de unhas de gel");
        roberta.tipoServico("Alogamento de unha");
        roberta.precoServico(200);

        joan.setId(2);
        joan.setNome("Joan");
        joan.setEspecializacao("Esmaltação infantil");
        joan.tipoServico("Unhas magnéticas");
        joan.precoServico(100);

        marcia.setId(3);
        marcia.setNome("Marcia");
        marcia.setEspecializacao("Francesinha");
        marcia.tipoServico("Francesinha");
        marcia.precoServico(120);

        vanda.setId(4);
        vanda.setNome("Vanda");
        vanda.setEspecializacao("Blindagem de unhas");
        vanda.precoServico(400);


        List<Funcionario> listaTodosOsFuncionarios = spa.getAll();
        List<Funcionario> listaPedicures = spa.getPedicures();

           List <String> listaFuncionarios = new ArrayList<>();
           listaFuncionarios.add(roberta.getNome() + ", " + roberta.getEspecializacao() );
           listaFuncionarios.add(joan.getNome() + ", " + joan.getEspecializacao());
           listaFuncionarios.add(marcia.getNome() + ", " + marcia.getEspecializacao());
           listaFuncionarios.add(vanda.getNome() + ", " + vanda.getEspecializacao());
           System.out.println(listaFuncionarios);




           request.setAttribute("listaFuncionarios",listaFuncionarios);
           request.getRequestDispatcher("index.jsp").forward(request,response);



    }

}
