public class ADTFrac {
    public static void main(String[] args) {
        ADTFraction k1=new ADTFraction(2,6);
        ADTFraction k2=new ADTFraction(3,5);
        ADTFraction k3=k1.plus(k2);
        ADTFraction k4=k2.times(3);
        k3.refine();
        k3.display();
       // k4.display();
       // k3.reciprocal().display();




    }
}

class ADTFraction {
    private int n; //numerator
    private int d; //denomenator
    //---------------------------------------------------
    public ADTFraction() {//default constructor
        this.n=0;
        this.d=1;


    }
    //---------------------------------------------------
    public ADTFraction(int a, int b) {//parameter constructor

       if(b==0){
           this.n=0;
           this.d=1;
           System.out.println("do not input 0 as denominator!");


       }
       else{
           this.n=a;
           this.d=b;
       }

    }
    //---------------------------------------------------
    public void set(int a, int b) {//set numerator and denomenator
        if(b==0){

            System.out.println("do not input 0 as denominator!");


        }
        else{
            this.n=a;
            this.d=b;
        }


    }
    //---------------------------------------------------
    public ADTFraction plus(ADTFraction x) {//add two fractions
        int num,den;


            num=this.n*x.d+x.n*this.d;
            den=this.d*x.d;
            ADTFraction ans=new ADTFraction(num,den);
            return ans;


    }
//---------------------------------------------------

    public ADTFraction times(int a) {//multiply fraction by a number
      int num,den;
      num=this.n*a;
      den=this.d;
      ADTFraction answer=new ADTFraction(num,den);
      return answer;
    }
    //---------------------------------------------------

    public ADTFraction times(ADTFraction x) {//multiply two fractions
       int num,den;
       num=this.n*x.n;
       den=this.d*x.d;
       ADTFraction answer=new ADTFraction(num,den);
       return answer;
    }
    //---------------------------------------------------
    public ADTFraction reciprocal() {//reciprocal of a fraction
        int num=this.d;
        int den=this.n;
        ADTFraction answer=new ADTFraction(num,den);
        return answer;
    }
    //---------------------------------------------------
    public float value() {//numerical value of a fraction
         float answer= (float)this.n/this.d;
         return answer;
    }
    //---------------------------------------------------
    public void display() {//display the fraction in the format n/d
        System.out.println("Fraction = "+this.n+"/"+this.d);
    }
//---------------------------------------------------

    public void refine() {//set the instance to its minimum fraction

        //For instance, if this fraction is 12/30, change it to 2/5.
    }
}
