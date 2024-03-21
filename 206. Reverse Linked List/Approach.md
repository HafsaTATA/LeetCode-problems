![image](https://github.com/HafsaTATA/LeetCode-problems/assets/120058921/be57c06d-4f76-4616-b438-d4695f7b960b)
# Approach:
We use a stack to store the nodes of the list in reverse order. We iterate through the list, pushing each node onto the stack. Then, we pop the nodes from the stack to construct the reversed list. Finally, we return the head of the reversed list.

📌This code isn't performing in terms of space complexity since we use a stack to store all the nodes of the list, which could potentially require storing all n nodes.Notably, the space complexity is O(n).
