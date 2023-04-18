package arrays;

public class ProblrmSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 1, 2, 4, 5, 6, 7, 4, 5, 4 };
	        int l = arr.length;
	        for (int i = 0; i < arr.length; i++) {
	            boolean duplicate = false;
	            for (int j = 0; j < i; j++) {
	                if (arr[i] == arr[j]) {
	                	duplicate = true;
	                }
	            }
	            if (duplicate) {
	                for (int j = i; j < arr.length-1; j++) {
	                    arr[i] = arr[i+1];
	                }
	                l--;
	            }
	        }

	        
	        for (int i = 0; i < l; i++) {
	            System.out.print(arr[i] + " ");
	        }
	       
	}

}
