public class SelectionSort {
    public static void main(String[] args) {
        int []numbers = {3,1,5,11,55,99,5,88,2,4,10,14,13,16,3};

        sorting(numbers);
        printArray(numbers);

    }

    public static int[] sorting(int[] A){

        for(int i = 0; i<A.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<A.length;j++){
                //comparam elementele
                if(A[j]<A[minIndex]){
                    minIndex=j; //daca j este mai mic decat indexul minim , acesta devine j
                }
            }
            //schimbam elemetele ,
            int temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;
        }
        return A;

    }


    public static void printArray(int[] A){
        for(int i = 0; i<A.length;i++){
            System.out.println(A[i]);
        }
    }
}
