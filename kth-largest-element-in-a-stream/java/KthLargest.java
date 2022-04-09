class KthLargest {
    /*
    * We need to find the "kth" largest value 
    * k is the int provided in KthLargest
    * int[] is the starting array.
    *
    * Each time add() is called it will
    * add a value to the the arraylist of int
    * and it will return the kth largest value
    */
    public int kth = 0;
    public int kth_value = 0;
    public ArrayList<Integer> numbers = new ArrayList<>();
    public KthLargest(int k, int[] nums) {
        kth = k;
        for (int i : nums) numbers.add(i);
        Collections.sort(numbers);
    }    
    public int add(int val) {
        numbers.add(val);
        Collections.sort(numbers);
                int position = 0;
        for(int i : numbers){
            position++;
            if (position == (numbers.size() - (kth-1))){
                kth_value = i;
            }
        }
        return kth_value;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
