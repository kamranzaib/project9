package ProblemSolving;

public class SmallestNumber {

    public static void main(String[] args) {

        int array [] = {23,43,65,8,9,5,6,7,2,9};
        int smallest;
        smallest = array[0];

        for(int i=0; i<array.length; i++){
            if(array[i]<smallest){
                smallest = array[i];
            }
        }
        //System.out.println("smallest number");
        System.out.println("smallest number" + " " + smallest);

        int largest;
        largest = array[0];

        for(int i=0; i<array.length; i++){
            if(array[i]>largest){
                largest = array[i];
            }
    }
       // System.out.println("largest number");
        System.out.println("largest number" + " " +largest);
}}
