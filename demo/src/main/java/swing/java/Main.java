// 1. Definição do pacote (opcional, mas comum)
package swing.java;

// 2. Importação CORRETA das classes da biblioteca Swing

// Importa a classe JFrame para criar a janela principal
import javax.swing.JFrame;

// Importa a classe JLabel para criar um rótulo de texto
import javax.swing.JLabel;

// Importa TUDO do pacote javax.swing (menos comum, mas válido para começar)
// import javax.swing.*; 

// 3. Classe Principal
public class Main {
    public static void main(String[] args) {
        // Exemplo: Criando uma janela (JFrame)
        JFrame minhaJanela = new JFrame("Minha Primeira Janela Swing");
        minhaJanela.setSize(400, 300);
        minhaJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Exemplo: Criando um rótulo (JLabel)
        JLabel meuRotulo = new JLabel("Olá, Swing!");
        minhaJanela.add(meuRotulo);
        
        // Torna a janela visível
        minhaJanela.setVisible(true);
        
        System.out.println("Janela Swing criada!");
    }
}