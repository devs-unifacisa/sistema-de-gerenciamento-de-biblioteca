import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EMPRESTAR_LIVRO {
    public static void pegarLivroEmprestado(ArrayList<String> titulos, ArrayList<String> status) {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do livro:"));

        if (titulos.size() > 0) {
            if (codigo > titulos.size() || codigo < 1) {
                JOptionPane.showMessageDialog(null, "Livro não encontrado.");
            } else {
                if (status.get(codigo - 1).equals("Disponível")) {

                    int escolha = JOptionPane.showConfirmDialog(null, "Livro disponível.\nDeseja pegar emprestado?");

                    if (escolha == JOptionPane.YES_OPTION) {
                        status.add(codigo - 1, "Emprestado");
                        JOptionPane.showMessageDialog(null, "Emprestimo solicitado com sucesso.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Livro não está disponível.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há livros cadastrados.");
        }

    }
}
