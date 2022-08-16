package main;

public class Main {
    public static void main(String[] args) {
        reverseList(null);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
                /*
        step 1:
        head = 1
        prev = null

        listnode next = 2
        head.next = null
        prev = 1
        head = 2

        step 2:
        listnode next = 3
        head.next = 1
        prev = 2
        head = 3

        step 3:
        listnode next = 4
        head.next = 2
        prev = 3
        head = 4

        step 4:
        listnode next = 5
        head.next = 3
        prev = 4
        head = 5

        step 5:
        listnode next = null
        head.next = 4
        prev = 5
        head = null
         */
    }
}
