package  ListIterator;

import java.util.Scanner;

public class UseException {

    public static void main(String[] args) {
        int num = 10;

        //while loop with boolean to loop the error
        boolean success = false;
        while (!success)
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("enter number");
                int division = sc.nextInt();
                int result = 10/division;
                System.out.println(result);
                success = true;

            }catch (Exception ex){
                System.out.println("you cant divide with that");
            }

    } }
