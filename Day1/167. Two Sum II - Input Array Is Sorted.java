

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int temp = numbers.length - 1;
        int[] arr = new int[2]; 
        
        while (i < temp) {
            int sum = numbers[i] + numbers[temp];
            if (sum == target) {
                arr[0] = i + 1;
                arr[1] = temp + 1;
                return arr;
            } else if (sum < target) {
                i++;
            } else {
                temp--;
            }
        }
        
        return arr;
    }
}
