public class MainClass {

    public static void main(String[] args) {

        String str = "JAVA";
//      String str = new String("JAVA");    //원래는 이렇게 써야함
        System.out.println("str : "+str);

        str = str + "_8";
        System.out.println("str : "+str);

        //StringBuffer
        StringBuffer sf = new StringBuffer("JAVA");
        System.out.println("sf : "+sf);

        sf.append(" World");         //뒤에 추가
        System.out.println("sf : "+sf);

        System.out.println("sf.length() : "+sf.length());      //길이

        sf.insert(sf.length(), "~~~~");     //(어디에다, 무엇을) 추가해주기
        System.out.println("sf : "+sf);

        sf.delete(4, 8);    //(어디서부터, 어디까지) 삭제해주기
        System.out.println("sf : "+sf);

        //StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("JAVA World!!");
        System.out.println("sb : "+sb);     //StringBuffer 랑 문법 걍 똑같음~



    }
}
