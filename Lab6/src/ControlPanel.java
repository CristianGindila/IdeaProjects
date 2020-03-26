import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel {
    private DrawingFrame frame;
    private DrawingFrame newFrame;
    private SaveLoad action = new SaveLoad();
    JButton loadBtn = new JButton("Load");
    JButton saveBtn = new JButton("Save");
    JButton resetBtn = new JButton("Reset");
    JButton exitBtn = new JButton("Exit");

    public ControlPanel(DrawingFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        this.add(loadBtn);
        this.add(saveBtn);
        this.add(resetBtn);
        this.add(exitBtn);
        resetBtn.addActionListener((e -> frame.canvas.clear()));
        exitBtn.addActionListener((e -> frame.dispose()));
        saveBtn.addActionListener(actionEvent -> this.newFrame=this.frame);
        loadBtn.addActionListener(actionEvent -> {
            frame=newFrame;
            frame.pack();
            frame.canvas.setVisible(false);
            frame.canvas.repaint();
            frame.canvas.setVisible(true);
        });

    }
}