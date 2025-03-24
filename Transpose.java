import java.util.Scanner;
class Transpose{
public static void main(String[]args){
int[][]matrix;
int[][]transpose;
int sum=0,r,c;
Scanner in=new Scanner(System.in);
System.out.print("enter the number of rows:");
r=in.nextInt();
System.out.print("enter the number of columns:");
c=in.nextInt();
if(r!=c){
System.out.println("only square matrix allowed.");
}else{
matrix=new int[r][c];
transpose=new int[c][r];
System.out.print("enter the elements of matrix:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
matrix[i][j]=in.nextInt();
}
}
System.out.println("\ngiven matrix");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(matrix[i][j]+" ");
}
System.out.print("\n");
}
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
transpose[j][i]=matrix[i][j];
if(i==j){
sum=sum+(matrix[i][j]);
}
}
}
System.out.println("\nthe trace of the given matrix is:"+sum);
System.out.println("\ntranspose matrix");
for(int i=0;i<c;i++){
for(int j=0;j<r;j++){
System.out.print(transpose[i][j]+" ");
}
System.out.print("\n");
} } } }
