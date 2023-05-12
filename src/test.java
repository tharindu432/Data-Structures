public class test {
    public static void main(String[] args) {
        NoDupArray x=new NoDupArray(10);
        x.insert(5);
        x.insert(4);
        x.insert(9);
        x.insert(-3);
        x.insert(90);
        x.insert(78);
        x.insert(59);
        x.insert(89);
        x.insert(56);
        x.insert(34);
        x.delete(90);




        x.display();
    }
}

class NoDupArray {
    private long[] a;//ref to array a-declaration
    private int nEliments;//number of data items
    public NoDupArray(int max) {//constructor
        this.a=new long[max]; //initialization
        this.nEliments=0;
    }
    public boolean find(long SearchKey) {//find specified value
        for(int i=0;i<this.nEliments;i++){
            if(this.a[i]==SearchKey){
                return true;
            }
        }
        return false;

    }// end find()

    public void insert(long value) {//put element into array
        if(this.nEliments==this.a.length){
            System.out.println("array is full,insert terminated!");
        }
        else{
            boolean status=find(value);
            if(status==false) {
                this.a[this.nEliments] = value;
                this.nEliments++;
                System.out.println("value inserted...");
            }
            else{
                System.out.println("The value is already exist!");
            }

        }


    }//end insert()

    public boolean delete(long value){
        if(this.nEliments==0){
            System.out.println("array is empty!");
            return  false;
        }
        for(int i=0;i<this.nEliments;i++){
            if(this.a[i]==value){
                for(int j=i;j<this.nEliments-1;j++){
                    a[j]=a[j+1];
                }
                this.nEliments--;
                System.out.println("value deleted");
                return true;
            }
        }
        System.out.println("value not found!");
        return false;
    }


    public void display() {//display array contents
        for(int i=0;i<nEliments;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    } //end display()

    }


