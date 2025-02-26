package Arrays_Easy;

import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArrays {

        public static List<Integer> findUnion(int[] arr1, int[] arr2) {
            // Implement logic to find the union of two sorted arrays
            List<Integer> ans = new ArrayList<>();
            int n = arr1.length;
            int m = arr2.length;
            int i = 0, j = 0;
            while (i < n && j < m) {
                if(arr1[i] <= arr2[j]) {
                    if(ans.isEmpty() || ans.getLast() != arr1[i]) ans.add(arr1[i]);
                    i++;
                }else {
                    if(ans.isEmpty() || ans.getLast() != arr2[j]) ans.add(arr2[j]);
                    j++;
                }
            }
            while (i < n) {
                if(ans.isEmpty() || ans.getLast() != arr1[i]) ans.add(arr1[i]);
                i++;
            }
            while (j < m) {
                if(ans.isEmpty() || ans.getLast() != arr2[j]) ans.add(arr2[j]);
                j++;
            }
            return ans;
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {2, 3, 5, 6};

            List<Integer> result = findUnion(arr1, arr2);

            // Print the result
            System.out.println(result);
        }
}


