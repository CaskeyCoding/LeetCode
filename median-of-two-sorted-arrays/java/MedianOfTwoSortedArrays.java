	public static int[] mergedArray;
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		mergedArray = new int[nums1.length + nums2.length];
		double median = 0.0;
		int nums1Count = 0; // 
		int nums2Count = 0;
		for (int i = 0; i < mergedArray.length; i++) {
			if (nums1Count < nums1.length && nums2Count < nums2.length) {
				if(nums1[nums1Count] <  nums2[nums2Count]) {
					mergedArray[i] = nums1[nums1Count];
					nums1Count++;
				}	
				else {
					mergedArray[i] = nums2[nums2Count];
					nums2Count++;
				}
			}
			else if(nums1Count < nums1.length) {
				mergedArray[i] = nums1[nums1Count];
				nums1Count++;
			}
			else {
				mergedArray[i] = nums2[nums2Count];
				nums2Count++;
			}
		}
		boolean even = ((mergedArray.length % 2) == 0);
		if(even)median = calculateEvenMedian();
		else median = calculateOddMedian();
		
		return median;
	}
	public static double calculateEvenMedian() {
		int counter = 1;
		double median = 0.0;
		int median1Position = (mergedArray.length /2) -1 ;
		int median2Position = median1Position + 1;
		int median1 = mergedArray[median1Position];
		int median2 = mergedArray[median2Position];	
		double total = Double.valueOf(median1) + Double.valueOf(median2);
		median = total / 2;
		return median;
	}
	public static double calculateOddMedian() {
		double median = 0.0;
		int medianPosition = mergedArray.length /2;
		median = mergedArray[medianPosition];	
		return median;
		
	}
	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4,5};
		double median = findMedianSortedArrays(nums1, nums2);
	}
}

