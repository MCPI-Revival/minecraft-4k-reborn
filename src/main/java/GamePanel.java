import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class GamePanel extends JPanel {
    private final Game app;

    public GamePanel(Game app) {
        this.app = app;
        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                app.handleEvent(new Event(null, 0, Event.KEY_PRESS, 0, 0, keyEvent.getKeyChar(), 0));
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                app.handleEvent(new Event(null, 0, Event.KEY_RELEASE, 0, 0, keyEvent.getKeyChar(), 0));
            }
        });
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }

            private int getModifiers(MouseEvent mouseEvent) {
                // Values extracted from M
                if (mouseEvent.getButton() == MouseEvent.BUTTON3) {
                    return 4;
                } else {
                    return 0;
                }
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                app.handleEvent(new Event(null, 0, Event.MOUSE_DOWN, mouseEvent.getX(), mouseEvent.getY(), 0, getModifiers(mouseEvent)));
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                app.handleEvent(new Event(null, 0, Event.MOUSE_UP, mouseEvent.getX(), mouseEvent.getY(), 0, getModifiers(mouseEvent)));
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                app.handleEvent(new Event(null, 0, Event.MOUSE_EXIT, mouseEvent.getX(), mouseEvent.getY(), 0, 0));
            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
                app.handleEvent(new Event(null, 0, Event.MOUSE_DRAG, mouseEvent.getX(), mouseEvent.getY(), 0, 0));
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                app.handleEvent(new Event(null, 0, Event.MOUSE_MOVE, mouseEvent.getX(), mouseEvent.getY(), 0, 0));
            }
        });
        setPreferredSize(new Dimension(856, 480));
    }

    @Override
    public void paintComponent(Graphics g) {
        synchronized (app.newFrame) {
            if (app.newFrame.image != null) {
                g.drawImage(app.newFrame.image, app.newFrame.i, app.newFrame.i1, app.newFrame.i2, app.newFrame.i3, null);
            }
        }
    }
}
