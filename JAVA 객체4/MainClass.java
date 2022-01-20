public class MainClass {

    public static void main(String[] args) {

        //디폴트 생성자
        ObjectClass obj1 = new ObjectClass();

        //사용자 정의 생성자
        int[] iArr = {10, 20, 30};
        ObjectClass obj2 = new ObjectClass(10, "Hello", iArr);

        //this 키워드
        ObjectClass obj3 = new ObjectClass(10, 20);

        obj3.getInfo();

    }
}
