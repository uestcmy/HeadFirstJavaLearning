import javax.swing.*;
import java.awt.*;

public class CH13_BoderLayout{
	public static void main(String[] args){
		CH13_BoderLayout gui = new CH13_BoderLayout();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame("Test position");
		JPanel panel = new JPanel();
		JButton button = new JButton("shock me");
		Font bigFont = new Font("serif",Font.BOLD,28);
		button.setFont(bigFont);
		JButton button2 = new JButton("ok");
		panel.setBackground(Color.darkGray);

		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.add(button);
		panel.add(button2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.EAST,panel);//ÀÆ∆Ω∑≈÷√
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}