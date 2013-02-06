import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH12_ChangeColor implements ActionListener{
	JFrame frame;
	public static void main(String[] args){
		CH12_ChangeColor gui = new CH12_ChangeColor();
		gui.go();
	}//end main	
	public void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Change colors");
		button.addActionListener(this);

		MyRo drawPanel = new MyRo();
		
		frame.getContentPane().add(BorderLayout.SOUTH,button);
		frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		frame.repaint();
	}
}
class MyRo extends JPanel{
	public void paintComponent(Graphics g){
		g.fillRect(0,0,this.getWidth(),this.getHeight());
		int red = (int)(Math.random()*255);
		int green = (int)(Math.random()*255);
		int blue = (int)(Math.random()*255);
		
		Color randomColor = new Color(red,green,blue);
		g.setColor(randomColor);
		g.fillOval(70,70,100,100);//start x,y,width,hight
	}
}