import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;		//클라이언트와 똑같이 만들어주고 ServerSocket만 추가!
		Socket socket = null;
		
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			
			serverSocket = new ServerSocket(9000);
			System.out.println("클라이언트 맞을 준비 완료~~");
			
			socket = serverSocket.accept();		//데이터가 오면 받음
			System.out.println("클라이언트 연결~~");
			System.out.println("socket: " + socket);
			
			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);
			
			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);
			
			while (true) {
				String clientMessage = dataInputStream.readUTF();		//클라이언트가 OutputStream으로 내보낸거 받음
				System.out.println("clientMessage : " + clientMessage);	//클라이언트가 어떤 메시지 보냈나 출력
				
				dataOutputStream.writeUTF("메시지 전송 완료~~");		//서버에서 메시지 정상적으로 왔다고 클라이언트에게 보내줌
				dataOutputStream.flush();
				
				if(clientMessage.equals("STOP")) break;		//클라이언트에서 "STOP" 요청하면 빠져나가기
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(dataInputStream != null) dataInputStream.close();
				if(inputStream != null) inputStream.close();
				if(dataOutputStream != null) dataOutputStream.close();
				if(outputStream != null) outputStream.close();
				
				if(socket != null) socket.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
