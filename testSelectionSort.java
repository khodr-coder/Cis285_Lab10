package lab10;
// KHODR SALMAN - CIS 285 - LAB 10
import org.junit.Test;

public class testSelectionSort {

	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive(){ //testing a list of all positive integers

    }

    public void testNegative(){ // testing a list of all negative integers

    }


    public void testMixed(){ //testing a list containing positive, negative and zeros.
      /* pre-condition: array will contain both positive and negative integers
	     * post-condition: basicSelectionSort will sort the mixArr
	     * inputs: 8  10  0  -5  2
	     * outputs: -5 0 2 8 10
	     * special conditions: none
	     */


    	int[] mixArr = new int[5];
    	mixArr[0] = 8;
    	mixArr[1] = 10;
    	mixArr[2] = 0;
    	mixArr[3] = -5;
    	mixArr[4] = 2;

        SelectionSort test1 = new SelectionSort();
        test1.basicSelectionSort(mixArr);

        for (int i = 0; i < mixArr.length; ++i) {
        	System.out.println("the values in testMixed() (mixArr) " + mixArr[i]);
        }

    }

    public void testDuplicates(){
    //testing a list containing one or more duplicate number, for both positive and negative numbers
    /* pre-condition: array will contain one or more duplicate number, for both positive and negative numbers
	     * post-condition: basicSelectionSort will sort the dupArr
	     * inputs: 8  -10  8  -10  2
	     * outputs: -10  -10  2  8  8
	     * special conditions: none
	     */

    	int[] dupArr = new int[5];
    	dupArr[0] = 8;
    	dupArr[1] = -10;
    	dupArr[2] = 8;
    	dupArr[3] = -10;
    	dupArr[4] = 2;

        SelectionSort test1 = new SelectionSort();
        test1.basicSelectionSort(dupArr);

        for (int i = 0; i < dupArr.length; ++i) {
        	System.out.println("the values in testDuplicates() (dupArr) " + dupArr[i]);
        }
    }

}
