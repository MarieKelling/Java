import javax.swing.JOptionPane;
public class InputDialogBox
{

	public static void main(String[] args)
	{
	 
	 String result;
	 result = JOptionPane.showInputDialog(null,                        /*Parent Component-Position on screen*/
	                       "What is your name?",                       /*Prompt*/
						   "Input",                                    /*Title*/
						   JOptionPane.QUESTION_MESSAGE);              /*Icon*/
						   
	 JOptionPane.showMessageDialog(null, "Hello, " + result + "!"); 
	}
	
}