import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH13_TestJCheckBox implements ActionListener{
	JCheckBox  check;
	JTextArea text;
	public static void main(String[] args){
		CH13_TestJCheckBox gui = new CH13_TestJCheckBox();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame("Test CheckBox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		text = new JTextArea(10,20);//height,width
          	text.setLineWrap(true);
          
          	JScrollPane scroller = new JScrollPane(text);
          	scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
          	scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		check = new JCheckBox("Goes to 11");
		check.addActionListener(this);

		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
          	panel.add(check);
		panel.add(scroller);
		
		frame.getContentPane().add(BorderLayout.NORTH,panel);

		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ev){
		String StatusOfBox = "Off";
		if( check.isSelected() ){
			StatusOfBox = "On";
			text.append("button clicked\n");
		}
		else{
			text.append("button not clicked\n");
		}
		System.out.println(StatusOfBox );
		
	}
}