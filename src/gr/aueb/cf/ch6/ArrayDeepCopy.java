package gr.aueb.cf.ch6;

public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copied;

        copied = arrDeepCopy(arr);
    }

    /**
     * it creates a fresh-copy (deep copy) of an
     * input array.
     *
     * @param source    the source array.
     * @return          the copied array.
     */
    public static int[] arrDeepCopy(int[] source) {

        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
//        System.arraycopy(source, 0, destination, 0, source.length);
//        destination = Arrays.copyOf(source, source.length);
//        destination = Arrays.copyOfRange(source, 0, source.length);

        return destination;
    }

    public static class CircularRotation {

        public static void main(String[] args) {

        }

        public static int[] doLeftShift(int[] arr, int offset) {
            if (arr == null) return null;
            if (offset < 0) return null;

            int[] rotated = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                rotated[i] = arr[(i + offset) % arr.length];
            }

            return rotated;
        }

        public static int[] doRightShift(int[] arr, int offset) {
            if (arr == null) return null;
            if (offset < 0) return null;

            int[] rotated = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                rotated[(i + offset) % arr.length] = arr[i];
            }
            return rotated;
        }
    }
}
