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
      /* pre-condition: array will be positive
* post-condition: basicSelectionSort will sort the array
* inputs: 8 9 7 10 2
* outputs: 2 7 8 9 10
* special conditions: none
*/

int[] arr = new int[5];
arr[0] = 8;
arr[1] = 9;
arr[2] = 7;
arr[3] = 10;
arr[4] = 2;

SelectionSort test1 = new SelectionSort();
test1.basicSelectionSort(arr);

for (int i = 0; i < arr.length; ++i) {
  System.out.println("the values in the (arr) array " + arr[i]);
}


/* pre-condition: array will be positive
* post-condition: basicSelectionSort will sort the Sortedarr
* inputs: 2 7 8 9 10
* outputs: 2 7 8 9 10
* special conditions: none
*/

int[] Sortedarr = new int[5];
Sortedarr[0] = 2;
Sortedarr[1] = 7;
Sortedarr[2] = 8;
Sortedarr[3] = 9;
Sortedarr[4] = 10;

SelectionSort test2 = new SelectionSort();
test2.basicSelectionSort(Sortedarr);

for (int i = 0; i < arr.length; ++i) {
  System.out.println("the values in the (Sortedarr) array " + Sortedarr[i]);
}

    }

    public void testNegative(){ // testing a list of all negative integers
      /* pre-condition: array will be negative
	     * post-condition: basicSelectionSort will sort the negArr
	     * inputs: -3 -7 -4 -8 -10
	     * outputs: -10 -8 -7 -4 -3
	     * special conditions: none
	     */


    	int[] negArr = new int[5];
    	negArr[0] = -3;
    	negArr[1] = -7;
    	negArr[2] = -4;
    	negArr[3] = -8;
    	negArr[4] = -10;

        SelectionSort test1 = new SelectionSort();
        test1.basicSelectionSort(negArr);

        for (int i = 0; i < negArr.length; ++i) {
        	System.out.println("the values in testNegative() (negArr) " + negArr[i]);
        }

    }


    public void testMixed(){ //testing a list containing positive, negative and zeros.

    }

    public void testDuplicates(){
    //testing a list containing one or more duplicate number, for both positive and negative numbers

}
