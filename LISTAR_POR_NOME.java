import javax.swing.*;
import java.util.*;

public class LISTAR_POR_NOME {
    public static void listarPorNome(
            ArrayList<String> titulos,
            ArrayList<String> autores,
            ArrayList<Integer> anoPublicacao,
            ArrayList<String> status,
            ArrayList<String> leitores) {

        if (titulos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há livros cadastrados.");
            return;
        }

        String chamada;

        while (true) {
            chamada = JOptionPane.showInputDialog(null,
                    "Digite o título do livro para buscar:",
                    "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);

            if (chamada == null) {
                return;
            }

            chamada = chamada.trim();

            if (chamada.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o campo para prosseguir.");
            } else {
                break;
            }
        }

        String resultado = "";
        boolean encontrou = false;

        for (int item = 0; item < titulos.size(); item++) {
            if (titulos.get(item).toLowerCase().contains(chamada.toLowerCase())) {
                resultado += "Código: " + (item + 1) + "\n";
                resultado += "Título: " + titulos.get(item) + "\n";
                resultado += "Autor: " + autores.get(item) + "\n";
                resultado += "Ano: " + anoPublicacao.get(item) + "\n";
                resultado += "Status: " + status.get(item) + "\n";

                if (status.get(item).equalsIgnoreCase("Emprestado")) {
                    resultado += "Leitor: " + leitores.get(item) + "\n";
                }

                resultado += "________\n";
                encontrou = true;
            }
        }

        if (encontrou) {
            JOptionPane.showMessageDialog(null, resultado, "Lista de Livros:", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Livro não encontrado.");
        }
    }
}