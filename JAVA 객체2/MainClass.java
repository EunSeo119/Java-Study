public class MainClass {

    public static void main(String[] args) {

        ChildClass child1 = new ChildClass();
        //직접 접근
        child1.name = "홍길동";
        child1.gender = "남";
        child1.age = 20;

        child1.getInfo();

        //파라미터 이용
        child1.setInfo("김은서", "여", 23);

        child1.getInfo();

        //외부에서는 private 접근할 수 없음!
        //child1.mySecret();
    }
}
