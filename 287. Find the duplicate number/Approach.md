
![image](https://github.com/HafsaTATA/LeetCode-problems/assets/120058921/70f00145-b1cd-4436-bb12-eb656cb1bfba)

# Approach:
I utilized a HashSet to efficiently detect duplicates while iterating through the array. if the elemnt already exists(is a duplicate) then teh add() method returns False.

The code has a time complexity of O(n) since it iterates through the array once, and the average time complexity of HashSet operations like add() is O(1). However, it uses additional space proportional to the number of distinct elements in the array.

**NB:** U can use the Floyd's Tortoise and Hare algorithm instead.

here's a link to understand the 2nd appraoch:

[![youtube](https://img.shields.io/badge/youtube-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://www.youtube.com/watch?v=wjYnzkAhcNk)
