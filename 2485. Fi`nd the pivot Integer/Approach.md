![WhatsApp Image 2024-03-13 à 22 05 06_2b9ba11e](https://github.com/HafsaTATA/LeetCode-problems/assets/120058921/c91e386c-3961-499f-b16c-88b4c48a5fa4)
# Intuition:
At first sight, I noticed that we are looking for a pivot integer that represents the sum of an arithmetic sequence. Notably, for the first example we have:

    Input: n = 8
    Output: 6
    Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
# Approach:

We have `1+2+3+4+.....+n` an arithmetic sequence with a common difference r=1.
According to the general rule of arithmetic sequences:
- #### Expression for the sum of the first terms: 
for n∈N, we define Sn by Sn=u0+⋯+un. Then for any natural number n, Sn=(n+1)×(u0+un)/2.
- #### Sum of consecutive terms: 
More generally, if we seek to calculate up+⋯+uq,
with q≥p≥0, then up+⋯+uq=(q−p+1)×(up+uq)/2.
#

#### SO: 
  

           
        1️⃣ 1->x= Sx= (x+1)×(0+x)/2=(x+1)×x/2.
        2️⃣ x->n= ux+⋯+un=(n−x+1)×(n+x)/2
            =(nx+n²-x²-xn+x+n)/2=n(n+1)/2-x(x-1)/2
    
We want to find x such that: Sx=Ux+.....Un 

→ (x+1)×x/2=n(n+1)/2-x(x-1)/2 

→ x= sqrt(n(n+1)/2) ✅  **SOLUTION**
