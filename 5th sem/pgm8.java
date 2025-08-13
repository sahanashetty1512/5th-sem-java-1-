class pgm8{
public static void main(String[] args){
String str="sahaNA";
int letter=0;
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)>=65&&str.charAt(i)<=90)
{
letter=(int)str.charAt(i)+32;
System.out.print((char)letter);
}
else{
System.out.print(str.charAt(i));
}}}}