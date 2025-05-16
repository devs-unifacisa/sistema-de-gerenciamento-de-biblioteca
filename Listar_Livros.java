import javax.swing.*;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

public class Listar_Livros {
    public static void listarLivros(
            ArrayList<String> titulos,
            ArrayList<String> autores,
            ArrayList<Integer> anoPublicacao
            )  {

        String resultado = "";
    if (titulos.size() > 0) {
        for (int i = 0; i < titulos.size(); i++) {

            resultado += "Código: " + (i + 1) + "\n";
            resultado += "Título: " + titulos.get(i) + "\n";
            resultado += "Autor: " + autores.get(i) + "\n";
            resultado += "Ano: " + anoPublicacao.get(i) + "\n";


            resultado += "________________________\n";
        }
        showMessageDialog(null, resultado);
    }
    else {
        showMessageDialog(null,"Não há livros cadastrados!");
    }
    }
}
