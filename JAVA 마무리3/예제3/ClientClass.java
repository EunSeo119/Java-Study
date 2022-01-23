import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientClass {
	
	public static void main(String[] args) {
		
		Socket socket = null;
		
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		
		Scanner scanner = null;
		
		try {
			
			socket = new Socket("localhost", 9000);
			System.out.println("서버 연결 완료~~");
			
			outputStream = socket.getOutputStream();	//socket으로 부터 OutputStream 받아옴
			dataOutputStream = new DataOutputStream(outputStream);		//그 OutputStream을 DataOutputStream으로 확장
			
			inputStream = socket.getInputStream();		//socket으로 부터 IutputStream 받아옴
			dataInputStream = new DataInputStream(inputStream);		//InputStream 확장
			
			scanner = new Scanner(System.in);		//사용자로부터 데이터 입력받기 위한 준비
			
			while (true) {
				System.out.println("메시지 입력~~");
				String outMessage = scanner.nextLine();		//사용자가 입력한 데이터 서버쪽으로 보내기 위한 string값
				dataOutputStream.writeUTF(outMessage);		//서버쪽으로 날림
				dataOutputStream.flush();					//비워줌
				
				String inMessage = dataInputStream.readUTF();	//서버에서 보내준 메시지 받음
				System.out.println("inMessage : " + inMessage);
				
				if(outMessage.equals("STOP")) break;		//STOP 하면 빠져나감
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(dataOutputStream != null) dataOutputStream.close();
				if(outputStream != null) outputStream.close();
				if(dataInputStream != null) dataInputStream.close();
				if(inputStream != null) inputStream.close();
				
				if(socket != null) socket.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
