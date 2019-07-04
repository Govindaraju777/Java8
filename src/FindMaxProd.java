import java.util.Arrays;

public class FindMaxProd {

	public static void main(String[] args) {
		test2();
		test1();
	}

	private static void test2() {
//		int[] nums = { 1, 5, 8, -2, 0, 9, -5 };
		int[] nums = { -8,-9,-4,0,8,7,5 };
		Arrays.sort(nums);
		
		double pProd = 1;
		
		for(int i=0;i<nums.length;i++){
			int num=nums[i];
			if (   nums[i]<0 && !(nums[i+1]==0  && i%2==0) ) {
				pProd=pProd*num;
			} 
			else if(num!=0 && num>0){
				pProd=pProd*num;
			}
		}
		System.out.println(pProd);
	}

	public static void test1() {

//		int[] nums = { 1, 5, 8, -2, 0, 9, -5 };
		int[] nums = { -8,-9,-4,0,8,7,5 };

		double nPro = 1;
		double pProd = 1;

		Arrays.sort(nums);
		int negativeBeforeZero = -1;

		for (int n : nums) {
			if (n != 0 && n > 0) {
				pProd = pProd * n;
			} else if (n != 0 && n < 0) {
				nPro = nPro * n;
				negativeBeforeZero = n;
			}
		}

		if (nPro < 0) {
			nPro = nPro / negativeBeforeZero;
		}

		double maxProd = nPro * pProd;
		System.out.println(maxProd);
	}
}