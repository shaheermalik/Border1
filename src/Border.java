import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Border1 extends JFrame {

    public Border1() {
        GridLayout gridLayout = new GridLayout(2,2);
        JPanel panel = new JPanel(gridLayout);
        JButton[] btn = new JButton[4];
        JTextField [] text = new JTextField[4];
        for(int j=0; j<text.length; j++){
            text[j] = new JTextField("Input Text " + (j+1));
            panel.add(text[j]);
        }
        for(int i=0; i<btn.length; i++) {
            btn[i] = new JButton("Button " + (i+1));
            panel.add(btn[i]);
        }
        add(panel);
        setSize(500,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Border1 ();
    }
}
