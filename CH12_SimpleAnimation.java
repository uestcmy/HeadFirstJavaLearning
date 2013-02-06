import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CH12_SimpleAnimation{
	int x = 70;
	int y = 70;
	public static void main(String[] args){
		CH12_SimpleAnimation gui = new CH12_SimpleAnimation();
		gui.go();
	}
	class MyDraw extends JPanel{
		public void paintComponent(Graphics g){

			g.setColor(Color.white);
			g.fillRect(0,0,this.getWidth(),this.getHeight());
			g.setColor(Color.green);
			g.fillOval(x,y,40,40);
		}
	}
	public void go(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDraw drawPanel = new MyDraw();
		frame.getContentPane().add(drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
		for( int i = 0 ; i < 130 ; i++ ){
			x++;
			y++;
			drawPanel.repaint();
			try{
				Thread.sleep(10);//休眠时间，时间越短，移动速度越快
			}catch(Exception ex){
			}
		}//for
	}

}