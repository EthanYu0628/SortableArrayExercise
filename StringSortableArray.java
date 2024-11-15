import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSortableArray {

    private List<String> strList;

// constructor for string list
    public StringSortableArray(String... strings) {
        this.strList = new ArrayList<>();
        Collections.addAll(this.strList, strings);
    }


    public void sortAsc() {
        if (strList != null) {
            Collections.sort(strList);
        }
    }


    public void sortDesc() {
        if (strList != null) {
            strList.sort(Collections.reverseOrder());
        }
    }


    public List<String> getList() {
        return strList;
    }


    public static void main(String[] args) {
        StringSortableArray stringArray = new StringSortableArray("banana", "apple", "cherry", "date");

        System.out.println("Original String List: " + stringArray.getList());
        stringArray.sortAsc();
        System.out.println("Ascending: " + stringArray.getList());
        stringArray.sortDesc();
        System.out.println("Descending: " + stringArray.getList());
    }
}
