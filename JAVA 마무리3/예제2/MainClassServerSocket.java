import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClassServerSocket {		//서버 먼저 구동!

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;		//클라이언트랑 똑같은데 요청을 받아야 함으로 서버 소켓만 더 받아주면 됨
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("클라이언트 맞을 준비 완료~~");
			
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결~~");
			System.out.println("socket: " + socket);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
}
