package Algorithms;

public class SolveHanoi {
	public void SolveHanoi(int n, char from, char mid, char to) {
		if(n==1) {
			System.out.println("Plate 1 from "+from+" to "+to);
			return;
		}
		SolveHanoi(n-1, from, to, mid);
		System.out.println("Plate "+n+" from "+from+" to "+to);
		SolveHanoi(n-1, mid, from, to);
	}

}
 
class main{
	 public static void main(String[] args) {
		SolveHanoi algorithm=new SolveHanoi();
		algorithm.SolveHanoi(7, 'a', 'b', 'c');
	}
 }