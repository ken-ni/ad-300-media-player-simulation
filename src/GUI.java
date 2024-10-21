import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// Resources used since I didn't know how to make a GUI in Java: 
// https://www.youtube.com/watch?v=5o3fMLPY7qY - Java GUI Tutorial - Make a GUI in 13 Minutes #99
// https://stackoverflow.com/questions/5911565/how-to-add-multiple-actionlisteners-for-multiple-buttons-in-java-swing

public class GUI{

    JLabel label;
    JFrame frame;
    JPanel panel;

    public GUI(String media, MediaPlayer player) {
        // Create frame for our GUI
        frame = new JFrame();
        label = new JLabel("Click a button");

        // Create panel for our GUI
        panel = new JPanel();

        // Create button, each button has their own actionPerformed
        // method to allow them to each have their respective uses
        JButton playButton = new JButton(new AbstractAction("Play") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(player.play(media));
            }
        });

        JButton pauseButton = new JButton(new AbstractAction("Pause") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(player.pause());
            }
        });

        JButton stopButton = new JButton(new AbstractAction("Stop") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(player.stop());
            }
        });

        // Panel setup
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);

        // Add buttons
        panel.add(playButton);
        panel.add(pauseButton);
        panel.add(stopButton);

        // Add frame to panel
        frame.add(panel, BorderLayout.CENTER);
        // GUI closes when exited
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Title GUI shows, shows title based on type of player
        frame.setTitle(player.toString() + " Media Player");
        // Window options
        frame.pack();
        frame.setVisible(true);
    }
}
