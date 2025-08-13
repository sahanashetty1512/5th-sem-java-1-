class pgm5{
public static void main(String[] args){
String str="sahana";
int sum=0;
int a=0;int e=0;int i=0;int o=0; int u=0;
for(int j=0;j<str.length();j++)
{
if(str.charAt(j)=='a')
{
a++;
}
else if(str.charAt(j)=='e')
{
e++;
}
else if(str.charAt(j)=='i'){i++;}
else if(str.charAt(j)=='o'){o++;}
else if(str.charAt(j)=='u'){u++;}
}
System.out.println(a);
System.out.println(e);
System.out.println(i);
System.out.println(o);
System.out.println(u);
sum=a+e+i+o+u;
System.out.println
(sum);
}}