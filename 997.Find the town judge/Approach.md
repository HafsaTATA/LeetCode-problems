

# Intuition

--
# Approach

I started by separating the people who trust others so I could easily identify the judge, given that the judge doesn't trust anybody (TRUSTERS). Then, I created a hashmap(TRUSTED) to keep track of people who are trusted, considering the frequency because it's crucial for the judge to be trusted by EVRYONE(n-1). Finally, I used a loop to conduct my tests. Firstly, I checked that the judge wasn't among those who trust others. Then, I verified if the judge was trusted by everyone.
Complexity

### Time complexity:
    O(E+n) where E is the number of trust relationships

### Space complexity:
    O(n)


