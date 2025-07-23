import java.util.*;
public class toosum{
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> bum= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int diff=target-n;
            if(bum.containsKey(diff)){
                return new int[]{bum.get(diff),i};
            }
            bum.put(n,i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target = scanner.nextInt();

        toosum solution = new toosum();
        int[] result = solution.twoSum(nums, target);
        
        if (result.length == 0) {
            System.out.println("No two numbers add up to the target.");
        } else {
            System.out.println("Indices of the two numbers that add up to the target: " + result[0] + ", " + result[1]);
        }
        
        scanner.close();
    }
}
