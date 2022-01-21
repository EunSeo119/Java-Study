public class MainClass {
    public static void main(String[] args) {

        InterfaceA ia = new Interfaceclass();   //데이터 타입 : InterfaceA, 그렇게 때문에 funA만 접근 가능!
        InterfaceB ib = new Interfaceclass();

        ia.funA();
        ib.funB();
    }
}
