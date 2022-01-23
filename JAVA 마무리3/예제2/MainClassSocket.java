import java.io.IOException;
import java.net.Socket;

public class MainClassSocket {		//서버 구동 후 클라이언트 실행~

	public static void main(String[] args) {
		
		Socket socket = null;		//소켓만들고
		
		try {
			socket = new Socket("localhost", 9000);
			//local PC의 IP주소 : 127.0.0.1 ("도메인 주소->어디로", 포트번호)	=> 클라이언트 쪽의 소켓 마련!(네트워크 사용하기 위한 장치 마련)
			System.out.println("서버 연결~~");
			System.out.println("socket: " + socket);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
}
