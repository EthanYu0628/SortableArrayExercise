import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Testing integer sorting
        List<Integer> integers = List.of(5, 3, 8, 1, 9);
        IntegerSortableArray integerArray = new IntegerSortableArray(integers);

        System.out.println("Original Integer List: " + integerArray.getList());
        integerArray.sortAsc();
        System.out.println("Ascending: " + integerArray.getList());
        integerArray.sortDesc();
        System.out.println("Descending: " + integerArray.getList());

        // Testing string sorting
        StringSortableArray stringArray = new StringSortableArray("banana", "apple", "cherry", "date");

        System.out.println("\nOriginal String List: " + stringArray.getList());
        stringArray.sortAsc();
        System.out.println("Ascending: " + stringArray.getList());
        stringArray.sortDesc();
        System.out.println("Descending: " + stringArray.getList());
    }
}
