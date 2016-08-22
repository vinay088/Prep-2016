

import java.util.HashMap;

/***
 * 
 * @author Vinay Shivakumar
 * Problem: Given an array of integers, find the indexes of the two 
 * numbers such that they add up to a specific target and return the indexes
 * Assumption: each input would have exactly one solution
 * 
 */

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] num1 = {2,7,11,15};
		int[] nums = {3,2,4};
		int [] res = twoSum2(nums,6);
		System.out.println("Index1 =" + res[0] + "    Index2 =" + res[1]  );
	
		
	}
	
	/***
	 * Using Brute force method
	 * @param nums
	 * @param target
	 * @return array of two index
	 * Time complexity of O(N Square)
	 */
	public static int[] twoSum(int[] nums, int target) {
        int i = 0 , j = 0;
        int res[] = new int[2];
        System.out.println(nums.length);
        for (  i = 0 ; i < nums.length-1; i++){
        	System.out.println("I  = " + i );
            for (  j = i+1 ; j <= nums.length-1; j++){
            	System.out.println("J = " + j);
                if ( (nums[i]+nums[j]) == target){
                	System.out.println("HERE " + i +  "     " +  j);
                  res[0]= i;
                  res[1]= j;
                  System.out.println(res[1]);
                  return res;
                }
                System.out.println("OUT ");
            }
        }
        return res;
    }
	
	/***
	 * Using HASHMAP
	 * @param nums
	 * @param target
	 * @return array of two indices
	 * Time Complexity of O(N)
	 */
	public static int[] twoSum2(int[] nums, int target) {
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int[] res=new int[2];

        for ( int i = 0 ; i < nums.length; i++){
            if ( hmap.containsKey(nums[i])){
                int index = hmap.get(nums[i]);
                res[0] = index;
                res[1] = i;
                break;
            }
            else{
                hmap.put(target-nums[i],i);
            }
        }
        return res;
    }

}
