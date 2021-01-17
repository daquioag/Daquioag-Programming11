public class Array {
    // im going to try and insert a number into the middle of the list
    public static int[] arrayInsert(int[] array, int newValue, int indexPosition) { // this takes in 3 sets, the array size, the new value, and the position of the index.
        int[] newArray = new int[array.length + 1]; // this makes a new array size, one more than the original array
        for (int i = 0; i < indexPosition; i++) { // starting with 0, and until the new position, this makes the new array index's the same as the original array's.
            newArray[i] = array[i]; //
        }
        newArray[indexPosition] = newValue;  // this makes the position of the index equal to the new value
        for (int i = indexPosition + 1; i <= array.length; i++) { //from the new position, and counts up til the original array size.
            newArray[i] = array[i - 1];// the new array indexs is the same as the original array's index but minus 1, since we added an extra element and index.
        }
        return newArray;
    }

    public static void main(String[] args) {

        System.out.println("the original array is: ");
        int[] array = new int[10]; //this gives me and array size of 10 with each value being 0 or null
        // this will add 1 to each index in the array
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            System.out.print(array[i] + " "); // the output will be 1-10
        }
        arrayAdd(array); // this gives the arrayAdd method  the original array
        arrayDelete(array); // this gives the arrayDelete method the original array
        System.out.println("\n\n I am going to try and add 250 in between 2 and 3");
        array = arrayInsert(array, 250, 2); // this gives the arrayInsert method the original array, along with the new value i want to put in and the position in the index I want to place it in.
        for (int i = 0; i < array.length; i++) { //this for loop just fills in the array
            System.out.print(array[i] + " "); // i use print statement as it will print out in a single line.
        }


    }
    // add a another number to the end of the array. // my goal is to output 1-11
    //    // i am going to try and copy the array with a new array wit the number 11.
    static void arrayAdd(int[] array) { // ths takes in the original array size
        System.out.println("\n\nI am going to try and add a new number to the original array: ");
        int[] moreArray = new int[array.length + 1]; // this add 1 to the original array
        for (int i = 0; i < moreArray.length; i++) { //this loop  will fill an array with +1 at each index, and the prints it out
            moreArray[i] = i + 1;
            System.out.print(+moreArray[i] + " "); // i use print instead of println since it prints in a single line
        }
    }

    static void arrayDelete(int[] array) { // my goal is to output 1-9
        System.out.println("\n\n I am going to try and remove a number from the original array");
        int[] lessArray = new int[array.length-1];  // this makes a new array with 1 less index of the original array size.
        for (int i = 0; i < lessArray.length; i++) { // this for loop fills in the array and add 1 to each index and then prints it out.
            lessArray[i] = i + 1;
            System.out.print(+lessArray[i] + " "); // using print vs println allows it to print in a single line.
        }
    }
}



