import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH13_TextField1 implements ActionListener{
	JTextField field;
	String UsrInput;
	JLabel label;
	JFrame frame;
	public static void main(String[] args){
		CH13_TextField1 gui = new CH13_TextField1();
		gui.go();
	}
	public void go(){
		frame = new JFrame("Test TextField");
		JPanel panel = new JPanel();
		field = new JTextField(20);
		label = new JLabel("I'm a label");
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.add(field);
		panel.add(label);

		JButton button = new JButton("Submit");
		button.addActionListener(this);
		
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.NORTH,panel);
		//frame.getContentPane().add(BorderLayout.CENTER,label);
		frame.getContentPane().add(BorderLayout.SOUTH,button);
		

		frame.setSize(350,300);
		frame.setVisible(true);
	}
	
		public void actionPerformed(ActionEvent ev){
			//System.out.println(field.getText());
			UsrInput = field.getText();
			label.setText(UsrInput);
		}	
	
}