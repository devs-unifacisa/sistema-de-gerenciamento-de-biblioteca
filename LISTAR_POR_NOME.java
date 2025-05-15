import javax.swing.*;
import java.util.*;

public class LISTAR_POR_NOME {
    public static void listarPorNome(ArrayList<String> titulos, ArrayList<String> autores,
                                     ArrayList<Integer> anoPublicacao, ArrayList<String> status,
                                     ArrayList<String> livrosEmprestados, ArrayList<String> livrosDevolvidos) {

        // Entrada do usuário
        String chamada = JOptionPane.showInputDialog("Digite o título do livro para buscar:");

        if (chamada == null || chamada.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você deve digitar um título para buscar.");
            return;
        }

        if (titulos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há livros cadastrados.");
            return;
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

                if (status.get(item).equals("Emprestado")) {
                    resultado += "Leitor: " + livrosEmprestados.get(item) + "\n";
                }

                resultado += "________________________\n";
                encontrou = true;
            }
        }

        if (encontrou) {
            JOptionPane.showMessageDialog(null, resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum livro encontrado com esse título.");
        }
    }
}
