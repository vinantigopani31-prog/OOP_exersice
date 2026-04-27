import java.util.LinkedList;

class GenericSearch {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String args[]) {

        LinkedList<Integer> rollNo = new LinkedList<Integer>();
        rollNo.add(101);
        rollNo.add(102);
        rollNo.add(103);

        System.out.println("Search Roll No 102: " +
                searchElement(rollNo, 102));

        LinkedList<String> names = new LinkedList<String>();
        names.add("priya");
        names.add("Amit");
        names.add("riyansh");

        System.out.println("Search Name Amit: " +
                searchElement(names, "Amit"));
    }
}

/*output 
Search Roll No 102: true
Search Name Amit: true */