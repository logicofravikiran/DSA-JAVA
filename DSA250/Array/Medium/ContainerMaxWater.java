package DSA250.Array.Medium;

public class ContainerMaxWater {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int width = 0;
        int length = 0;

        int maxArea = Integer.MIN_VALUE;
        int count = 0;
        while (left < right) {
            count++;
            width = right - left;
            length = Math.min(height[left], height[right]);

            maxArea = Math.max(maxArea, length * width);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("count:- " + count);
        return maxArea;
    }
}
