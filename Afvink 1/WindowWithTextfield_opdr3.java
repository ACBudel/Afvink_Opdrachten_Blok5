/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowwithtextfield;

/**
 *
 * @author aylachan
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowWithTextfield extends JFrame {

    /**
     * @param args the command line arguments
     */
    private JTextField textField, /**unedittextfield*/ Label;
    
    public static void main(String[] args) {
        WindowWithTextfield frame = new WindowWithTextfield();
        frame.setSize(300, 200);
        frame.createGUI();
        frame.show();
        // TODO code application logic here
    }
    
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        textField = new JTextField("Typ hier!");
        JLabel Label = new JLabel("Input");
        /**unedittextfield = new JTextField("Input");
        unedittextfield.setEditable(false);
        window.add(unedittextfield);*/
        window.add(Label);
        window.add(textField);
        
    }
}
