# Approach and intuiton: 
- In approaching this problem, I initially recognized the necessity of accessing the previous and next nodes when removing a target node from a linked list. This led me to utilize three pointers: toRemove, prev, and pointer, enabling traversal through the list and identification of the node to be removed.

- Now, the requirement is to delete from the end. For example, if `n=2`, the minimum length of the list must be 2, similarly for 3 and 4. Initially, I set the pointer to the nth node and the `prev` and `toRemove` to the head node. Then, I started checking for additional nodes to the right by incrementing the pointer and verifying if it's not equal to `nullptr`. If so, I incremented all pointers and continued until reaching the final node that indicates the end of my list. 

- In the case where the element to remove remains the head, I simply incremented the head's pointer to the next node, thereby maintaining the list's integrity.
