import javax.swing.*;
import java.util.ArrayList;

public class Adicionar_Livro {
    public static void adicionarLivro(
            ArrayList<String> titulos,
            ArrayList<String> autores,
            ArrayList<Integer> anoPublicacoes,
            ArrayList<String> leitores,
            ArrayList<String> status) {

        String nomeLivro;

        while (true) {
            nomeLivro = JOptionPane.showInputDialog(null, "Informe o título do livro:", "Entrada de Dados",
                    JOptionPane.QUESTION_MESSAGE);
            if (nomeLivro == null) {
                return;
            }

            if (!nomeLivro.isEmpty()) {
                break;
            }
            JOptionPane.showMessageDialog(null, "Preencha o campo para prosseguir.", "Entrada Inválida.",
                    JOptionPane.ERROR_MESSAGE);
        }

        String nomeAutor;

        while (true) {
            nomeAutor = JOptionPane.showInputDialog(null, "Informe o autor do livro:", "Entrada de Dados",
                    JOptionPane.QUESTION_MESSAGE);
            if (nomeAutor == null) {
                return;
            }

            if (!nomeAutor.isEmpty()) {
                break;
            }
            JOptionPane.showMessageDialog(null, "Preencha o campo para prosseguir.", "Entrada Inválida.",
                    JOptionPane.ERROR_MESSAGE);
        }

        int anoLivro = -1;

        while (true) {
            String input = JOptionPane.showInputDialog(null, "Informe o ano de lançamento:", "Entrada de Dados",
                    JOptionPane.QUESTION_MESSAGE);

            if (input == null) {
                return;
            }

            input = input.trim();

            try {
                anoLivro = Integer.parseInt(input);

                if (anoLivro <= 0) {
                    JOptionPane.showMessageDialog(null, "Digite um ano válido (maior que zero).", "Entrada Inválida.",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número inteiro válido.", "Entrada Inválida.",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        titulos.add(nomeLivro);
        autores.add(nomeAutor);
        anoPublicacoes.add(anoLivro);
        status.add("Disponível");
        leitores.add("");

        JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso.");
    }
}