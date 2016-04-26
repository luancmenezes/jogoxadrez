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
public class PecaPeaoBranco extends JButton{

    private boolean mexeu;
    
    public PecaPeaoBranco() {
        this.setIcon(new ImageIcon("imagens/peao-B.gif"));
        this.setBackground(new Color(255,255,255));
        this.setSize(50, 50);
    }

    public boolean isMexeu() {
        return mexeu;
    }

    public void setMexeu(boolean mexeu) {
        this.mexeu = mexeu;
    }

}
