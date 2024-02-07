package ContainerWithMostWater;
public class Main {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 9, 4, 8, 3, 7,100,81};
        System.out.println("Max area: " + maxArea(height1)); // Çıktı: 49

        int[] height2 = {1, 10, 1};
        System.out.println("Max area: " + maxArea(height2)); // Çıktı: 1
    }
}
