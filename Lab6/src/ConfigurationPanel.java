import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigurationPanel extends JPanel {
    final DrawingFrame frame;
    protected JTextField textField = new JTextField();
    private JButton circle = new JButton("Circle");
    private JButton square = new JButton("Square");


    ConfigurationPanel(DrawingFrame frame) {
        this.frame=frame;
        init();
    }
    private void init(){
        textField.setPreferredSize(new Dimension(100,30));
        this.add(textField);

        circle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.canvas.form="circle";
            }
        });

        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.canvas.form="square";
            }
        });

        this.add(circle);
        this.add(square);

    }
}
