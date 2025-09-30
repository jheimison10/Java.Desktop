package swing.java;

// Importações necessárias
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;         // NOVO: Importamos o JPanel
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.GridLayout;        // NOVO: Importamos o GridLayout

/**
 * Classe principal para testar uma aplicação Swing simples.
 */
public class Swing {

    public static void main(String[] args) {
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
        JFrame frame = new JFrame("Testando APP do Senac");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Cria um Rótulo Principal e Centraliza (opcional, mas bom para o topo)
        JLabel titleLabel = new JLabel("Olá, Você está no APP do Senac!");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        // 3. CRIA UM PAINEL para os Nomes
        // Este JPanel usa um GridLayout: 0 linhas (crescimento automático), 1 coluna.
        JPanel namesPanel = new JPanel(new GridLayout(0, 1));
        
        // 4. Cria e Adiciona os Rótulos de Nomes ao Painel
        JLabel label2 = new JLabel("Jheimison");
        JLabel label3 = new JLabel("João");
        JLabel label4 = new JLabel("Andre");
        
        // Centraliza os textos dentro de cada JLabel e os adiciona ao painel
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setHorizontalAlignment(SwingConstants.CENTER);

        namesPanel.add(label2);
        namesPanel.add(label3);
        namesPanel.add(label4);
        
        // 5. Adiciona os componentes à Janela (JFrame)
        // Adiciona o título no topo (Norte do BorderLayout)
        frame.getContentPane().add(titleLabel, BorderLayout.NORTH);
        
        // Adiciona o painel de nomes no centro
        frame.getContentPane().add(namesPanel, BorderLayout.CENTER);

        // 6. Configura e Exibe a Janela
        frame.setSize(400, 250); // Aumentamos um pouco o tamanho para caber tudo
        frame.setLocationRelativeTo(null); // Centraliza na tela
        frame.setVisible(true);
    }
}