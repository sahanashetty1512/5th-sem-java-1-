class f11{
static int sum(int n){
if(n==0)
{
return 0;
}
else if(n%2==0){
return n+sum(n-1);}
return sum(n-1);
}public static void main(String[] args){
System.out.println(sum(10));
}}