import java.util.ArrayList;

import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showMessageDialog;

public class Listar_Livros {
    public static void listarLivros(
            ArrayList<String> titulos,
            ArrayList<String> autores,
            ArrayList<Integer> anoPublicacao,
            ArrayList<String> status) {

        String resultado = "";
        if (titulos.size() > 0) {
            for (int i = 0; i < titulos.size(); i++) {

                resultado += "Código: " + (i + 1) + "\n";
                resultado += "Título: " + titulos.get(i) + "\n";
                resultado += "Autor: " + autores.get(i) + "\n";
                resultado += "Ano: " + anoPublicacao.get(i) + "\n";
                resultado += "Status: " + status.get(i) + "\n";

                resultado += "________\n";

            }
            showMessageDialog(null, resultado, "Lista de Livros:", JOptionPane.PLAIN_MESSAGE);
        } else {
            showMessageDialog(null, "Não há livros cadastrados.");
        }
    }
}
