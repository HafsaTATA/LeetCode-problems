![Capture d'écran 2024-03-11 205739](https://github.com/HafsaTATA/LeetCode-problems/assets/120058921/c7756a8f-dd85-4f15-9f78-b240f913add1)
# Approach and Intuition:
The approach I followed to solve this problem involved handling the "common" part (that includes characters shared between the `order` and `s` strings) followed by adding the extra characters (complement). 
In the first part, we iterate through the characters in the `order` string, taking into consideration the number of occurrences of each character in the `s` string, since the problem specifies:
    
    if a character x occurs before a character y in order, then x should occur before y in the permuted string.

Thus, I utilized the count method to account for these occurrences. 
Then, I appended the complement, which includes all characters that exist in `s` but not in `order`.

