package array123;

import java.util.Arrays;

public class Array123 {

	public static void main(String[] args) {
		
	    int[] arri = new int[10];
	    
	    for(int i = 0; i < arri.length; i++) {
	    	arri[i]=i;
	    	System.out.print(arri[i] + " ");
	    }
	    
	     System.out.println();
	     
	    double[] arrd = new double[10];
	    
	    for(int i = 0; i < arrd.length; i++) {
	    	arrd[i] = i;
	    	System.out.print(arrd[i] + " ");
	    }
	    
	    System.out.println();
	    
	    String[] arrs = new String[10];
	    
	    for(int i =0; i < arrs.length; i++) {
	    	arrs[i] = "Java";
	    	System.out.print(arrs[i] + " ");
	    }
	    System.out.println();
	    
	    System.out.println(Arrays.toString(arri));
	    System.out.println(Arrays.toString(arrd));
	    System.out.println(Arrays.toString(arrs));
	    
	}

}
