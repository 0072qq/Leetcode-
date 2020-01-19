package 最长公共前缀;

public class removeDuplicates {
    int removeduplicates(int[] nums ){
        int a = nums.length;
        int num=0;
        for(int i=0;i<nums.length-1;i++) {
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[j]=Integer.MAX_VALUE;
                }
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=Integer.MAX_VALUE){
                nums[num]=nums[k];
                num++;
                System.out.println(nums[k]);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,0,1,1,1,2};
        removeDuplicates removeDuplicates = new removeDuplicates();
        int removeduplicates = removeDuplicates.removeduplicates(nums);
        System.out.println(removeduplicates);
    }
}
