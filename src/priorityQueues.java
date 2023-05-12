public class priorityQueues {
    public static void main(String[] args) throws Exception{
        PriorityQueue pq=new PriorityQueue();
        pq.enqueue(45,56,"tharindu","moratuwa");
        pq.enqueue(5,23,"tharbvgindu","mgfhoratuwa");
        pq.enqueue(25,65,"tggfharindu","mosdsratuwa");
        pq.enqueue(34,10,"thargfhfndu","mordfdsatuwa");
        pq.display();
        try{
            pq.dequeue();
            pq.display();
            System.out.println("peek is: "+pq.peek());
            pq.display();
        }catch (Exception e){
            System.out.println(e);
        }


    }
}

class Patient{
    int patientNo;
    int age;
    String patientName;
    String address;
    Patient next;

     public Patient(int patientNo,int age,String patientName,String address ){
         this.patientName=patientName;
         this.age=age;
         this.patientNo=patientNo;
         this.address=address;
         this.next=null;
     }
}
class PriorityQueue {
    private Patient head;
    private Patient tail;
    public void enqueue(int patientNo, int age, String patientName, String address) {
        //add the patient to the relevant place of the queue
        Patient newPatient=new Patient(patientNo,age,patientName,address);
        Patient current=head;
        Patient previous=head;

        if(current==null){
            head=newPatient;
            tail=newPatient;
            return;
        }
        while(current!=null){
            if(patientNo<current.patientNo){
                if(current==head){

                    head=newPatient;
                    newPatient.next=previous;
                    tail=previous;

                    return;
                }
                previous.next=newPatient;
                newPatient.next=current;
                return;

            }
            previous=current;
            current=current.next;
            if(current==null){
                previous.next=newPatient;
                tail=newPatient;
                return;
            }

        }



    }
    public String dequeue() throws Exception {
        //remove the front patient and return the name of the patient
        if(head==null){
            throw new Exception("queue is empty!");
        }
        String patientname=head.patientName;
        head=head.next;
        if(head==null){
            tail=null;
        }
        return patientname;


    }
    public String peek() throws Exception {
        //return the name of the front patient
        if(head==null){
            throw new Exception("cannot get peek!");
        }
        return head.patientName;
    }
    public void display() {
        //display all the patient names in the queue
         Patient current=head;
         while(current!=null){
             System.out.print(current.patientName+" ");
             current=current.next;
         }
        System.out.println();
    }
}









