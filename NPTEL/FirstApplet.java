import java.applet.Applet;
import java.awt.Graphics;

public class FirstApplet extends Applet {
    public void paint (Graphics g) {
        g.drawString("Hello My First Applet", 150, 150);
    }
}

/*
applet has been discontinued since java 9 hence no use now
it was a gui maker using applet and html
but still for some general idea
methods :
init
statrt
stop
paint
destroy
*/