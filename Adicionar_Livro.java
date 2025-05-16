import javax.swing.*;
import java.util.ArrayList;

public class Adicionar_Livro {
    public static void adicionarLivro (
            ArrayList<String> titulos,
            ArrayList<String> autores,
            ArrayList<Integer> anoPublicacao,
            ArrayList<String> leitores,
            ArrayList<String> status) {

        String nomeLivro;

        while(true){
            nomeLivro = JOptionPane.showInputDialog("Titulo do Livro: ");
            if (nomeLivro == null) {
                return;
            }

            if (!nomeLivro.isEmpty()){
                titulos.add(nomeLivro);
                break;
            }
        }

        String nomeAutor;

        while(true){
            nomeAutor = JOptionPane.showInputDialog("Autor do Livro: ");
            if (nomeAutor == null) {
                return;
            }

            if (!nomeAutor.isEmpty()){
                autores.add(nomeAutor);
                break;
            }
        }

        if (nomeAutor == null) {
            return;
        }

        status.add("Disponível");
        leitores.add("");

        while (true){
            try {
                int anoPublicado = Integer.parseInt(JOptionPane.showInputDialog("Data de lançamento: "));
                anoPublicacao.add(anoPublicado);
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Tente novamente!");
                JOptionPane.showMessageDialog(null, "Digite um número, tente novamente!");
            }
        }
        JOptionPane.showMessageDialog(null, "Livro Adicionado com Sucesso!");
    }
}