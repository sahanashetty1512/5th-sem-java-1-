class pgm2{
public static void main(String[] args){
String str="SAHANA";
int count=0;
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='A')
{
count++;
}
}
System.out.println(count);
}}