
public class GithubCode {

	public static void main(String[] args) {
	
		

	}
	//Task 1
	
				
	public static int smallest(int[] numbers) {
			int min = numbers[0]; //assumes that the 1st position equals zero
			
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
	// 		address of array leaves the method										could do (int[] populateMe,
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
	//states what it returns    (what is being passed thru)
	public static int[] grow(int[] giant){
		int[] big = new int [giant.length*2]; // create integer array twice the size of the passed in one.
			for (int i = 0; i<giant.length; i++) { // loop through passed in array and assign same values to new array that is twice the size
					big[i] = giant[i]; //the value from giant is being assigned to big
			}
		return big; // return the new array that is twice the size but with the same values
	//
		
	}
	// Task 5
	public static int[] shrink (int[] smaller){
		int[] little = new int [smaller.length/2];
			for (int n = 0; n<little.length; n++){
				little[n]= smaller[n];
			
			}
				return little;
	}

	// Task 6
	public static double[] grow(double[] giant){
		
		double[] newArray = new double[giant.length * 2];
		
		for (int x = 0; x < giant.length; x++)
		{
			newArray[x] = giant[x];
		}

		return newArray;
	}
	// Task 7
	public static double[] shrink (double[] smaller){
		
		double[] newArray = new double[smaller.length / 2];
		
		for (int x = 0; x< smaller.length; x++)
		{
			newArray[x] = smaller[x];
		}
		
		return newArray;
	}
	
}
			