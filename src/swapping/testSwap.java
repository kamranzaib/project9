package swapping;

public class testSwap {
    public static void main(String[] args) {
        int[] array = {110, 140, 180, 175, 160, 145, 120, 135, 125};

        int temp;

        for(int i=1; i<array.length; i++){
            for(int j=i; j>0; j--){
               if(array[j] < array[j-1]){
                   temp = array[j];
                   array[j]= array[j-1];
                   array[j-1] = temp;
               }
            }
        }

        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }


    }
}

