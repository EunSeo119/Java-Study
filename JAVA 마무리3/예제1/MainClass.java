import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {

    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket socket = null;

        try {           //네트워크 관련된 것도 기본적으로 예외 처리 해줘야함
            serverSocket = new ServerSocket(9000);
            System.out.println("클라이언트 맞을 준비 완료!!");

            socket = serverSocket.accept();
            System.out.println("클라이언트 연결!!");
            System.out.println("socket : "+ socket);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {           //예외 처리 후 자원 해제해 줘야함!
                if(socket != null) socket.close();
                if(serverSocket != null) serverSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
