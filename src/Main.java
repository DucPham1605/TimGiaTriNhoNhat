public class Main {
    public static void main(String[] args) {
        int[] arr = {16, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);

    }
    public static int minValue(int []array){

        int min = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
}
