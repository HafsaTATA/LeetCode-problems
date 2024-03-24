![image](https://github.com/HafsaTATA/LeetCode-problems/assets/120058921/0b47a040-a491-4d76-8ec6-f6f6d03754d3)
# Intuition:
When reading the problem, I noticed that we need to select nodes alternately from the left and right ends of the list. This observation suggests the use of left and right pointers. However, to implement this, we require a dynamic data structure whose size can change during the iteration. Arrays are static, and their size must be set from the beginning. Therefore, I decided to use a list to store the nodes dynamically.

# Approach:
The provided code aims to reorder a singly-linked list according to the specified pattern. Here's a breakdown of the approach:

1) Traverse the original linked list and store each node in an ArrayList to facilitate dynamic indexing.
 
1) Initialize two pointers, left and right, pointing to the first and last elements of the ArrayList, respectively.

1) Iterate over the ArrayList, connecting nodes from the left and right ends alternately until the pointers meet at the middle of the list.

1) Terminate the reordered list by setting the next of the last node to null.

