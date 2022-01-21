public class MainClass {
    public static void main(String[] args) {

        new AnnoymousClass(){

            @Override
            public void method(){
                System.out.println("-- AnnoymousClass's Override method START --");
            }
        }.method();
    }
}
