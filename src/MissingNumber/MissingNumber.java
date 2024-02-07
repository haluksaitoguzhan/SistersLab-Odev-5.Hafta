package MissingNumber;

import java.util.*;

public class MissingNumber {

    /*
        Constraints:
        n == nums.length
        1 <= n <= 104
        0 <= nums[i] <= n
        All the numbers of nums are unique.
     */

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int n = nums.length;

        // Beklenen toplam hesaplama
        int expectedTotal = n * (n + 1) / 2;

        // Dizideki elemanların toplamını hesaplama
        int actualTotal = 0;
        for (int num : nums) {
            actualTotal += num;
        }

        // Eksik sayıyı bulma
        int missingNumber = expectedTotal - actualTotal;

        System.out.println("Eksik Sayı: " + missingNumber);
    }
}
