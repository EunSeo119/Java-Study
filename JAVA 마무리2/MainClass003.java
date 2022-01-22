import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass003 {
	
	public static void main(String[] args) {
		
		InputStream inputStream = null;
		OutputStream outputStream = null;
		
		try {
			inputStream = new FileInputStream("C:\\Users\\eunseo\\Desktop\\study\\JavaStudy\\hello.txt");
			//여기서 읽어서
			outputStream = new FileOutputStream("C:\\Users\\eunseo\\Desktop\\study\\JavaStudy\\helloCopy.txt");
			//여기로 출력
			
			byte[] arr = new byte[3];	//3개씩 읽어옴
			
			while(true) {
				int len = inputStream.read(arr);
				if(len == -1) break;	//더 이상 읽을 데이터 없을 때까지
				outputStream.write(arr, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (Exception e) { e.printStackTrace(); }
			}
			
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (Exception e) { e.printStackTrace(); }
			}
		}
		
	}
	
}
