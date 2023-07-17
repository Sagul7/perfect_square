import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPerfectSquare(n));
    }
    public static Boolean checkPerfectSquare(int n)
    {
        for(int i=1;i*i<=n;i++)
        {
            if(i*i==n)
                return true;
        }
        return false;
    }
}
