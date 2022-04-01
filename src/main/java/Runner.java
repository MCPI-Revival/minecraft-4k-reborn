import javax.swing.JFrame;

public class Runner {
    public static void main(String[] args) {
        // Create App
        Game app = new Game();

        // Create Window
        JFrame frame = new JFrame("Minecraft: 4k Edition: Reborn");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel panel = new GamePanel(app);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        // Start App
        app.panel = panel;
        app.start();
    }
}
