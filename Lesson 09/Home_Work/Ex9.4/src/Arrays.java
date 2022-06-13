public class Arrays {
    int position;
    public void binarySearch(int[] array, int n) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == n) {
                position = i;
                System.out.println("Position of " + n + " in this array is " + position);
            } else {
                System.out.println(n + " not found!");
            }
        }

    }
}
