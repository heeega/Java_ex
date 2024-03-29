package sec02.test04;

public class Max {

	public static void main(String[] args) {
		int max=0;
		int[] array= {1,5,3,8,2};
		
		for(int i=1;i<array.length;i++) {
			if(array[i]>array[i-1]) {
				max=array[i];
			}
		}
		
		System.out.println("max: "+max);

	}

}
