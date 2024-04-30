import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static List<List<Integer>> findPermutations(int[] numbers) {
        List<List<Integer>> permutations = new ArrayList<>();
        permute(numbers, 0, permutations);
        return permutations;
    }

    private static void permute(int[] arr, int index, List<List<Integer>> permutations) {
        if (index == arr.length - 1) {
            // Add current arrangement to results
            List<Integer> permutation = new ArrayList<>();
            for (int num : arr) {
                permutation.add(num);
            }
            permutations.add(permutation);
        } else {
            for (int i = index; i < arr.length; i++) {
                // Swap current element with next elements and recurse
                swap(arr, index, i);
                permute(arr, index + 1, permutations);
                swap(arr, index, i); // Backtrack (swap back)
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        List<List<Integer>> permutations = findPermutations(numbers);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}