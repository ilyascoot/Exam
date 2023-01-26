package bilet7;

public class Main {
    public static void main(String[] args) {
        Integer[] integers1 = {1, 3, 5, 7};
        Integer[] integers2 = {1, 2, 3, 4 ,5};

//        LinkedIntList list1 = new LinkedIntList();
//        list1.add(1);
//        list1.add(3);
//        list1.add(5);
//        list1.add(7);
//        System.out.println(list1);
//        list1.removeAll(integers2);
//        System.out.println(list1);

        LinkedIntList list2 = new LinkedIntList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2);
        list2.removeAll(integers1);
        System.out.println(list2);
    }
}
