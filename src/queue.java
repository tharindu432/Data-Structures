public class queue {

    public static void main(String[] args) {
        QueueArray q1=new QueueArray(8);
        q1.enqueue(6);
        q1.enqueue(8);

        q1.enqueue(15);
        q1.enqueue(17);

        q1.enqueue(11);
        q1.enqueue(115);
        q1.enqueue(135);


        q1.enqueue(10);

        q1.display();

        try{
            q1.dequeue();
            q1.dequeue();
            q1.dequeue();
        }catch (Exception e){
            System.out.println(e);
        }

        q1.display();


    }
}

class QueueArray{
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueArray(int size){
        this.queArray=new int[size];
        this.maxSize=size;
        this.front=0;
        this.rear=-1;
        this.nItems=0;

    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("the queue is full!");
            return;
        }
        if(this.rear==this.maxSize-1){
            this.rear=0;
        }
        else{
            this.rear++;
        }

        this.queArray[this.rear]=value;
        this.nItems++;
        System.out.println("value inserted!");

    }

    public int dequeue() throws Exception{
        if (isEmpty()) {
          //  System.out.println("queue is empty!");
            throw new Exception("queue is empty");
        }
            int temp = this.queArray[front];
            if (this.front == this.maxSize - 1) {
                this.front = 0;
            } else {
                this.front++;
            }
            this.nItems--;
            return temp;



    }



    public int peek()throws Exception{
        if(isEmpty()) {
            throw new Exception("cannot get peek value!");
        }
        return this.queArray[this.front];
    }

    public boolean isEmpty(){
        if(this.nItems==0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(this.nItems==this.maxSize){
            return true;
        }
        return false;
    }

    public int size(){
       return  this.nItems;
    }

    public void display(){
        int i=this.front;
        while(i !=this.rear){
            System.out.print(this.queArray[i]+" ");

            if(i==this.maxSize-1){
                i=0;
            }
            else{
                i++;
            }



        }
        System.out.println(this.rear);
        System.out.println();


    }








}








