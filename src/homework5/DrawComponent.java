package homework5;

import javax.swing.*;
import java.awt.*;

public class DrawComponent extends JComponent {
    public void paint(Graphics graph0) {
        Graphics2D graph = (Graphics2D) graph0;

        graph.setColor(Color.LIGHT_GRAY);
        graph.draw(new Rectangle(0, 710, 70, 60));

        graph.setColor(Color.BLUE);
        graph.draw(new Rectangle(70, 600, 50, 100));

        graph.setColor(Color.BLACK);
    }
}
