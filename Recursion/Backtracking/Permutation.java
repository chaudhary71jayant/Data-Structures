//Leetcode 46
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        List<List<Integer>> ans = permute(nums);

        System.out.println(ans);
    }

    static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> list = new ArrayList<>();

        boolean[] used = new boolean[nums.length];

        backtrack(nums, new ArrayList<>(), used, list);

        return list;
    }

    static void backtrack(int[] nums,List<Integer> path,boolean[] used,List<List<Integer>> result){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                used[i] = true;
                path.add(nums[i]);
                backtrack(nums, path, used, result);

                path.remove(path.size()-1);
                used[i] = false;
            }
        }
    }
}
