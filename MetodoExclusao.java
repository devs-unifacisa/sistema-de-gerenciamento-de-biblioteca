import javax.swing.*;

public class MetodoExclusao {

    if(titulos.isEmpty()){

        JOptionPane.showMessageDialog(null,"Não há livros no momento.");

    }

                else {
        int codigoExclusao = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o código do produto que deseja excluir:"));

        if (codigoExclusao < titulos.size() || codigoExclusao > titulos.size() || statusLivros.get(codigoExclusao - 1).equalsIgnoreCase("Emprestado")) {

            JOptionPane.showMessageDialog(null, "Código inválido ou livro já emprestado. Por favor, tente novamente");

        }
        else {

            int confirmacao = JOptionPane.showConfirmDialog(null,
                    String.format("Tem certeza que deseja excluir o livro %s?", titulos.get(codigoExclusao - 1)));

            if (confirmacao == JOptionPane.YES_OPTION) {

                titulos.remove(codigoExclusao - 1);
                autores.remove(codigoExclusao - 1);
                anos.remove(codigoExclusao - 1);
                statusLivros.remove(codigoExclusao - 1);

                JOptionPane.showMessageDialog(null, "Livro excluido com sucesso!");

            }
            else {

                JOptionPane.showMessageDialog(null, "Voltando ao menu!");

            }

        }

    }

}
