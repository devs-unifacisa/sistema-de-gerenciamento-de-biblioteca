import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EMPRESTAR_LIVRO {
    public static void pegarLivroEmprestado(
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
                if (status.get(codigo - 1).equals("Disponível")) {

                    int escolha = JOptionPane.showConfirmDialog(null, "Livro disponível.\nDeseja pegar emprestado?");

                    if (escolha == JOptionPane.YES_OPTION) {

                        String leitor;

                        while (true) {
                            leitor = JOptionPane.showInputDialog(null, "Digite seu nome:", "Entrada de Dados",
                                    JOptionPane.QUESTION_MESSAGE);

                            if (leitor.length() > 0) {
                                break;
                            }

                            JOptionPane.showMessageDialog(null, "Erro. Nome não informado.\nTente novamente.",
                                    "Entrada Inválida.", JOptionPane.ERROR_MESSAGE);
                        }

                        status.set(codigo - 1, "Emprestado");
                        leitores.set(codigo - 1, leitor);

                        JOptionPane.showMessageDialog(null, "Emprestimo realizado com sucesso.");
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
