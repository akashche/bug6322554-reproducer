import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Test6322554 extends Canvas {

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // g2d.drawString("Thermal test EDAX [GRAPHICS]", 100f, 128f);
        FontRenderContext frc = new FontRenderContext(new AffineTransform(), true, true);
        GlyphVector gv = g2d.getFont().createGlyphVector(frc, "Thermal test EDAX [GRAPHICS]");
        Shape outline = gv.getOutline();
        g2d.translate(100f, 127f);
        g2d.fill(outline);
        g2d.translate(-100f, -127f);
        g2d.drawRect(72, 72, 128, 64);
    }

    public static void main(String[] args) {
        Test6322554 painter = new Test6322554();
        JFrame frame = new JFrame();
        frame.add(painter);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
