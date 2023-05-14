public class mergeSort {
    public void displayArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void sort(int[] arr,int[] temp,int low,int high){
        if(low<high){
            int mid=(high+low)/2;
            sort(arr,temp,low,mid);
            sort(arr,temp,mid+1,high);
            merge(arr,temp,low,mid,high);


        }

    }

    public void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for(int i=low;i<=high;i++){
            temp[i]=arr[i];
        }
        int i=low; //traverse left sorted array
        int j=mid+1; //traverse right sorted array
        int k=low; //merge both arrays
        while(i<=mid && j<=high){
            if(temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;

            }
            else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k]=temp[i];
            k++;
            i++;
        }

    }

}

class test7{
    public static void main(String[] args) {
        int[] arr={9,5,2,4,3};
        mergeSort ms=new mergeSort();
        ms.sort(arr,new int[arr.length],0,arr.length-1);
        ms.displayArray(arr);


    }
}
