class test5{
    public static void main(String[] args) {
        int[] arr={50,25,119,41,62,21,65,84,33,21};
        QuickSort qs=new QuickSort();
        qs.sort(arr,0,arr.length-1);
        qs.displayArray(arr);



    }
}



public class QuickSort {

    public void sort(int[] arr,int lowerBound,int upperBound){
        if(lowerBound<upperBound){
          int location=  partition(arr,lowerBound,upperBound);
          sort(arr,lowerBound,location-1);
          sort(arr,location+1,upperBound);
        }

    }




    public int partition(int[] arr,int lowerBound,int upperBound){
        int pivot=arr[lowerBound];
        int start=lowerBound;
        int end=upperBound;

        while(start<end){
            while(arr[start]<=pivot){
                start++;

            }
            while(arr[end]>pivot){
                end--;
            }

            if(start<end){
                swap(arr,start,end);
            }


        }

        swap(arr,lowerBound,end);

        return end;





    }

    //swap the start value and end value
    public void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public void displayArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


}



