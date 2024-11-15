import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSortableArray {

    private List<Integer> intList;

    // Constructor for integer list
    public IntegerSortableArray(List<Integer> intList) {
        this.intList = new ArrayList<>(intList);
    }

    // Method to sort integers in ascending order
    public void sortAsc() {
        if (intList != null) {
            Collections.sort(intList);
        }
    }

    // Method to sort integers in descending order
    public void sortDesc() {
        if (intList != null) {
            intList.sort(Collections.reverseOrder());
        }
    }

    // Getter for integer list
    public List<Integer> getList() {
        return intList;
    }

    // Main method to test integer sorting
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 3, 8, 1, 9);
        IntegerSortableArray integerArray = new IntegerSortableArray(integers);

        System.out.println("Original Integer List: " + integerArray.getList());
        integerArray.sortAsc();
        System.out.println("Ascending: " + integerArray.getList());
        integerArray.sortDesc();
        System.out.println("Descending: " + integerArray.getList());
    }
}
