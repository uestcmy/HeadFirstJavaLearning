import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class MyDrawPanel extends JPanel{
	public void paintComponent(Graphics g){
		g.setColor(Color.pink);
		g.fillRect(20,50,100,100);
	}
}
class MyPic extends JPanel{//picture!
	public void paintComponent(Graphics g){
		Image im = new ImageIcon("ico1.png").getImage();
		
		g.fillOval(70,70,100,100);
		g.drawImage(im,150,150,this);
		g.setColor(Color.pink);
		g.fillRect(20,50,100,100);
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
		g.fillOval(70,70,100,200);//start x,y,width,hight
	}
}
class CH12_SimpleGui1B implements ActionListener{
        JButton button;
	JButton Mybutton;
        public static void main(String[] args){
		CH12_SimpleGui1B gui = new CH12_SimpleGui1B();
		gui.go();
	}
	public void go(){
          	JFrame frame = new JFrame();
          	button = new JButton("click me");
          	button.addActionListener(this);
          	Mybutton = new JButton("choose me");
          	MyDrawPanel g1 = new MyDrawPanel();
		MyPic g2 = new MyPic();
		MyRo g3 = new MyRo();

          	frame.getContentPane().add(BorderLayout.SOUTH,button);
		//frame.getContentPane().add(Mybutton);
		//frame.getContentPane().add(g3);
		
          	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          	frame.setSize(300,300);
          	frame.setVisible(true);
     	}
     	public void actionPerformed(ActionEvent event){
          	button.setText("I've been cliked!");
     	}
	
}