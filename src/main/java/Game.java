import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Game extends M {
    public GamePanel panel = null;

    @Override
    public boolean isActive() {
        return true;
    }

    public static class NewFrame {
        public Image image = null;
        public int i;
        public int i1;
        public int i2;
        public int i3;
    }
    public final NewFrame newFrame = new NewFrame();

    @Override
    public Graphics getGraphics() {
        return new Graphics() {
            @Override
            public Graphics create() {
                return null;
            }

            @Override
            public void translate(int i, int i1) {
            }

            @Override
            public Color getColor() {
                return null;
            }

            @Override
            public void setColor(Color color) {
            }

            @Override
            public void setPaintMode() {
            }

            @Override
            public void setXORMode(Color color) {
            }

            @Override
            public Font getFont() {
                return null;
            }

            @Override
            public void setFont(Font font) {
            }

            @Override
            public FontMetrics getFontMetrics(Font font) {
                return null;
            }

            @Override
            public Rectangle getClipBounds() {
                return null;
            }

            @Override
            public void clipRect(int i, int i1, int i2, int i3) {
            }

            @Override
            public void setClip(int i, int i1, int i2, int i3) {
            }

            @Override
            public Shape getClip() {
                return null;
            }

            @Override
            public void setClip(Shape shape) {
            }

            @Override
            public void copyArea(int i, int i1, int i2, int i3, int i4, int i5) {
            }

            @Override
            public void drawLine(int i, int i1, int i2, int i3) {
            }

            @Override
            public void fillRect(int i, int i1, int i2, int i3) {
            }

            @Override
            public void clearRect(int i, int i1, int i2, int i3) {
            }

            @Override
            public void drawRoundRect(int i, int i1, int i2, int i3, int i4, int i5) {
            }

            @Override
            public void fillRoundRect(int i, int i1, int i2, int i3, int i4, int i5) {
            }

            @Override
            public void drawOval(int i, int i1, int i2, int i3) {
            }

            @Override
            public void fillOval(int i, int i1, int i2, int i3) {
            }

            @Override
            public void drawArc(int i, int i1, int i2, int i3, int i4, int i5) {
            }

            @Override
            public void fillArc(int i, int i1, int i2, int i3, int i4, int i5) {
            }

            @Override
            public void drawPolyline(int[] ints, int[] ints1, int i) {
            }

            @Override
            public void drawPolygon(int[] ints, int[] ints1, int i) {
            }

            @Override
            public void fillPolygon(int[] ints, int[] ints1, int i) {
            }

            @Override
            public void drawString(String s, int i, int i1) {
            }

            @Override
            public void drawString(AttributedCharacterIterator attributedCharacterIterator, int i, int i1) {
            }

            @Override
            public boolean drawImage(Image image, int i, int i1, ImageObserver imageObserver) {
                return false;
            }

            @Override
            public boolean drawImage(Image image, int i, int i1, int i2, int i3, ImageObserver imageObserver) {
                synchronized (newFrame) {
                    newFrame.image = image;
                    newFrame.i = i;
                    newFrame.i1 = i1;
                    newFrame.i2 = i2;
                    newFrame.i3 = i3;
                }
                if (panel != null) {
                    panel.repaint();
                }
                return false;
            }

            @Override
            public boolean drawImage(Image image, int i, int i1, Color color, ImageObserver imageObserver) {
                return false;
            }

            @Override
            public boolean drawImage(Image image, int i, int i1, int i2, int i3, Color color, ImageObserver imageObserver) {
                return false;
            }

            @Override
            public boolean drawImage(Image image, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, ImageObserver imageObserver) {
                return false;
            }

            @Override
            public boolean drawImage(Image image, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, Color color, ImageObserver imageObserver) {
                return false;
            }

            @Override
            public void dispose() {
            }
        };
    }
}
