import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EMPRESTAR_LIVRO {
    public static void pegarLivroEmprestado(
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
                if (status.get(codigo - 1).equals("Disponível")) {

                    int escolha = JOptionPane.showConfirmDialog(null, "Livro disponível.\nDeseja pegar emprestado?");

                    if (escolha == JOptionPane.YES_OPTION) {

                        String leitor;

                        while (true) {
                            leitor = JOptionPane.showInputDialog("Digite seu nome:");

                            if (leitor.length() > 0) {
                                break;
                            }

                            JOptionPane.showMessageDialog(null, "Erro. Nome não informado.\nTente novamente.");
                        }

                        String titulo = titulos.get(codigo - 1);

                        status.set(codigo - 1, "Emprestado");
                        leitores.set(codigo - 1, leitor);

                        livrosDevolvidos.remove(titulo);

                        livrosEmprestados.add(titulo);

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
