

public class testSort {
	public static void main(String[] args){
		
		//declare the array we want to sort
		int [][] numbers = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		
		System.out.println("The array before sort");
		
		//print the array before sort
		for(int row = 0 ; row < numbers.length ; row++ ){
			
			for(int column = 0 ; column < numbers[1].length ; column++ ){
				
				if(column%2==0){
					System.out.print("(");
				}
				
				System.out.print(numbers[row][column]);
				if(column==0){
					System.out.print(",");
				}
				
				if(column%2==1){
					System.out.print(")");
				}
			}
			
			
		}
		System.out.println("");
		
		//sort the array by the method
		sort(numbers);
		
		
	}
	
	public static void sort(int m[][]){
		
		System.out.println("The array after sort");
	
		//sort
		for(int pass = 1 ; pass < m.length ; pass++ ){
			
			for(int row = 0; row < m.length - 1 ; row++ ){
				 
				//sort the first element
				if(m[row][0]>m[row+1][0]){
					
					int[] hold = m[row];

					m[row] = m[row+1];

					m[row+1] = hold;
				
				}//sort the second element
				if( (m[row][1] > m[row+1][1]) && (m[row][0] == m[row+1][0]) ){
					
					int[] hold = m[row];

					m[row] = m[row+1];

					m[row+1] = hold;
					
				}
			}
	
		}

	//print result
		for(int row = 0 ; row < m.length ; row++ ){
			
			for(int column = 0 ; column < m[1].length ; column++ ){
				
				if(column%2==0){
					System.out.print("(");
				}
				
				System.out.print(m[row][column]);
				if(column==0){
					System.out.print(",");
				}
				
				if(column%2==1){
					System.out.print(")");
				}
			}
			
		}
		
	}
}
	
	
	
	




