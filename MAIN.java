import javax.swing.*;
import java.awt.Font;
import java.util.ArrayList;

public class MAIN {
    public static void main(String[] args) {
        ArrayList<String> titulos = new ArrayList<>();
        // ArrayList<String> autores = new ArrayList<>();
        // ArrayList<String> anoPublicacao = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();
        // ArrayList<String> livrosEmprestados = new ArrayList<>();
        // ArrayList<String> livrosDevolvidos = new ArrayList<>();

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
                        EMPRESTAR_LIVRO.pegarLivroEmprestado(titulos, status);
                        break;
                    case 4:
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

            } else if (opcaoSelecionada == JOptionPane.CLOSED_OPTION || opcaoSelecionada == JOptionPane.CANCEL_OPTION) {
                confirmarSaida();
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum serviço selecionado.");
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
