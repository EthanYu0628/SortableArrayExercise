import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSortableArray {

    private List<String> strList;

    // Constructor for string list
    public StringSortableArray(String... strings) {
        this.strList = new ArrayList<>();
        Collections.addAll(this.strList, strings);
    }

    // Method to sort strings in ascending order
    public void sortAsc() {
        if (strList != null) {
            Collections.sort(strList);
        }
    }

    // Method to sort strings in descending order
    public void sortDesc() {
        if (strList != null) {
            strList.sort(Collections.reverseOrder());
        }
    }

    // Getter for string list
    public List<String> getList() {
        return strList;
    }
}
