import java.awt.*;
import java.awt.event.*;
import java.applet.AppletStub;
import java.net.URL;
import java.applet.AudioClip;
import java.util.Collections;
import java.util.Enumeration;
import java.io.InputStream;
import java.util.Iterator;
import java.applet.Applet;
import java.applet.AppletContext;

public class Runner {
    public static class Context implements AppletContext {
        public AudioClip getAudioClip(URL url) {
            return null;
        }
        public Image getImage(URL url) {
            return null;
        }
        public Applet getApplet(String name) {
            return null;
        }
        public Enumeration<Applet> getApplets() {
            return null;
        }
        public void showDocument(URL url) {
        }
        public void showDocument(URL url, String target) {
        }
        public void showStatus(String status) {
        }
        public void setStream(String key, InputStream stream) {
        }
        public InputStream getStream(String key) {
            return null;
        }
        public Iterator<String> getStreamKeys() {
            return null;
        }
    }

    public static class Stub implements AppletStub {
        public final AppletContext context = new Context();

        public boolean isActive() {
            return true;
        }
        public URL getDocumentBase() {
            return null;
        }
        public URL getCodeBase() {
            return getDocumentBase();
        }
        public String getParameter(String name) {
            System.out.println(name);
            return null;
        }
        public AppletContext getAppletContext() {
            return context;
        }
        public void appletResize(int width, int height) {
        }
    }

    public static void main(String[] args) {
        // Create App
        M app = new M();

        // Set Stub
        Stub stub = new Stub();
        app.setStub(stub);

        // Create Window
        Frame frame = new Frame("Minecraft: 4k Edition: Reborn");
        frame.setIgnoreRepaint(true);
        frame.add("Center", app);
        frame.setResizable(false);
        app.setPreferredSize(new Dimension(856, 480));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Start App
        app.init();
        app.start();
    }
}
