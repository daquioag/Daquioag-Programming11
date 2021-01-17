public class TEST {
    private static int[] insert(int[] a, int key, int index) {
        int[] result = new int[a.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = a[i];
        }
        result[index] = key;
        for (int i = index+1; i<= a.length; i++) {
            result[i] = a[i - 1];
        }

        return result;

    }
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int key = 3;
        int index = 2;

        a = insert(a, key, index);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
    }
}

//*}
//    // add a another number to the end of the array. // my goal is to output 1-6
//    // i am going to try and copy the array with a new array wit the number 6.
//    static void arrayAdd(int[] array){
//        // I am going to make a new array with the size I want. YOu can use 6 instead of array.length+1.
//        System.out.println("\n"); // this just breaks the statement into a new line. Without it, the numbers will just continue.
//        int[] moreArray = new int[array.length+1]; // this makes a new array with the original array length size plus 1
//        for (int i = 0; i< moreArray.length; i++) {  // we are numbering each index starting with 1.
//            moreArray[i]=i+1;
//            System.out.print(+moreArray[i]+ " ");
//        }
//    }
//    static void arrayDelete(int[] array){ // my goal is to output 1-4
//        System.out.println("\n"); // this just breaks the statement into a new line. Without it, the numbers will just continue.
//        int[] lessArray = new int[array.length-1];  // this makes a new array with 1 less index of the original array size.
//        for (int i = 0; i< lessArray.length; i++) {
//            lessArray[i]=i+1;
//            System.out.print(+lessArray[i]+ " ");
//        }