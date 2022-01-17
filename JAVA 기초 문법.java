public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello Java World");

        int i = 10;
        int j;
        j=100;
        System.out.println("i+j="+(i+j));

        char c = 'a';
        System.out.println("c = "+c);

        double d = 10.123;
        System.out.println("d = "+d);

        boolean b = false;
        System.out.println("b = "+b);

        String s = "Hello Java World!!";
        //원래 객체 생성  String str = new String();
        System.out.println("s = "+s);

        s="Good";
        System.out.println("s = "+s);

        System.out.println("Good\tMorning\n~");

        System.out.println("오늘의 기온은 10도 입니다.");     //자동 개행
        System.out.printf("오늘의 기온은 %d도 입니다.\n", 16);    //자동 개행 x

        int num1 = 20;
        System.out.println("오늘의 기온은 "+num1+"도 입니다.");
        System.out.printf("오늘의 기온은 %d도 입니다.\n", num1);

        //문자
        System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n ", 'a', 'A');
        //문자열
        System.out.printf("\'%s\'을 대문자로 바꾸면 \'%s\'입니다.\n", "java", "JAVA");

        //실수
        double D = 1.1234d;     //float f = 1.23f;
        System.out.printf("d = %f\n",D);

        //서식문자 정렬 기능
        System.out.printf("%d\n",123);     //기본 왼쪽 정렬
        System.out.printf("%5d\n", 123);   //오른쪽 정렬(5칸)

        //서식문자 소수점 제한 기능
        System.out.printf("%.2f\n", 1.234); //소수점 뒤 2자리까지 나타내기

        // 조건(삼항) 연산자
        int x = 10; int y = 20;
        int result = 0;
        result = (x > y) ? 100 : 200;
        System.out.println("result : " + result);
        result = (x < y) ? 100 : 200;
        System.out.println("result : " + result);
        result = (x == y) ? 100 : 200;
        System.out.println("result : " + result);
        /* 결과
        result : 200
        result : 100
        result : 200
         */

        //배열 선언 후 초기화
        int[] arr1 = new int[5];    //배열 선언 단계
        arr1[0]=100;
        arr1[1]=200;
        System.out.println("arr[0] : "+arr1[0]);

        //배열 선언과 초기화를 동시에
        int[] arr2 = {10, 20, 30};
        /* 위와 동일
        int[] arr2 = new int[3];
        arr2[0]=10;
        arr2[1]=20;
        arr2[2]=30;
        */

    }
}
