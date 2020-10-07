 /**
 * PalindromeMain is the starting point for execution.
 * Contains the code to intitialize the frame
 * 
 * @author GrayKnight 10/10/10 
 * 
   DO NOT MODIFY THIS CLASS*/

 import javax.swing.JFrame;

public class PalindromeMain
{

	public static void main(String[] ArgsgrA)
	{
	    JFrame frame = new JFrame("Palindrome Analysis");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(new PalindromeGUI());
	    frame.pack();
	    frame.setVisible(true);
	}

}
