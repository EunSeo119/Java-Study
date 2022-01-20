public class ObjectClass {

    //전역 변수(객체가 생성되고 소멸될때까지 항상 메모리에 있음)
    public int x;
    public int y;

    public ObjectClass(){
        System.out.println("-- ObjectClass() --");
    }

    public ObjectClass(int i, String s, int[] iArr){
        System.out.println("-- ObjectClass() --");

        System.out.println("i --> "+i);
        System.out.println("s --> "+s);
        System.out.println("iArr --> "+iArr);

    }

    public ObjectClass(int x, int y){   //지역 변수

        this.x = x;     //this는 지금 작업하고 있는 해당 객체 전체를 가리킴(전역 변수 x를 가리킴)

    }

    public void getInfo(){

        System.out.println("x--> "+x);  //x 대신 this.x 를 넣어도 됨!(하지만 여기서는 헷갈릴 일이 없으니 굳이?임)
        System.out.println("y--> "+y);  //여기도 마찬가지
    }
}
