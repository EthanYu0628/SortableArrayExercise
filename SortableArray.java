import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortableArray {

    private List<Integer> intList;
    private List<String> strList;

    // Constructor for integer list
    public SortableArray(List<Integer> intList) {
        this.intList = new ArrayList<>(intList);
    }

    // Constructor for string list
    public SortableArray(String... strings) {
        this.strList = new ArrayList<>();
        Collections.addAll(this.strList, strings);
    }

    // Method to sort integers in ascending order
    public void sortIntegersAsc() {
        if (intList != null) {
            Collections.sort(intList);
        }
    }

    // Method to sort integers in descending order
    public void sortIntegersDesc() {
        if (intList != null) {
            intList.sort(Collections.reverseOrder());
        }
    }

    // Method to sort strings in ascending order
    public void sortStringsAsc() {
        if (strList != null) {
            Collections.sort(strList);
        }
    }

    // Method to sort strings in descending order
    public void sortStringsDesc() {
        if (strList != null) {
            strList.sort(Collections.reverseOrder());
        }
    }

    // Getter for integer list
    public List<Integer> getIntList() {
        return intList;
    }

    // Getter for string list
    public List<String> getStrList() {
        return strList;
    }

    public static void main(String[] args) {
        // Testing integer sorting
        List<Integer> integers = List.of(5, 3, 8, 1, 9);
        SortableArray integerArray = new SortableArray(integers);

        System.out.println("Original Integer List: " + integerArray.getIntList());
        integerArray.sortIntegersAsc();
        System.out.println("Ascending: " + integerArray.getIntList());
        integerArray.sortIntegersDesc();
        System.out.println("Descending: " + integerArray.getIntList());

        // Testing string sorting
        SortableArray stringArray = new SortableArray("banana", "apple", "cherry", "date");

        System.out.println("\nOriginal String List: " + stringArray.getStrList());
        stringArray.sortStringsAsc();
        System.out.println("Ascending: " + stringArray.getStrList());
        stringArray.sortStringsDesc();
        System.out.println("Descending: " + stringArray.getStrList());
    }
}
