package bilet6;

import java.util.*;

public class Main {

    public static ArrayList<String> guavaSort(ArrayList<String> data){
        TreeMap<String, Integer> map = new TreeMap<>();
        ArrayList<String> result = new ArrayList<>();
        for (String element: data) {
            if (!map.containsKey(element)){
                map.put(element, 1);
            }
            else{
                map.replace(element, map.get(element) + 1);
            }
        }
        for (String element: map.keySet()) {
            for (int i = 0; i < map.get(element); i++){
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"Farm", "Zoo", "Car", "Apple", "Bee", "Golf", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Bee", "Apple"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(words));
        System.out.println(arrayList);
        System.out.println(guavaSort(arrayList));

    }
}
