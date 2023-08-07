package selfPractice.leetcode;

import java.util.Arrays;

// Average Salary Excluding the Minimum and Maximum Salary
class Solution {
    public double largest(int[] salary) {
        int maxSalary = Integer.MIN_VALUE;
        int [] second = new int[salary.length - 1];
        for (int i = 0; i<salary.length;i++) {
            if (salary[i] > maxSalary) {
                maxSalary = salary[i];
            }
        }

        return maxSalary;

    }
    public double secondLargest(int[] salary) {
        int temp;
        for (int i = 0; i < salary.length; i++) {
            for (int j = i + 1; j < salary.length; j++) {
                if (salary[i] > salary[j]) {
                    temp = salary[i];
                    salary[i] = salary[j];
                    salary[j] = temp;
                }
            }
        }
        return salary[salary.length-2];
    }
    public double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        int totalSalary = 0;
        int numEmployees = 0;
        
        for (int i = 0; i<salary.length;i++) {
            if (salary[i] < minSalary) {
                minSalary = salary[i];
            }
            if (salary[i] > maxSalary) {
                maxSalary = salary[i];
            }
            totalSalary += salary[i];
            numEmployees++;
        }
        
        totalSalary -= minSalary + maxSalary;
        numEmployees -= 2;
        
        return (double) totalSalary / numEmployees;
    
    }
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}

class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] salary = {4000, 3000, 1000, 2000};
        System.out.println(s.average(salary));
        //System.out.println("largest");
        System.out.println("largest = " + s.largest(salary));
        //System.out.println("second Largest");
        System.out.println("second largest = " + s.secondLargest(salary));

        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        int[] n = {1,2,3,4};
        System.out.println(s.containsDuplicate(nums));
        System.out.println(s.containsDuplicate(n));

    }
}