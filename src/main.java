import Container.myStack;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class main {

    public static void main(String[] args) {
        // List
        List<Integer> vector = new Vector<>();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Stack
        Stack<Integer> stack = new Stack<>();
        myStack<Integer> myStack = new myStack<>();

        // Queue
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Map
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();
        Map<Integer, Integer> hashTable = new Hashtable<>();
        Map<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        // Set
        Set<Integer> set = new HashSet<>();


    }

}
