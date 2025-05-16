import javax.swing.*;
import java.util.ArrayList;

public class MetodoDisponibilidade {

    public static void disponiveisEmprestados(ArrayList<String> titulos, ArrayList<String> status) {

        if (titulos.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Não há livros cadastrados.");

        }

        else {
            int disponiveis = 0;
            int alugados = 0;

            for (int i = 0; i < titulos.size(); i++) {

                if (status.get(i).equalsIgnoreCase("Disponível")) {

                    disponiveis++;

                } else if (status.get(i).equalsIgnoreCase("Emprestado")) {

                    alugados++;

                }

            }

            JOptionPane.showMessageDialog(null,
                    String.format(
                            "Atualmente temos:\nLivros disponíveis: %s\nLivros emprestados: %s\nTotal de livros: %s",
                            disponiveis, alugados, titulos.size()),
                    "Lista de Livros:", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
