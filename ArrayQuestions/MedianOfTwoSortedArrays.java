package ArrayQuestions;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {


    public static int findMedianSortedArrays(int[] nums1 , int [] nums2) {
        int commanArray[] = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                commanArray[k++] = nums1[i++];
            } else {
                commanArray[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            commanArray[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            commanArray[k++] = nums2[j++];
        }
        System.out.println(Arrays.toString(commanArray));
        // Now we have the merged array, we can find the median
        if (commanArray.length == 0) {
            return 0; // No elements in the arrays
        }

        if (commanArray.length % 2 == 1) {
            return commanArray[commanArray.length / 2];
        }
        // If the length is even, return the average of the two middle elements
        else if (commanArray.length % 2 == 0 && commanArray.length > 1) {
            int mid1 = commanArray[commanArray.length / 2 - 1];
            int mid2 = commanArray[commanArray.length / 2];
            return (mid1 + mid2) / 2;
        }
        // If the length is even and only one element, return that element
        else if (commanArray.length == 1) {
            return commanArray[0];

        } else {
            return 0; // This case should not happen with the current logic
        }
    }


    public static int betterApproach(int[] nums1, int[] nums2) {
        // This method can be implemented using binary search for better efficiency
        int median ;

        if ((nums1.length + nums2.length) % 2 == 1) {
            median = ((nums1.length + nums2.length) / 2)+1;
        }
        // If the length is even, return the average of the two middle elements
        else {
            median = (nums1.length + nums2.length) / 2 ;
        }

        System.out.println("Median position: " + median);

        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                k++;
                i++;
                if(k == median){
                    return nums1[i-1];
                }
            } else {
                k++;
                j++;
                if(k == median){
                    return nums2[j-1];
                }
            }
        }
        while (i < nums1.length) {
            k++;
            i++;
            if(k == median){
                return nums1[i-1];
            }
        }

        while (j < nums2.length) {
            k++;
            i++;
            if(k == median){
                return nums2[j-1];
            }
        }
        return 0;

    }



    public static double findMedianBinarySearch(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianBinarySearch(nums2, nums1); // Ensure nums1 is the smaller array
        }

        int x = nums1.length;
        int y = nums2.length;

        int low = 0, high = x;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxX <= minY && maxY <= minX) {
                if ((x + y) % 2 == 0) {
                    return ((double)Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
                } else {
                    return (double)Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                high = partitionX - 1; // Move left
            } else {
                low = partitionX + 1; // Move right
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println("Median of two arrays "+findMedianSortedArrays(nums1, nums2)); // Output: 2.0
        System.out.println("Median of two arrays using better approach "+betterApproach(nums1, nums2)); // Output: 2.0
    }
}
