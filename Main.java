import java.util.*;
    class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> seen = new HashSet<>();
        for ( int n:nums){
            if(seen.contains(n)){
                return true;
            }
            seen.add(n);
        }
        return false;
     }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Solution solution = new Solution();
        System.out.println(solution.hasDuplicate(nums));
        scanner.close();
    }
}
