/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aylachan
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class One2Three extends JFrame implements ActionListener {
    
    private JButton TranslateButton;
    private JLabel OneLetterLabel;
    private JLabel ThreeLetterLabel;
    private JTextField OneLetterTextField;
    private JTextField ThreeLetterTextField;
    
    
    public static void main(String[] args) {
        One2Three frame = new One2Three();
        frame.setSize(500, 100);
        frame.createGUI();
        frame.setVisible(true);
      
    }
    
    
     private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        OneLetterTextField = new JTextField("", 8);
        TranslateButton = new JButton("Translate");
        ThreeLetterTextField = new JTextField("", 8);
        OneLetterLabel = new JLabel("1 lettercode");
        ThreeLetterLabel = new JLabel("3 lettercode");
        window.add(OneLetterLabel);
        window.add(OneLetterTextField);
        window.add(TranslateButton);
        window.add(ThreeLetterLabel);
        window.add(ThreeLetterTextField);
        TranslateButton.addActionListener(this);
     }
     
     public void actionPerformed(ActionEvent event) {
         String RawInput = OneLetterTextField.getText();
         String Input = RawInput.toUpperCase();
         String Output = Translator.Translate(Input);
         ThreeLetterTextField.setText(Output);
     }
}

