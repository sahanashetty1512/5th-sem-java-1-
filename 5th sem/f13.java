class f13{
static void print(int[] arr,int l){
if(l==arr.length)
{
return;
}
System.out.println(arr[l]);
print(arr,++l);
}public static void main(String[] args){
int[] arr={2,5,8,1,4,9,7,6};
print(arr,0);
}}