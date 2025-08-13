class pgm11{
public static void main(String[] args){
String str="vicky";
int high=0;
for(int i=0;i<str.length();i++)
{
if((int)str.charAt(i)>high)
{
high=str.charAt(i);
}
}
System.out.print((char)high);
}}