import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainClass002 {

	public static void main(String[] args) {

/////////////결과화면3////////////////(3볼때랑 4볼때 각각 주석 처리)

		// write()
		OutputStream outputStream = null;
		try {

			outputStream = new FileOutputStream("C:\\Users\\eunseo\\Desktop\\study\\JavaStudy\\helloW.txt");
			String data = "Hello java world!!";
			byte[] arr = data.getBytes();

			try {
				outputStream.write(arr);		//한방에 write
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
				try {
					if(outputStream != null) outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}



/////////////결과화면4////////////////

		// write()
		OutputStream outputStream = null;
		try {

			outputStream = new FileOutputStream("C:\\Users\\eunseo\\Desktop\\study\\JavaStudy\\helloW.txt");
			String data = "Hello java world!!";
			byte[] arr = data.getBytes();

			try {
				outputStream.write(arr, 0, 7);		//(배열, 시작점, 길이) write 메소드에 배열을 넣어주고 시작점과 길이도 정해줌
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
				try {
					if(outputStream != null) outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}


	}

}
