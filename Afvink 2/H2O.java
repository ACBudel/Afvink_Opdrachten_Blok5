package h2o;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class H2O extends JFrame
    implements ActionListener {
    
    private JButton button;
    private JPanel panel;
    private JTextField xfield, yfield;
    private JLabel xlabel, ylabel;
    

    public static void main(String[] args) {
        H2O frame = new H2O();
        frame.setTitle("Water Molecule");
        frame.setSize(600, 500);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(600, 400));
        panel.setBackground(Color.white);
        window.add(panel);
        xlabel = new JLabel("x");
        window.add(xlabel);
        xfield = new JTextField();
        xfield.setPreferredSize(new Dimension(50, 20));
        window.add(xfield);
        ylabel = new JLabel("y");
        window.add(ylabel);
        xfield.addActionListener(this);
        yfield = new JTextField();
        yfield.setPreferredSize(new Dimension(50, 20));
        window.add(yfield);
        yfield.addActionListener(this);
        button = new JButton("Draw a watermolecule");
        window.add(button);
        button.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        int xPosition;
        int yPosition;
        String xPositionInput;
        String yPositionInput;
        xPositionInput = xfield.getText();
        yPositionInput = yfield.getText();
        xPosition = Integer.parseInt(xPositionInput);
        yPosition = Integer.parseInt(yPositionInput);
        paper.setColor(Color.white);
        paper.fillRect(0, 0, 500, 400);
        paper.setColor(Color.black);
        paper.drawLine(50 + xPosition, 50 + yPosition, 270 + xPosition, 150 + yPosition);
        paper.drawLine(50 + xPosition, 250 + yPosition, 270 + xPosition, 170 + yPosition);
        paper.setColor(Color.blue);
        paper.fillOval(xPosition, yPosition, 100, 100);
        paper.fillOval(xPosition, 200 + yPosition, 100, 100);
        paper.setColor(Color.red);
        paper.fillOval(200 + xPosition, 100 + yPosition, 150, 150);
    }
}