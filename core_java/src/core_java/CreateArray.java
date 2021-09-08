package core_java;
public class CreateArray {
	public static void main(String[]args) {
		char array[] = {'a','b','c','d'};
		int i = 0;
		int j =  array.length-1;                                                           
		
		while (i<j) {
			char temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;

		//System.out.println(array[3]);
			
		}
				
			 			
		
		System.out.println("Reversed array is");
		for(char item:array) {
			System.out.println(item+"");
		}
		
	}

}


