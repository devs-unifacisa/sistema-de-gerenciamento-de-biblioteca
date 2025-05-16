import javax.swing.*;
import java.util.ArrayList;

public class LISTAR_APENAS_LIVROS_EMPRESTADOS {
    public static void Listar_apenas_livros_emprestados(
            ArrayList<String> titulos,
            ArrayList<String> autores,
            ArrayList<Integer> anoPublicacao,
            ArrayList<String> status,
            ArrayList<String> leitores) {

        String result = "";
        boolean encont = false;

        for (int i = 0; i < titulos.size(); i++) {
            if (status.get(i).equals("Emprestado")) {
                result += "Código: " + (i + 1) + "\n";
                result += "Título: " + titulos.get(i) + "\n";
                result += "Autor: " + autores.get(i) + "\n";
                result += "Ano: " + anoPublicacao.get(i) + "\n";
                result += "Leitor: " + leitores.get(i) + "\n";
                result += "________\n";

                encont = true;
            }
        }

        if (encont) {
            JOptionPane.showMessageDialog(null, result, "Lista de Livros:", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum livro emprestado no momento.");
        }
    }
}
