package sum.java;
public class problem{
    public static void Printsum(int i,int n,int sum){
        if (i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        Printsum(i+1,n,sum);
    }
    public static void Main (String args[]){
       Printsum (i, n, sum);
    }
}