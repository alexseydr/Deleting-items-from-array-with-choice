import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0};
       int[] nums2 = {2,5,6};
       int[] nums = {3,2,2,3};
       int val = 3;
        int k = 0;

                for (int i = 0;i<nums.length-1;i++){
                    if(nums[i]==val){
                        nums[i]=0;
                        Boolean check = false;
                        while(!check){
                            check = true;
                            for(int j = 0;j<nums.length-1;j++){
                                if(nums[j]<nums[j+1]){
                                    int temp = nums[j];
                                    nums[j] = nums[j+1];
                                    nums[j+1] = temp;
                                    check = true;
                                }

                            }


                        }
                    }


                }

         for(int g = 0; g<nums.length;g++){
            if(nums[g]!=val&&nums[g]!=0){
                k++;

            }

        }

                System.out.println(k+Arrays.toString(nums));

            }
        }




