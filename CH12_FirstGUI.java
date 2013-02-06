import javax.swing.*;
public class CH12_FirstGUI{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		if( args.length ==2 )
		{
			int Width = Integer.parseInt(args[0]);
			int High = Integer.parseInt(args[1]);
			frame.setSize(Width,High);
			frame.setVisible(true);
		}
	}
}