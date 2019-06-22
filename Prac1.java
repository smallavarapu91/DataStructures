// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM

package practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Prac1
{    
	public static void main(String[] args) {
	    // int arr[] = { 1, 0, 0, 0, 0, 1, 0, 0 };
	    // int days = 1;
	    Prac1 eightHouse = new Prac1();
	    int arr[] = { 1, 0, 0, 0, 0, 1, 0, 0 };
	    int days = 2;
	    System.out.println(eightHouse.cellCompete(arr, days));
	}
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<Integer> cellCompete(int[] states, int days){
    
    List<Integer> currentCellStates = Arrays.stream(states).boxed().collect(Collectors.toList());
    return getCellStateAfterNDays(currentCellStates, days);
}
    
    private List<Integer> finalStates = new ArrayList<>();
private List<Integer> getCellStateAfterNDays(List<Integer> currentCellStates, int days) {
    List<Integer> changedCellStates = new ArrayList<>();
    int stateUnoccupied = 0;
    if (days != 0) {
        for (int i1 = 0; i1 < currentCellStates.size(); i1++) {
            if (i1 == 0) {
                changedCellStates.add(calculateCellState(stateUnoccupied, currentCellStates.get(i1 + 1)));

            } else if (i1 == 7) {
                changedCellStates.add(calculateCellState(currentCellStates.get(i1 - 1), stateUnoccupied));

            } else {
                changedCellStates
                        .add(calculateCellState(currentCellStates.get(i1 - 1), currentCellStates.get(i1 + 1)));
            }
        }
        if (days == 1) {
            //System.out.println(finalStates);
            finalStates = new ArrayList<>(changedCellStates);
            return finalStates;
        }
        days = days - 1;
       // System.out.println(finalStates);
        getCellStateAfterNDays(changedCellStates, days);
    }
    return finalStates;
}
private int calculateCellState(int previousLeft, int previousRight) {
    if ((previousLeft == 0 && previousRight == 0) || (previousLeft == 1 && previousRight == 1)) {
        // the state gets now changed to 0
        return 0;
    }
        // the state gets now changed to 0
    return 1;
}

  // METHOD SIGNATURE ENDS
}