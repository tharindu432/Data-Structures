public class stack {
    public static void main(String[] args) throws Exception {
        StackArray sa=new StackArray(8);
       /*
        sa.push(2);
        sa.push(65);
        sa.push(22);
        sa.push(27);
        sa.display();
        sa.push(75);
        sa.display();
        int x=sa.pop();
        System.out.println(x);
        sa.display();
        */
        stack t=new stack();
        t.convertion(1000);





    }
    public void convertion(int number)throws Exception{
        int temp=number;
        int count=0;


        while(temp!=0){
            temp=temp/2;
            count++;
        }


        StackArray sa2=new StackArray(count);
         temp=number;
        while(temp!=0){
            int x= temp%2;
            temp=temp/2;
            sa2.push(x);

        }
        while(!sa2.isEmpty()) {
            int y= sa2.pop();
            System.out.print(y+" ");

        }
        System.out.println("");

    }

}

class StackArray {
    private int maxSize; //size of stack array
    private int[] stackData;
    private int top; //top of stack
    //-------------------------------------------------------------------------
    public StackArray(int s) {
        this.stackData= new int[s];
        this.maxSize=s;
         this.top=-1;

    }
    public boolean isEmpty() {
        if(this.top==-1){
            return true;
        }
        return false;

    }
    public boolean isFull() {
        if(this.maxSize==this.top-1){
            return true;
        }
        return false;

    }
    public void push(int item) {
        if(isFull()){
            System.out.println("stack is full!");
            return;
        }
        this.stackData[this.top+1]=item;
        this.top++;

    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty!");

        }
        else{
            this.top--;
            return this.stackData[top+1];
        }





    }
    public int peek()  throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty!");

        }
        else{
            return this.stackData[this.top];
        }



    }
    public void display() {
        if(isEmpty()){
            System.out.print("stack is empty!");
            return;
        }
      for(int i=0;i<this.top+1;i++){
          System.out.print(this.stackData[i]+" ");
      }
        System.out.println();

    }
} //end class StackArray