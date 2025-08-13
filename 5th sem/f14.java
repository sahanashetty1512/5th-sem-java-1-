class f14{
static int sum(int[] arr,int l,int sum1){
if(l==arr.length)
{
return sum1;
}
sum1=sum1+arr[l];
return sum(arr,++l,sum1);
}public static void main(String[] args){
int[] arr={2,5,8,1,4,9,7,6};int s=0;
System.out.println(sum(arr,0,s));
}}