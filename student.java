import java.util.Scanner;
public class student{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.next();
        System.out.println("roll no");
        int no = sc.nextInt();
        System.out.println("marks");
        int marks = sc.nextInt();
        if(marks>=35){
            System.out.println("student pass "+" "+"\n name:"+name +"\n no:"+no +"\n marks:" +marks);
        }
        else
        {
            System.out.println("student  not pass "+" "+"\n name:"+name +"\n no:"+no +"\n marks:" +marks);
        }
        
    }
}
