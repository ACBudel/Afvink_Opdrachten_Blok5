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

public class YANAARA extends JFrame implements ActionListener {
    
    private JLabel SeqLabel, PercLabel;
    private JButton AnalyseButton;
    private JTextArea SeqTextArea;
    private JPanel PercPanel;
    
    public static void main(String[] args) {
        YANAARA frame = new YANAARA();
        frame.setSize(400, 300);
        frame.createGUI();
        frame.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        SeqLabel = new JLabel("Sequentie");
        PercLabel = new JLabel("Percentage");
        AnalyseButton = new JButton("Analyseer!");
        PercPanel = new JPanel();
        PercPanel.setPreferredSize(new Dimension(350, 100));
        PercPanel.setBackground(Color.white);
        SeqTextArea = new JTextArea(6,30);
        window.add(AnalyseButton);
        window.add(SeqLabel);
        window.add(SeqTextArea);
        window.add(PercLabel);
        window.add(PercPanel);
        AnalyseButton.addActionListener(this);
    }
    
    public static boolean CheckAA(String RawInput){
        String Input = RawInput.toUpperCase();
        Boolean ValidAA = null;
        for (char I : Input.toCharArray()){
            String In = String.valueOf(I);
            if (In.matches("[BJOUXZ]")){ 
                ValidAA = false;
            }
            else{
                ValidAA = true; 
            }
        }
        
        return ValidAA;    
    }
    
    public static float calculatePolarity(String RawInput){
        String Input = RawInput.toUpperCase();
        float polarval = 0;
        float AAcount = Input.length();
        for (char I : Input.toCharArray()){
            String In = String.valueOf(I);
            if (In.matches("[RNDCQEGHKSTY]")){
                polarval+=1;
            }
                
        }
        float polarperc = (polarval/AAcount)*100;        
        
        return polarperc;
    }
    
    
    public void actionPerformed(ActionEvent event) {
        Graphics paper = PercPanel.getGraphics();
        String Input = SeqTextArea.getText();
        boolean ValidAA = CheckAA(Input);
        if(ValidAA==false) {
            JOptionPane.showMessageDialog(null, "Aminozuur sequentie is niet valide!");
            
        }
        float polarPerc = calculatePolarity(Input);
        float apolarPerc = 100 - polarPerc;
        String polarPerclabel = "Polair" + polarPerc + "%";
        String apolarPerclabel = "Apolair" + apolarPerc + "%";
        paper.setColor(Color.blue);
        paper.fillRect(10, 10, (int) (polarPerc*3), 30);
        paper.setColor(Color.red);
        paper.fillRect(10, 40, (int) (apolarPerc*3), 30);
        paper.setColor(Color.black);
        paper.drawString(polarPerclabel, 20, 20);
        paper.drawString(apolarPerclabel, 20, 50);
        
    }

    
}
