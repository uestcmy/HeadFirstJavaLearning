import java.io.*;
class GameHelper{
	public String getUserInput(String promt){
		String str = null;
		System.out.print(promt + "   ");
		try{
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			str= is.readLine();//提取出字符串？
			if( str.length() == 0 ){
				return null;
			}
		}catch(IOException e){
			System.out.println("IOException: "+e);    //输出错误警告？
		}
		return str;
	}
}
class SimpleDotCom{
		int[] LocationCells;
		int numOfHits;
		public void setNumOfHits(int num){
			numOfHits = num;
		}
		public void setLocationCells(int[] lo){
			LocationCells = lo;
		}
		public String checkYourself(String guess){
			int num = Integer.parseInt(guess);		//convert string to a number
			String res = "miss";
			for( int cell : LocationCells ){
				if( num == cell ){
					res = "hit";
					numOfHits ++;
					break;
				}	
			}
			if( numOfHits == LocationCells.length ){
				res = "kill";
			}
			System.out.println(res);	
			return res;	
		}
	}
public class SimpleDotComDrive{
	public static void main(String args[]){
		int numOfGuess = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom dot = new SimpleDotCom(); 
		int random = (int) ( Math.random() * 5 );
		int[] lo = {random,random+1,random+2};		
		dot.setLocationCells(lo);//设置dotcom
		boolean isAlive = true;
		while( isAlive == true ){
			String guess = helper.getUserInput("Enter a number");
			String res = dot.checkYourself(guess);
			numOfGuess ++;	
			if( res.equals("kill") ){
				isAlive = false;
				System.out.println("You took " + numOfGuess + " guesses");
			}
		}
	}
}
