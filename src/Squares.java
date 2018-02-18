/*Given a paper of size M x N. Cut the paper into squares of any size. 
Find the minimum number of squares that can be cut from the paper. */

import java.util.Scanner;
class Squares{
static void swap(int a,int b)
{
	int temp=a;
	a=b;
	b=temp;
}
static int minSquares(int x,int y)
{
	int res=0,rem=0;
	if (x < y){
		swap(x, y);
	}
	while (y > 0){
		res += x/y;
		rem = x % y;
		x = y;
		y = rem;
	}
	return res;
}
public static void main(String[] args)
{
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt(); 
	System.out.println(minSquares(a, b));
}
}

