package top100.List;

import java.util.HashMap;
import java.util.Map;

class Node{
    int key;
    int value;
    Node next;
    Node pre;
    Node(){}
    Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {
    Map<Integer, Node> hashMap;
    int capacity;
    int length = 0;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        int initial = (int) (capacity / 0.75);
        this.hashMap = new HashMap<>(initial);
        this.capacity = capacity;
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        if (hashMap.containsKey(key)){
            Node node = hashMap.get(key);
            node.pre.next = node.next;
            node.next.pre = node.pre;
            insertToTail(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (hashMap.containsKey(key)){
            Node node = hashMap.get(key);
            node.value = value;
            node.pre.next = node.next;
            node.next.pre = node.pre;
            insertToTail(node);
        }else {
            Node node = new Node(key, value);
            if (capacity <= length){
                hashMap.remove(head.next.key);
                head.next = head.next.next;
                head.next.pre = head;
            }
            insertToTail(node);
            hashMap.put(key, node);
            length ++;
        }
    }

    private void insertToTail(Node node){
        tail.pre.next = node;
        node.pre = tail.pre;
        tail.pre = node;
        node.next = tail;
    }
}
