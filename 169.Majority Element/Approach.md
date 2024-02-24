# Intuition
The goal was to determine the majority element in the given array of integers.

# Approach
I employed a HashMap to tally the frequency of each integer in the array. This enabled the identification of the majority element, which is the element that appears more than half the length of the array.

# Complexity
### Time complexity:
    O(n) time, where n is the length of the input array
The algorithm traverses through the array once, accumulating frequencies in the HashMap.

### Space complexity:
    O(n)
The space complexity scales with the distinct elements in the array since the HashMap stores their frequencies. In the worst case, where all elements are distinct, the space complexity is O(n).
