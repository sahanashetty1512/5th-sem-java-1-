class prg9{
public static void main(String[] args){
int row=3;
int col=3;
int tb=0;
int lr=0;
int [][] arr={{12,14,16},{17,22,34},{45,32,41}};
for(int i=0;i<row;i++)
{
for(int j=0;j<row;j++)
{
if(i==0||i==2)
{

tb=tb+arr[i][j];
}
else
{
System.out.print(" ");
}
}
System.out.println();
for(int j=0;j<row;j++)
{
if(j==0||j==2)
{
lr=lr+arr[i][j];
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
System.out.println(tb);
System.out.println(lr);
if(tb>lr)
{
System.out.println("tb is greter");
}
else
{
System.out.println("lr is greter");
}}}