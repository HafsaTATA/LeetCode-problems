![image](https://github.com/HafsaTATA/LeetCode-problems/assets/120058921/b0196981-7b2e-4482-920e-ffdf3fad86a8)

# Approcach:
Let's analyze the test cases of the problem in order to clarify the intuition behind this solution.

    we have: [1,2,-3,3,1]
    which is equivelent to : start->1->2->-3->3->1->null    [with 1 the head node & start a node of val=0 and next=head]

now if we try to track the sum all the way through the nodesList:
    
    
                                                    


| NodesList | start    | 1 | 2 | -3 | 3 | 1 |
| :-------- | :------- | :------- | :------ | :------ | :------ | :------- |
| Sum | `0`| 1 |3|`0`|3|1|
| CurrentNode | start | 1 |2 |-3 | 3 | 1 |

We notice that we have returned to the state '0' again, which means that the nodes in between [1, 2, -3] are irrelevant. So we can get rid of them. Eventually, we get:

    start->3->1->null 

To do so we'll use a hashmap `sum_Node<Integer,ListNode>` which will contain the sum as keys and nodes as values.
As we'll check if the sum(state) already exists within the hashmap keys then we link our node(in our example `start`) to node 3 wich is the `3`.next node. And we'll dlete the nodes in between from the hashmap. 

#### And dw, understanding often becomes clearer when reviewing the code!!!


Let's take another exmaple: 

    we have: [3,4,2,-6,1,1,5,-6]
    which is equivelent to : start->3->4->2->-6->1->1->5->-6->null 

now if we try to track the sum all the way through the nodesList:
| NodesList | start    | 3 | 4 | 2| -6 | 1 | 1 |5|-6|
| :-------- | :------- | :------- | :------ | :------ | :------ | :------- | :------- | :------- |  :------- |
| Sum | 0| `3` |7|9|`3`|`4`|5|10|`4`|
| CurrentNode | start |3 | 4 | 2| -6 | 1 | 1 |5|-6|

We notice that we have returned to the states `3` and `4`, which means that the nodes in between [4,2,-6] and [1,5,-6] respectively are irrelevant. So we can get rid of them. Eventually, we get:

    start->3->1->1->5->-6->null
    - then :
    start->3->1->null

