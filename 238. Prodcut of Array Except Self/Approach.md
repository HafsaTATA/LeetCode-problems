![image](https://github.com/HafsaTATA/LeetCode-problems/assets/120058921/1403bc53-8e99-4a93-849f-c2c344540b6a)
# Intuition:
Initially, I observed that the presence of zeros in the array significantly influences the resulting output array. Three test cases helped me analyze all the possiblities:

#### 1) For nums = [1, 2, 3, 4]: no zeros exist
The output array is straightforward. Each element's value is the product of all other elements divided by the respective element itself.

#### 2)For nums = [-1, 1, 0, -3, 3]: A single zero is present
 The resulting array is [0, 0, 9, 0, 0]. Here, all elements in the output array are zero, except for positions where zeros originally resided. 

    NB: while calculating the multiplication of all elemnts we gotta be careful with the zero.

#### 3)For nums = [0, 0] or nums = [1, 0, -2, 5, 7, 0, 9]: Two or more zeros
 Every element in the output array becomes zero. This occurs because the multiplication of any element with zero results in zero. Hence, the output array is filled entirely with zeros.

# Approach:
To tackle this problem, I initially traversed the array to calculate the total multiplication value, while deliberately skipping zero elements. Additionally, I maintained a counter, zeroExist, to keep track of the number of zeros present.

Using that variable (zeroExist)
Subsequently,  i dealt with the three possibilities:

#### 1) If there were two or more zeros:
 I simply filled the nums array with zeros. 
 
 - This approach is **more memory-efficient** than creating a new array.

#### 2) When only one zero was present:
 I assigned zero to all elements other than the zero elements, which were assigned the previously calculated multiplication value.

#### 3) In cases where no zeros existed:
 I divided the multiplication value by each element in nums, effectively obtaining the desired output array.
