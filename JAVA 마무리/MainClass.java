public class MainClass {

    public static void main(String[] args) {

        int i = 10;
        int j = 0;
        int r = 0;

        System.out.println("Exception BEFORE");

        try {
            r = i / j;
            System.out.println("예외 발생 후 try문 속 다음 구문들");      //예외가 발생하면 그 아래 구문들은 실행 x
        } catch (Exception e) {
            e.printStackTrace();    //어떠한 예외가 발생했나 출력(얘만 써주는 걸로도 충분해 보임)
            String msg = e.getMessage();    //.getMessage => 예외를 간략하게 보여줌
            System.out.println("msg: " + msg);
        } finally {
            System.out.println("예외 발생 여부에 상관없이 언제나 실행 됩니다.");
        }

        System.out.println("Exception AFTER");
    }

}
