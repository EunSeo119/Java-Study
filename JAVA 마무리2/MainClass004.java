import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class MainClass004 {
	
	public static void main(String[] args) {
		
		String str = "Hello Java World!!";
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			outputStream = new FileOutputStream("C:\\java\\pjt_ex\\helloWorld.txt");	//byte 단위로 되어있음
			dataOutputStream = new DataOutputStream(outputStream);		//ouputStream을 확장!
			
			dataOutputStream.writeUTF(str);		//문자 단위로 출력
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataOutputStream != null) dataOutputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(outputStream != null) outputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
