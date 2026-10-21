import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
          return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
        // Base Cases
        // 1. If the index is greater than or equal to the array length, you won the game.
        if (i >= game.length) {
            return true;
        }
        // 2. If the index is negative or pointing to a blocked cell (value 1), you cannot proceed.
        if (i < 0 || game[i] == 1) {
            return false;
        }

        // Mark the current cell as visited by setting it to 1 to avoid infinite recursion loops
        game[i] = 1;

        // Recursively check all three allowed moves:
        // Move forward by 'leap', move forward by 1, or move backward by 1
        return isSolvable(leap, game, i + leap) || 
               isSolvable(leap, game, i + 1) || 
               isSolvable(leap, game, i - 1);
    }    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
