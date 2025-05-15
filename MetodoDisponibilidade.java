import javax.swing.*;
import java.util.ArrayList;

public class MetodoDisponibilidade(ArrayList titulos, ArrayList statusLivros){

    if(titulos.isEmpty()){

        JOptionPane.showMessageDialog(null,"Não há livros no momento.");

    }

                else {
        int disponiveis = 0;
        int alugados = 0;

        for (int i = 0; i < titulos.size(); i++) {

            if (statusLivros.get(i).equalsIgnoreCase("Disponível")) {

                disponiveis++;

            } else if (statusLivros.get(i).equalsIgnoreCase("Emprestado")) {

                alugados++;

            }

        }

        JOptionPane.showMessageDialog(null, String.format("Atualmente temos:\nLivros disponíveis: %s\nLivros alugados: %s\nTotal de livros: %s"
                ,disponiveis,alugados,titulos.size()));


    }

}
