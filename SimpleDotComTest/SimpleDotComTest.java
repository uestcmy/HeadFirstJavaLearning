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
			int num = Integer.parseInt(guess);
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
public class SimpleDotComTest{
	public static void main(String args[]){
		SimpleDotCom dot = new SimpleDotCom(); 
		int[] lo = {2,3,4};		
		dot.setLocationCells(lo);
		int num  = 0;
		dot.setNumOfHits(num);
		String guess = "2";
		String res = dot.checkYourself(guess);
		System.out.println(res);
	}
}
