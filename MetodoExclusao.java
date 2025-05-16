import javax.swing.*;
import java.util.ArrayList;

public class MetodoExclusao {

    public static void excluindo(ArrayList<String> titulos, ArrayList<String> status, ArrayList<String> autores,
            ArrayList<Integer> anos, ArrayList<String> leitores) {
        if (titulos.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Não há livros cadastrados.");

        }

        else {
            int codigo;

            while (true) {
                String codigoExclusao = JOptionPane.showInputDialog(null,
                        "Digite o código do livro que deseja excluir:", "Entrada de Dados",
                        JOptionPane.QUESTION_MESSAGE);

                if (codigoExclusao == null) {
                    return;
                }

                try {
                    codigo = Integer.parseInt(codigoExclusao);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Código inválido. Digite apenas números.", "Entrada Inválida.",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            if (codigo < 1 || codigo > titulos.size() || status.get(codigo - 1).equalsIgnoreCase("Emprestado")) {

                JOptionPane.showMessageDialog(null,
                        "Código inválido ou livro já emprestado. Por favor, tente novamente", "Entrada Inválida.",
                        JOptionPane.ERROR_MESSAGE);

            } else {

                int confirmacao = JOptionPane.showConfirmDialog(null,
                        String.format("Tem certeza que deseja excluir o livro: %s?", titulos.get(codigo - 1)));

                if (confirmacao == JOptionPane.YES_OPTION) {

                    titulos.remove(codigo - 1);
                    autores.remove(codigo - 1);
                    anos.remove(codigo - 1);
                    status.remove(codigo - 1);
                    leitores.remove(codigo - 1);

                    JOptionPane.showMessageDialog(null, "Livro excluido com sucesso.");

                }
            }

            if (codigo == -1) {

                return;

            }

        }

    }

}
