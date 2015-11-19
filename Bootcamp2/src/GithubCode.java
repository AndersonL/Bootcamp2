
public class GithubCode {

	public static void main(String[] args) {
	
		

	}
	//Task 1
	
				
	public static int smallest(int[] numbers) {
			int min = numbers[0];
			
		for(int i = 0; i< numbers.length; i++)
		{
			
			if (numbers[i] < min)
				min =numbers[i];
			
		}
		return min;	
	}

	//Task 2
	public static int[] populateArray(int left, int right, int count) {
			int j = 0;
			int[] myarray = new int[count];
			if (left > right){
				
				
			for (int i = left; i > right;--i ){
			
			myarray[j] = i;
			j++;
			}
			
			}
			else if (right >= left) {
				
			for (int i = left; i < right;++i ){
			
			myarray[j] = i;
			j++;
			}	
		
				
					}
		
			return myarray;
		}
	// Task 3
	public static double[] populateArray(double left, double right, int count){
		int j = 0;
		double[] myarray = new double[count];
		if (left > right){
			
			
		for (double i = left; i > right;--i ){
		
		myarray[j] = i;
		j++;
		}
		
		}
		else if (right >= left) {
			
		for (double i = left; i < right;++i ){
		
		myarray[j] = i;
		j++;
		}	
	
			
				}
		return myarray;
	}
	
	// Task 4
	public static int[] grow(int[] giant){
		int[] big = new int [giant.length*2];
			for (int i = 0; i<giant)
		
	}
}
