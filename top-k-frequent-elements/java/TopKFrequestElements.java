class TopKFrequentElements {
	public static int[] topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> countMap = new HashMap<>();
		for (int i = 0 ; i < nums.length; i++) {
			int count = 0;
			int current = nums[i];
			if(countMap.containsKey(current)) {
				count = countMap.get(current);
			}
			count++;
			countMap.put(current, count);
		}
		Queue<Integer> queue = new PriorityQueue((n1,n2) -> countMap.get(n1) - countMap.get(n2));
		for (int n : countMap.keySet()) {
			queue.add(n);
			if(queue.size() > k) queue.poll();
		}
		
		int[] order = new int[k];
		for (int i = k-1; i >=0 ; i --) {
			order[i] = queue.poll();
		}
		return order;
	}
}
