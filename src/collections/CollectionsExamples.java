package collections;

import java.util.*;

public class CollectionsExamples {
    public static void main(String[] args) {
        List<String> iterableList = new ArrayList<>();
        populateCollection(iterableList);
        Iterable<String> iterable = iterableList;

        System.out.println("Iterable");
        System.out.println("===============\n");

        Iterator<String> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        for (String element : iterable) {
            System.out.println(element);
        }

        System.out.println("\nArray List");
        System.out.println("===============\n");

        List<String> arrayList = new ArrayList<>();
        populateCollection(arrayList);

        for (String element : arrayList) {
            System.out.println(element);
        }

        System.out.println("\nLinked List");
        System.out.println("===============\n");

        List<String> linkedList = new LinkedList<>();
        populateCollection(linkedList);

        for (String element : linkedList) {
            System.out.println(element);
        }

        System.out.println("\nHash Set");
        System.out.println("===============\n");

        Set<String> hashSet = new HashSet<>();
        populateCollection(hashSet);

        for (String element : hashSet) {
            System.out.println(element);
        }

        System.out.println("\nTree Set");
        System.out.println("===============\n");

        Set<String> treeSet = new TreeSet<>();
        populateCollection(treeSet);

        for (String element : treeSet) {
            System.out.println(element);
        }

        System.out.println("\nLinked Hash Set");
        System.out.println("===============\n");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        populateCollection(linkedHashSet);

        for (String element : linkedHashSet) {
            System.out.println(element);
        }

        System.out.println("\nQueue");
        System.out.println("===============\n");

        Queue<String> queue = new LinkedList<>();
        populateCollection(queue);

        for (String element : queue) {
            System.out.println(element);
        }

        System.out.println("\nDeque");
        System.out.println("===============\n");

        Deque<String> deque = new LinkedList<>();
        populateCollection(deque);

        for (String element : deque) {
            System.out.println(element);
        }

        System.out.println("\nArray Deque");
        System.out.println("===============\n");

        Deque<String> arrayDeque = new ArrayDeque<>();
        populateCollection(arrayDeque);

        for (String element : arrayDeque) {
            System.out.println(element);
        }

        System.out.println("\nHash Map");
        System.out.println("===============\n");

        Map<String, String> hashMap = new HashMap<>();
        populateMap(hashMap);

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nTree Map");
        System.out.println("===============\n");

        Map<String, String> treeMap = new TreeMap<>();
        populateMap(treeMap);

        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nLinked Hash Map");
        System.out.println("===============\n");

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        populateMap(linkedHashMap);

        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private static void populateCollection(Collection<String> collection) {
        collection.add("first");
        collection.add("first");
        collection.add("third");
        collection.add("third");
        collection.add("second");
        collection.add("second");
    }

    private static void populateMap(Map<String, String> map) {
        map.put("first", "1");
        map.put("first", "1");
        map.put("third", "3");
        map.put("third", "3");
        map.put("second", "2");
        map.put("second", "2");
    }
}