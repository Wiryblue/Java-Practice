import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        int[] myINt = getInt(5);
        for (int i = 0; i < myINt.length; i++){
            System.out.println("Element " + i +", typed value was "+ myINt[i]);

        }
        System.out.println("the average is "+ getAverage(myINt));
    }
    public static int[] getInt (int number){
        System.out.println("Enter" + number + "int value.\r");
        int[] values = new int[number];
        for (int i=0; i < values.length;i++){
            values[i] = input.nextInt();
        }
     return values;
    }
    public static double getAverage (int[] array) {
        int sun = 0;
        for(int i = 0 ; i< array.length;i++ ){
            sun += array[i];
        }
        return (double) sun / (double)array.length;
    }
}
