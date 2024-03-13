class Solution {
    public int pivotInteger(int n) {
        double doubleRes = Math.sqrt(n * (n + 1) / 2);
        return (int) doubleRes==doubleRes ? (int)doubleRes : -1;
    }
}
