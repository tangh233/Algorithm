package com.tangh.alglibrary.offer;

import java.util.HashMap;

public class CopyRandomList {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    HashMap<Node, Node> hashMap = new HashMap<>();

    public Node copyRandomList(Node head) {
        Node tmp = head;
        while (tmp != null) {
            Node node = new Node(tmp.val);
            hashMap.put(tmp, node);
            tmp = tmp.next;
        }

        tmp = head;
        while (tmp != null) {
            Node node = hashMap.get(tmp);
            node.next = hashMap.get(tmp.next);
            node.random = hashMap.get(tmp.random);

            tmp = tmp.next;
        }

        return hashMap.get(head);
    }
}
