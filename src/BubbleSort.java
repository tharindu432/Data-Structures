class Test{
    public static void main(String[] args) {
        int[] arr=new int[] {5,1,3,2};
        BubbleSort bs=new BubbleSort();
        bs.printArray(arr);
        bs.displplayArr(arr);




    }
}

public class BubbleSort {
    public void printArray(int[] arr){
        int n =arr.length;
        boolean isSwapped;

        for(int i=0;i<n-1;i++){
            isSwapped=false;

            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;

                }
            }
            if(isSwapped==false){
                break;
            }
        }
    }

    public void displplayArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


}



