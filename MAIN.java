import javax.swing.*;
import java.awt.Font;

public class MAIN {
    public static void main(String[] args) {
        String[] opcoesMenu = {
                "Cadastrar novo livro",
                "Listar todos os livros",
                "Buscar livro por título",
                "Realizar empréstimo de livro",
                "Registrar devolução de livro",
                "Excluir livro do sistema",
                "Listar livros emprestados",
                "Contar livros disponíveis e emprestados",
                "Sair"
        };

        /*
         * Esse bloco cria uma lista visual com todas as opções, permite apenas uma
         * seleção, mostra todas as opções visíveis e formata o texto para ficar mais
         * legível e profissional.
         */
        JList<String> listaServicos = new JList<>(opcoesMenu);
        listaServicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaServicos.setVisibleRowCount(opcoesMenu.length);
        listaServicos.setFont(new Font("Arial", Font.PLAIN, 18));

        // Defini um tamanho para a caixa de dialogo.
        JScrollPane painelRolagem = new JScrollPane(listaServicos);
        painelRolagem.setPreferredSize(new java.awt.Dimension(400, 220));

        int opcaoSelecionada = -2;

        while (opcaoSelecionada != 8) {

            opcaoSelecionada = JOptionPane.showConfirmDialog(
                    null,
                    painelRolagem,
                    "Escolha um serviço:",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE);

            if (opcaoSelecionada == JOptionPane.OK_OPTION && listaServicos.getSelectedIndex() != -1) {
                opcaoSelecionada = listaServicos.getSelectedIndex();

                switch (opcaoSelecionada) {
                    case 0:
                        // Cadastrar novo livro
                        break;
                    case 1:
                        // Listar todos os livros
                        break;
                    case 2:
                        // Buscar livro por título
                        break;
                    case 3:
                        // Realizar empréstimo de livro
                        break;
                    case 4:
                        // Registrar devolução de livro
                        break;
                    case 5:
                        // Excluir livro do sistema
                        break;
                    case 6:
                        // Listar livros emprestados
                        break;
                    case 7:
                        // Contar livros disponíveis e emprestados
                        break;
                    case 8:
                        // Sair
                        confirmarSaida();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                        break;
                }
                
            } else {
                confirmarSaida();
            }
        }
    }

    public static void confirmarSaida() {
        int confirmacaoSaida = JOptionPane.showConfirmDialog(null, "Você realmente deseja encerrar o sistema?");

        if (confirmacaoSaida == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
