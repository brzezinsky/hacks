public class Helpers {
    private Helpers() {}

    public static final int inverseHash(int h) {
        h ^= (h >>> 4) ^ (h >>> 7) ^ (h >>> 8) ^ (h >>> 14) ^ (h >>> 15)
                ^ (h >>> 18) ^ (h >>> 19) ^ (h >>> 20) ^ (h >>> 21)
                ^ (h >>> 23) ^ (h >>> 26) ^ (h >>> 28);
        return h;
    }

    public static final int reverseBits(int t) {
        int ret = 0;
        for (int i = 0; i < 31; ++i) {
            if ((t & (1 << i)) != 0) {
                ret |= 1 << (30 - i);
            }
        }
        return ret;
    }

    public static final int getBadIntForHash(int seed) {
        return inverseHash(reverseBits(seed));
    }
}