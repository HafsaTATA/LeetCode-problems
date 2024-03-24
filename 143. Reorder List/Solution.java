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
    public void reorderList(ListNode head) {
        List<ListNode> nodesArray = new ArrayList<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            nodesArray.add(currentNode);
            currentNode = currentNode.next;
        }
        int left = 0, right = nodesArray.size() - 1;
        while (left < right) {
            nodesArray.get(left).next = nodesArray.get(right);
            left++;
            if (left == right) {
                break; 
            }
            nodesArray.get(right).next = nodesArray.get(left);
            right--;
        }
        nodesArray.get(left).next = null;
        
    }
}
