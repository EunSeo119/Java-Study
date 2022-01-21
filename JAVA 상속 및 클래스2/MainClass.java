public class MainClass {
    public static void main(String[] args) {

        ParentClass[] pArr = new ParentClass[2];

        //배열을 만들때는 데이터 타입이 같아야 함으로 둘 다 가능하지만 ParentClass 타입을 이용!
        ParentClass fch = new FirstChildClass();
//      FirstChildClass fch = new FirstChildClass();    //위에랑 같은 코드! ParentClass를 상속 받았기 때문에 상위 클래스 타입을 써도 됨!
        ParentClass sch = new SecondChildClass();
//      SecondChildClass sch = new SecondChildClass();  //얘도

        pArr[0] = fch;
        pArr[1] = sch;

        pArr[0].makeJJajang();
        pArr[1].makeJJajang();
    }
}
