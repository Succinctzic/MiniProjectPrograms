package ReleaseTwoRandomCardDisp;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class FraMain extends JFrame {

    FraMain() {
        PanMain panMain = new PanMain();
        Cards cards = new Cards();
        setTitle("WAR!!!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((98*5), (73*5));
        this.setResizable(true);
        setLocationRelativeTo(null);
        add(panMain);
        setVisible(true);
        

    }
}