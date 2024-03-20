![image](https://github.com/HafsaTATA/LeetCode-problems/assets/120058921/681cf5c5-38dc-4b4a-8381-9502214b9c7e)

# Intuition and Approach:

## Intuition:
I noticed that the characters that are most frequent are the ones that mainly determine the length of the output interval.

## Approach:
Discussing the following examples helped me come up with the final logic of the problem:

### Example 1:
Consider the tasks ['A','A','A','B','B'] with n=3. 

 🔹**Let's set the As:**
    
    `A` -> idle -> idle -> idle -> `A` -> idle -> idle -> idle -> A
🔹**Now, let's introduce the Bs:** 
    
    `A` -> `B` -> idle -> idle -> `A` -> B -> idle -> idle -> A
So basically, the B gets blended somewhere between the As which have the maximum frequencies. This means that only the characters with frequencies that matter the most.

### Example 2:
Now, let's consider the tasks ['A','A','A','B','B','B'] with n=2.

🔹 **Let's set the As:**
   
    `A` -> idle -> idle -> `A` -> idle -> idle -> A
🔹 **Now, let's introduce the Bs:**
   
    `A` -> `B` -> idle -> `A` -> `B` -> idle -> A -> B

So basically, we have three As, but most importantly, only two As require the n spaces ahead of it to find another A (respectively for the B). In other words, for max_count = number of frequencies and n and num_max_tasks = 2 (A and B):

A -> B -> idle -> A -> B -> idle -> A -> B

➡️ is also (A + 2 idles) * 2 + Last A + Last B = the interval length.

➡️ Which numerically is: (1 + n) * (max_count - 1) + num_max_tasks.

If you don't get the logic behind the last expression, here's another simple example:

### Example 3:
Consider the tasks ['A','A','A'] and n=2. For that, we must have:

    `A` -> idle -> idle -> `A` -> idle -> idle -> A
So basically, we have three As, but most importantly, only two As require the n spaces ahead of it to find another A. 

In other words, for max_count = number of frequencies of A and n:

A -> idle -> idle -> A -> idle -> idle -> A

➡️ Is also (A + 2 idles) * 2 + Last A = the interval length.

➡️ Which numerically is: (1 + n) * (max_count - 1) + num_max_tasks.
