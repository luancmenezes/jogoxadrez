/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jogoxadrez.modelos.pecas;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Pedro
 */
public class PecaRainhaPreto extends JButton {

    public PecaRainhaPreto() {
        this.setIcon(new ImageIcon("imagens/rainha-P.gif"));
        this.setBackground(new Color(255,255,255));
        this.setSize(50, 50);
    }

    
}
