package swing.java; // O seu pacote

// Importações necessárias (note a capitalização correta!)
import javax.swing.JFrame;   // A janela principal
import javax.swing.JLabel;   // O componente de texto
import javax.swing.SwingConstants; // Para centralizar o texto

import java.awt.BorderLayout; // Para posicionar o rótulo

/**
 * Classe principal para testar uma aplicação Swing simples.
 */
public class Swing {

    public static void main(String[] args) {
        // O código Swing DEVE rodar na Thread de Despacho de Eventos (Event Dispatch Thread - EDT).
        // Usamos Runnable e SwingUtilities.invokeLater para garantir isso (boa prática).
        // Embora um JFrame simples possa funcionar sem, é crucial para a maioria das apps Swing.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    /**
     * Cria e exibe a interface gráfica.
     */
    private static void createAndShowGUI() {
        // 1. Cria a Janela (JFrame)
        // O construtor recebe o título da janela
        JFrame frame = new JFrame("Testando APP do Senac");
        
        // 2. Define o que acontece quando o usuário clica no 'X'
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 3. Cria um Rótulo (JLabel)
        JLabel label = new JLabel("Olá, Você está no APP do Senac!");
        
        // Centraliza o texto dentro do JLabel
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        // 4. Adiciona o Rótulo à Janela
        // Usamos BorderLayout.CENTER para garantir que ele preencha a janela
        frame.getContentPane().add(label, BorderLayout.CENTER);
        
        // 5. Ajusta o tamanho da janela para se adequar aos componentes
        frame.pack();
        
        // Definimos um tamanho mínimo para a janela (opcional)
        frame.setSize(400, 200);
        
        // 6. Torna a janela visível
        frame.setVisible(true);
    }
}