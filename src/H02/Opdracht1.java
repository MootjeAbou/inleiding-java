package H02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    @Override
    public void init() {
        this.setBackground(Color.BLUE);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawString("Mohammed", 70, 60);
        g.drawString("El Mouhidi", 70, 70);
    }
}
