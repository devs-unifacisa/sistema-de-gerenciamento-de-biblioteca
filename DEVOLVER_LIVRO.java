import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DEVOLVER_LIVRO {
    public static void devolverLivro(
            ArrayList<String> titulos,
            ArrayList<String> status,
            ArrayList<String> livrosEmprestados,
            ArrayList<String> livrosDevolvidos,
            ArrayList<String> leitores) {

        int codigo;

        while (true) {
            String entrada = JOptionPane.showInputDialog("Digite o código do livro:");

            if (entrada == null) {
                return;
            }

            try {
                codigo = Integer.parseInt(entrada);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Código inválido. Digite apenas números.");
            }
        }

        if (titulos.size() > 0) {
            if (codigo > titulos.size() || codigo < 1) {
                JOptionPane.showMessageDialog(null, "Livro não encontrado.");
            } else {
                if (status.get(codigo - 1).equals("Emprestado")) {

                    String titulo = titulos.get(codigo - 1);
                    String leitor = leitores.get(codigo - 1);

                    status.set(codigo - 1, "Disponível");
                    leitores.set(codigo - 1, "");

                    livrosEmprestados.remove(titulo);

                    livrosDevolvidos.add(titulo);

                    JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso por: " + leitor);

                } else {
                    JOptionPane.showMessageDialog(null, "Livro não está emprestado.");
                }
            }
        }
    }
}
