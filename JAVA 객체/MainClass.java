public class MainClass {

    public static void main(String[] args) {

        //default 생성자 이용
        Grandeur myCar1 = new Grandeur();
        myCar1.color = "red";
        myCar1.gear = "auto";
        myCar1.price = 100;

        myCar1.run();
        myCar1.stop();
        myCar1.info();

        Grandeur myCar2 = new Grandeur();
        myCar2.color = "yellow";
        myCar2.gear = "auto";
        myCar2.price = 500;

        myCar2.run();
        myCar2.stop();
        myCar2.info();

        System.out.println("=============");

        //생성자에 값 받아서
        Bicycle myBicycle = new Bicycle("red", 100);
        myBicycle.info();

        myBicycle.color = "yellow";
        myBicycle.info();
    }
}
