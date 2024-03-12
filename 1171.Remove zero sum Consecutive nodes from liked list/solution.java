/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> sum_Node = new HashMap<>();
        int sum = 0;
        ListNode start = new ListNode(0);
        start.next = head;
        sum_Node.put(sum, start);
        while (head != null) {
            sum += head.val;
            if (sum_Node.containsKey(sum)) {
                ListNode toRemove = sum_Node.get(sum).next;
                int sumIterator = sum;
                while (toRemove != head) {
                    sumIterator += toRemove.val;
                    sum_Node.remove(sumIterator);
                    toRemove = toRemove.next;
                }
                sum_Node.get(sum).next = head.next;
            } else {
                sum_Node.put(sum, head);
            }
            head = head.next;
        }
        return start.next;
    }
}
