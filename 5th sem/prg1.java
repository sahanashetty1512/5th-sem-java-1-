// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class prg1 {
    public static void main(String[] args) {
        int n=1551;
        int org=n;
        int rev=0;
        while(n>0)
        {
            int mod=n%10;
            rev=(rev*10)+mod;
            n=n/10;
        }
        System.out.println(rev);
        if(rev==org)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}