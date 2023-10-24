class Shuffle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        shuffleArr(array);

        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void shuffleArr(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int randomIndex = i + (int) (Math.random() * (n - i));
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
