class Hacks {
    private Hacks() {}


    public static final int[] hackHashCollection(int limit) {
        int []ret = new int[limit];
        int val = 0;
        for (int i = 0; i < limit; ++i) {
            ret[i] = Integer.MAX_VALUE;
            while (ret[i] > 1000000000) {
                ret[i] = Helpers.getBadIntForHash(val++);
            }
        }
        return ret;
    }
}