import java.util.Scanner;
class Kamal{
    int num1,num2,sum;
    void getData(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your first num:-");
        num1=sc.nextInt();
        System.out.println("Enter your second num:-");
        num2 = sc.nextInt();
    }
}
class Dipu extends Kamal{
    void add(){
        sum = num1+num2;
    }
    void display(){
        System.out.println("Sum:-"+sum);
    }
}
public class InheritanceSum{
    public static void main(String args[]){
        Dipu obj = new Dipu();
        obj.getData();
        obj.add();
        obj.display();
        
    }
}