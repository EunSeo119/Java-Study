public class MainClass {
    public static void main(String[] args) {

        ChildClass childClass = new ChildClass();
        childClass.childFun();
        childClass.parentFun();

//      childClass.privetFun();     //private은 접근 불가능!
    }
}
