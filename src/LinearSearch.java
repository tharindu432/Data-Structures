public class LinearSearch {
    public int search(int[] arr,int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
          int[] arr= {5,4,7,9,14,67,23,65};
          LinearSearch ls=new LinearSearch();
          int result=ls.search(arr,arr.length,23);
        System.out.println(result);

    }
}





