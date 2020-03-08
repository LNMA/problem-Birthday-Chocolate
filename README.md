# problem-Birthday-Chocolate

1-Review:

Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an integer on it. She 
decides to share a contiguous segment of the bar selected such that the length of the segment matches Ron's birth month and the sum of the integers on the squares is equal to his birth day. You must determine how many ways she can divide the chocolate.

Consider the chocolate bar as an array of squares,s=[2,2,1,3,2]. She wants to find segments summing to Ron's birth day, d=4 with a length equalling his birth month, m=2.  In this case, there are two segments meeting her criteria:[2,2] and [1,3].

2-Input Format

The first line contains an integer (n), the number of squares in the chocolate bar. The remain lines integers s[i] , the numbers on the chocolate squares where  0<=i<n .
And the last two lines Ron's birth day and his birth month.

3-Output Format

Print an integer denoting the total number of ways that Lily can portion her chocolate bar to share with Ron.

EX:

Input :

please input  numbers of the squares of chocolate  : `5`

please input number on 1 chocolate `1`

please input number on 2 chocolate `2`

please input number on 3 chocolate `1`

please input number on 4 chocolate `3`

please input number on 5 chocolate `2`

please input Ron's birth day : `3`

please input Ron's birth month : `2`

Output:

`number of way to share chocolate :  2`
