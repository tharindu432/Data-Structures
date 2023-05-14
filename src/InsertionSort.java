public class InsertionSort {
    public void sort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    public void displayArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
}

class test6{
    public static void main(String[] args) {
        int[] arr={5,1,3,9,10};
        InsertionSort is=new InsertionSort();
        is.sort(arr);
        is.displayArray(arr);

    }
}
