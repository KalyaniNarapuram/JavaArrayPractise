package love.programming;

public class ArrayTimesTablesHomeWork {

    public static void main(String[] args) {

       int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        //int[] myArray = {2,4,6,8,10,12,14,16,18,20};
        int num =1;
        int j;

        for (num = 1 ; num <= 20; num++) {
            System.out.println("*************");
            for (j = 0; j < myArray.length; j++) {


                System.out.printf("%d * %d = %d \n", num, myArray[j], num * myArray[j]);
            }
        }
    }

    }

