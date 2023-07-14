package top100;

public class Solution461 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        return Integer.bitCount(z);
    }
}
