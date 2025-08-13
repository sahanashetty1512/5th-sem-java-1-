class f6{
static String eo(int n)
{
for(int i=2;i<=n-1;i++)
{
if(n%i==0)
{
return n+" "+"is a not prime";
}}
return n+" "+"is prime";
}
public static void main(String[] args){
System.out.println(eo(8));
}}