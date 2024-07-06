import java.util.Scanner;
class Numbers{
    
    int a;
    int b;
    int c;
    public void NumberConsecutive(){
    if(a - b == 1|| a - c == 1 || b - c == 1 ){
        System.out.println("Number Is Consecutive");
}
else{
    System.out.println("Number Is Not Consecutive");
}

}
}

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Numbers n1 = new Numbers();
    

        System.out.println("Enter The First Integer Number for a");
        n1.a = sc.nextInt();

        System.out.println("Enter The Second Integer Number For b");
        n1.b = sc.nextInt();

        System.out.println("Enter The Thrid Integer Number For c ");
        n1.c = sc.nextInt();

        n1.NumberConsecutive();


        
    }


    
}
