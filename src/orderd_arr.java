public class orderd_arr {
    public static void main(String[] args) {
        OrdArray x=new OrdArray(10);
        x.insert(8);
        x.insert(7);
        x.insert(56);
        x.insert(8);
        x.insert(90);
        x.insert(34);
        x.insert(65);
        x.insert(78);
        x.insert(12);
        x.display();
        x.find(56);
        x.display();
        x.delete(8);
        x.display();
    }
}

class OrdArray {
    private long[] a; // ref to array a
    private int nElements; //number of data items
    public OrdArray(int max) {
        this.a=new long[max];
        this.nElements=0;
    }
    public int size() { // return max size of the array
        return this.a.length;
    }
    public int find(long searchKey) {
        for(int i=0;i<this.nElements;i++){
            if(this.a[i]==searchKey){
                System.out.println(i);
                return i;

            }


        }
        return -1;
    }
    public void insert(long value) { // put element into arrray
        if(this.nElements==this.a.length){
            System.out.println("sorry,array is full!");

        }
        else{
            for(int i=0; i<this.nElements;i++){
                if(this.a[i]>value){
                    for(int j=this.nElements;j>i;j--){
                        this.a[j]=this.a[j-1];


                    }
                    this.a[i]=value;
                    this.nElements++;
                    return;
                }
            }
            this.a[nElements]=value;
            this.nElements++;



        }

    }
    public boolean delete(long value) {
        if(this.nElements==0){
            System.out.println("array is empty!");
            return false;
        }
        boolean status=false;
        for(int i=0;i<this.nElements;i++){
            if(this.a[i]==value){
                for(int j=i;j<nElements-1;j++){
                    this.a[j]=this.a[j+1];
                }
                this.nElements--;
                //System.out.println("value deleted...");
                //return true;
                i--;
                status=true;
            }

        }
        return status;
    }
    void display() { // display array contents
        if(nElements==0){
            System.out.println("the array is empty!");
            return;
        }
        for(int i=0;i<nElements;i++){
            System.out.print(this.a[i]+" ");
        }
        System.out.println();
    }
}


