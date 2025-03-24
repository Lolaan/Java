import java.util.Scanner;
class Student{
void getDetails(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter roll number:");
int rollno=sc.nextInt();
System.out.println("Enter name:");
String name=sc.nextStr();
System.out.println("Enter age:");
int age=sc.nextInt();
System.out.println("roll"+rollno);
System.out.println("name:"+name);
System.out.println("age:"+age);
}}
class Mark extends Student{
void getMarks(){
Scanner mk=new Scanner(System.in);
System.out.println("enter the marks of 5 subject:");
sub1=mk.nextint();
sub2=mk.nextint();
sub3=mk.nextint();
sub4=mk.nextint();
sub5=mk.nextint();
total=sub1+sub2+sub3+sub4+sub5;
average=total/5;
System.out.println("total mark:"+total);
System.out.println("average:"+average);
}
}
class Main{
public static void main(String[]args){
Student st=new Student();
st.getDetails();
st.getMark();
}}
