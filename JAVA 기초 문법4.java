import java.util.Scanner;

public class MainClass{

    public static void main(String[] args) {

        //조건문 if
        int num1 = 10;
        int num2 = 20;

        if(num1<num2){
            System.out.println("num2이 num1보다 크다");
        }else{
            System.out.println("num2가 num1보다 작다");
        }

        //조건문 switch문
        System.out.println("정수를 입력하세요.");

        Scanner inputNum = new Scanner(System.in);
        int score = inputNum.nextInt();

        switch (score){
            case 90:
                System.out.println("score is 90");
                break;
            case 80:
                System.out.println("score is 80");
            default:    //써도 되고 안써도 됨!
                System.out.println("score?");
                break;
        }

        inputNum.close();
    }
}
