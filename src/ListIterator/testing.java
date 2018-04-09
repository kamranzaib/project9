package ListIterator;

import java.util.*;

public class testing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("how many rows ya want");

        int noOfRows = sc.nextInt();

        int rowCount =1;
        System.out.println("take your bitchass pyramid");

        for (int i = noOfRows; i>0; i--){
            for (int j=1; j <=i; j++){
                System.out.print("");
            }

            for(int j=1; j<=rowCount; j++){
                System.out.print(rowCount+ " ");
            }
            System.out.println();
            rowCount++;

        }

    }

}