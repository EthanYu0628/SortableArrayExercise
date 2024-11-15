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
}
