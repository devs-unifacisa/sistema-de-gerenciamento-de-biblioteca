import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DEVOLVER_LIVRO {
    public static void devolverLivro(
            ArrayList<String> titulos,
            ArrayList<String> status,
            ArrayList<String> leitores) {

        int codigo;

        while (true) {
            String entrada = JOptionPane.showInputDialog(null, "Digite o código do livro:", "Entrada de Dados",
                    JOptionPane.QUESTION_MESSAGE);

            if (entrada == null) {
                return;
            }

            try {
                codigo = Integer.parseInt(entrada);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Código inválido. Digite apenas números.", "Entrada Inválida.",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        if (titulos.size() > 0) {
            if (codigo > titulos.size() || codigo < 1) {
                JOptionPane.showMessageDialog(null, "Livro não encontrado.");
            } else {
                if (status.get(codigo - 1).equals("Emprestado")) {

                    String leitor = leitores.get(codigo - 1);

                    status.set(codigo - 1, "Disponível");
                    leitores.set(codigo - 1, "");

                    JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso por: " + leitor + ".");

                } else {
                    JOptionPane.showMessageDialog(null, "Livro não está emprestado.");
                }
            }
        }
    }
}
