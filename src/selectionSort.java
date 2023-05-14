public class selectionSort {
    public void sort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1;i++){
            int min=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                }
            }
            int temp=min;
            min=arr[i];
            arr[i]=temp;
        }
    }

    public void displayArray(int[] arr){
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }

}

class test9{
    public static void main(String[] args) {
        int[] arr={3,2,9,10,27};
        selectionSort ss=new selectionSort();
        ss.sort(arr);
        ss.displayArray(arr);


    }
}
