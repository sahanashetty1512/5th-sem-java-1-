class f12{
static void print(int[] n,int l){
if(l<0)
{
return;
}
System.out.println(n[l]);
print(n,--l);
}public static void main(String[] args){
int[] arr={2,5,8,1,4,9,7,6};
print(arr,arr.length-1);
}}