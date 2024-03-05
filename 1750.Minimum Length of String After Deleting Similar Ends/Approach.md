# Approach:
My approach to this problem is very simple. I first check if the two characters (left and right) are equal. If so, I need to ensure if the subsequent characters are the same, so I loop through both sides using while loops. Finally, when no more common characters are found, the number of characters left is clearly the difference between the right and left values. why? well, Think of it as an interval [left, right], to know the length of that interval, we simply subtract the difference.I add one since right starts from length-1.
And that's it ^-^
# Time complexity:
    O(N)
  The algorithm iterates through the string once from both ends, making it linear in time complexity.

# Space complexity:
    O(1)
The algorithm uses only a constant amount of extra space, irrespective of the size of the input string s.
