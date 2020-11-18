class CanCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int current = 0;
        int total = 0;
        int start = 0;
        for(int i = 0; i < gas.length; i++) {
            current += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if(current < 0){
                current = 0;
                start = i + 1;
            }
        }
        return total < 0 ? -1 : start;
    }
}
