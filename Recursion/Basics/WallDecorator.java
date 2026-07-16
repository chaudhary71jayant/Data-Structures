/*
Wall Decoration
You are given a wall of fixed height 2 units and length n units. You have two types of tiles available:

Vertical tile of size  (height = 2, width = 1).

Horizontal tile of size (widht =1, height = 2)

Your task is to determine the number of ways to completely fill the wall of size 2 x n using these tiles.

Input:
An integer 𝑛, representing the length of the wall.

Output:
An integer representing the total number of ways to fill the wall.
 */

import java.util.Scanner;

public class WallDecorator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(ways(n));

    }

    public static int ways(int n){
        if(n == 0 || n ==1 ) return 1;

        return ways(n-1) + ways(n-2);
    }
}