package Main;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panel extends JPanel implements MouseListener {
    public int i;
    public int j;
    public boolean enabled = true;
    Color background2 = new Color(31, 53, 64);

    public Panel(int i, int j) {
        this.i = i;
        this.j = j;
        this.setBounds(j * 135 + 45, i * 135 + 120, 120, 120);
        this.setVisible(true);
        this.setBackground(background2);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
