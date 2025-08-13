class f8{
static void name(int n){
if(n==0){
return;}
System.out.println("sahana");
name(--n);
}public static void main(String[] args){
name(10);
}}