import java.util.Scanner;
class JavaProgram{
public static void main(String[]input){
String str1,str2;
int len,len1,len2,i,j,flag=0;
Scanner scan=new Scanner(System.in);
System.out.print("enter first string:");
str1=scan.nextLine();
System.out.print("enter second string:");
str2=scan.nextLine();
len1=str1.length();
len2=str2.length();
if(len1==len2){
len=len1;
for(i=0;i<len;i++){
flag=0;
for(j=0;j<len;j++){
if(str1.charAt(i)==str2.charAt(j)){
flag=1;
break;
} }
if(flag==0){
break;
} }
if(flag==0){
System.out.print("String are not Anagram to each other..!!");
}else{
System.out.print("String are Anagram");
}
}else{
System.out.print("Both strings must have the same nember of character to be
an anagram");
}} }
