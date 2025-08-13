class a{
public static void main(String[] args){
int[] arr={3,2,6,7,1};
int min=arr[0];int mini=0;int key=6;int flag=0;
for(int i=0;i<=arr.length-1;i++)
{
if(arr[i]<min){
min=arr[i];
mini=i;}
}
for(int j=arr.length-1;j>=0;j--)
{
System.out.print(arr[j]+" ");
}
for(int k=0;k<=arr.length-1;k++)
{
if(arr[k]==key)
{
flag=1;
}
}
if(flag==1)
{
System.out.println("key found");
}
else
{
System.out.println("not found");}
System.out.println(min);
System.out.println(mini);
}}