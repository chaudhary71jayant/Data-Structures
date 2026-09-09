//Find the smallest number greater than the target

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0};
        int target = 0;

        int result = CeilingNum(arr, target);

        System.out.print("The ceiling of the number" + target + "is  : "+ result);
    }

    static int CeilingNum(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            } else if(target > arr[mid]){
                start = mid+1;
            } else {
                end = mid-1;
            }

            
        }
        return start;
    }
}
