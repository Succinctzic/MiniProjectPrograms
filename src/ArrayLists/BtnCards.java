package ArrayLists;

import TwoDecks.*;
import RndmCrdBtn.*;
import Button.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BtnCards extends JButton {

    private ImageIcon icon;
    int nWidth, nHeight, nRows, nColoms;
    BufferedImage[] sprites = SplitSprites();
    BufferedImage bigImg = null;

    public BufferedImage[] SplitSprites() {
        try {
            bigImg = ImageIO.read(new File("PlayingCardsSpreadsheet.png"));
        } catch (IOException e) {
            e.getCause();
        }
        nWidth = 73;
        nHeight = 98;
        nRows = 4;
        nColoms = 13;
        sprites = new BufferedImage[nRows * nColoms];
        for (int i = 0; i < nRows; i++) { // split up sprite
            for (int j = 0; j < nColoms; j++) {
                sprites[(i * nColoms) + j] = bigImg.getSubimage((j * nWidth), (i * nHeight), nWidth, nHeight);
            }
        }
        return sprites;
    }

    public void Cards() {
        icon = new ImageIcon("card_back.png");
        icon.getImage();

        this.setIcon(icon);

    }

    public void Random(int nAdd) {
        int nRandomInt = (int) (Math.random() * 26) + nAdd;
        icon = new ImageIcon(sprites[nRandomInt]);
        setIcon(icon);

    }
}