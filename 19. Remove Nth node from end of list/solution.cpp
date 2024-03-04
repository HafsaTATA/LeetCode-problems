/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* toRemove = head;
        ListNode* pointer = head;
        ListNode* prev = head;
        //we set the envirnemnt first:
        for(int i=1;i<n;i++){
            pointer=pointer->next;
        }
        while(pointer->next!=nullptr){
            prev=toRemove;
            toRemove=toRemove->next;
            pointer = pointer->next;
        }
        if(prev!=toRemove){
            prev->next=toRemove->next;  
        }else{
            head=head->next;
        }
            
    
        return head;
    }
};
