package lab10;

public class SelectionSort {

	 private int temp;

		/** Creates a new instance of SelectionSort */
	    public SelectionSort() {
	    }

	    public int[] basicSelectionSort(int[] x) {

	    	for (int i = 0; i < x.length - 1; i++) {//added the -1 array was going out of bounds

	            for (int j= i+1; j < x.length; j++) {

	                if (x[i] > x[j]) {

	                    temp = x[i];
	                    x[i] = x[j];
	                    x[j] = temp; 	  /*swapped these 2 as well.
	                    			  *original swap algorithm was wrong
	                    			  *"temp = x[j];" before printing all 2's */
	                }
	            }
	        }
	        return x;
	    } // end of basicSelectionSort method
}
