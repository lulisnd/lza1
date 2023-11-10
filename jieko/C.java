package jieko;

public class C implements B , lza{


    @Override
    public void testb1() {

    }

    @Override
    public void testb2() {

    }


    @Override
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + "," +j + "]");
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
