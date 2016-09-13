package mypack;

public class Grade {
	public static char getLetterByMark(int mark){
		
		
		assert (mark>=0 && mark<=100) : "mark is out-of-rage: "+mark;
		
		if(mark >= 75) {
			return 'A';
			}
		else if(mark >= 60){
			return 'B';
			}
		else if(mark >= 50){
			return 'C';
		}
		else return 'F';
	}
	
	public static void main(String args[]){
		System.out.println(getLetterByMark(10));
	}
}
