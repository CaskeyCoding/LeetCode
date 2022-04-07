class Solution {
    public int lastStoneWeight(int[] stones) {
        // CHANGE TO ARRAYLIST TO ADD / REMOVE EASILY
        List<Integer> stoneArray = new ArrayList<Integer>();
        for (int i = 0; i< stones.length; i++)
            stoneArray.add(stones[i]);
        
        while(stoneArray.size() > 1){
        //ITERATE THROUGH THE ARRAYLIST
            int smash = 0;
            Collections.sort(stoneArray); // SORT SMALLEST TO LARGEST
            if (stoneArray.get(stoneArray.size()-1) == stoneArray.get(stoneArray.size()-2))
                stoneArray.remove(stoneArray.size()-1); // IF ITS THE SAME NUMBER, DELETE THE LAST INT
            else {
                //IF DIFFERENT, SUBTRACT NUMBER AND KEEP DIFFERENCE
                smash = stoneArray.get(stoneArray.size() - 1) - stoneArray.get(stoneArray.size() - 2);
                stoneArray.set(stoneArray.size() -2, smash);
            }
            stoneArray.remove(stoneArray.size() -1);
        }
        return stoneArray.size() == 1? stoneArray.get(0): 0;
        
    }   
}
