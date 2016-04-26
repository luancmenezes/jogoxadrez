package jogoxadrez.modelos.pecas;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Pedro Kislansky e Luis Lima
 * @version 1.0
 */
public class PecaBispoBranco extends JButton {

    public PecaBispoBranco() {
        this.setIcon(new ImageIcon("imagens/bispo-B.gif"));
        this.setBackground(new Color(255,255,255));
        this.setSize(50, 50);
    }
}
