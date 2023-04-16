public class recursion {
    public static void main(String[] args) {
        recursion r=new recursion();
        int sum1=r.sumof(5);
        System.out.println(sum1);

        //multiplication
        int mul1=r.mulof(5);
        System.out.println("mul is: "+mul1);

        //mul two
        int mul2=r.multwo(2,5);
        System.out.println("mul two is: "+mul2);

        //fibonacci
        int fibo1=r.fabo(4);
        System.out.println("fibonacci num is: "+fibo1);
    }
    int sumof(int n){
        if(n==1){
            return n;
        }

        return n+sumof(n-1);
    }

    int multwo(int a,int b){
      if(b==1){
          return a;
      }
      return a+multwo(a,b-1);


    }

    int mulof(int n){
        if(n==1){
            return 1;
        }
        return n*mulof(n-1);

    }

    //fibonacci numbers
  int fabo(int n){
        if(n==1){
            return 1;
        }
        if (n==0) {
            return 0;
        }

        return fabo(n-1)+fabo(n-2);


  }

  //game-A TO C
    public void SolveHanoi(int n,char A,char B,char C){

        System.out.println("move plate" +n+  "from :"+A+"to"+C);
    }




}




