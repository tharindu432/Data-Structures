public class binarySearch {
    public void displayArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int search(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
           if(key<arr[mid]){
               high=mid-1;
           }
           else{
               low=mid+1;
           }
        }
        System.out.println("array did not find the values!");
        return -1;
    }

}


class test10{
    public static void main(String[] args) {
        int[] arr={1,10,20,47,59,65,75,88,99};
        binarySearch bs=new binarySearch();
        bs.displayArray(arr);
       int index= bs.search(arr,65);
        System.out.println(index);

    }
}
