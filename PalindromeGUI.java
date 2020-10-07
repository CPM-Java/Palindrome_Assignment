 /**
 * User enters a string and the program
 * checks to see if it is a palindrome 
 * 
 * @author GrayKnight
 * @version Assignment,  11/06/03 mods 10/10/10
   DO NOT MODIFY THIS CLASS*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalindromeGUI extends JPanel
{
    // GUI objects
    private JTextField nameIn;
    private JButton clear, analyze;
    private JPanel buttonPanel;
    private JLabel label;
    private PalindromeAnalyzer pa = new PalindromeAnalyzer();    
    
    /**
     * Constructor for objects of class palindromeGUI
     */
    public PalindromeGUI()
    {
        setLayout(new BorderLayout());
                
        nameIn = new JTextField("Enter the phrase you want to test here.");
        analyze = new JButton("Analyze");
        clear = new JButton("Clear");
        label = new JLabel("");
    
        ButtonListener Listener = new ButtonListener();
        analyze.addActionListener(Listener);
        clear.addActionListener(Listener);
        
        buttonPanel = new JPanel();
        buttonPanel.add(analyze);
        buttonPanel.add(clear);
        
        add(nameIn, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
        
        setPreferredSize(new Dimension(300, 100));
    }


    /**
     * Private Listener Class.
     * 
     * 
     */
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if (event.getSource() == analyze && !nameIn.getText().equals(""))
                if (pa.palindromeCheck(nameIn.getText()))
                   label.setText("The phrase IS a palindrome");
                else label.setText("The phrase is NOT a palindrome");
            else //clear button was pushed
            {
                nameIn.setText("");
                label.setText("?");
            }
        }
           
    }//end of ButtonListener() class
}//end of PalindromeGUI class
