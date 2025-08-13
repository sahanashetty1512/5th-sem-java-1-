class f9{
static void name(int n){
if(n==11){
return;}
System.out.println(n);
name(++n);
}public static void main(String[] args){
name(1);
}}