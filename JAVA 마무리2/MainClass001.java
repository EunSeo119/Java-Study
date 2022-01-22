import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainClass001 {

	public static void main(String[] args) {

/////////////결과화면 1///////////////////(1볼때랑 2볼때 각각 주석 처리)

		// read() : 1byte 단위로 읽음
		InputStream inputStream = null;
		try {		//io와 관련된 건 예외처리 반드시 해야함!!

			inputStream = new FileInputStream("C:\\Users\\eunseo\\Desktop\\study\\JavaStudy\\hello.txt");
			int data = 0;

			while(true) {

				try {
					data = inputStream.read();		// inputStream에 있는 파일을 read()라는 메소드로 1바이트 단위로 읽어옴
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break;		//더이상 읽을게 없을 때는 data에 -1이 담김
				System.out.println("data : " + data);	//Hello Java! 아스키 코드로 변환된 값 출력
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
				try {
					if(inputStream != null) inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}


/////////////결과화면 2///////////////////

		// read(byte[]) : 배열의 크기만큼 읽어옴(더 빨리 읽을 수 있음!)
				InputStream inputStream = null;
				try {

					inputStream = new FileInputStream("C:\\Users\\eunseo\\Desktop\\study\\JavaStudy\\hello.txt");
					int data = 0;
					byte[] bs = new byte[3];		//배열 선언! 3byte씩 읽게됨!

					while(true) {

						try {
							data = inputStream.read(bs);
						} catch (IOException e) {
							e.printStackTrace();
						}
						if(data == -1) break;
						System.out.println("data : " + data);
						for (int i = 0; i < bs.length; i++) {
							System.out.println("bs[" + i + "] : " + bs[i]);
						}

					}

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} finally {
						try {
							if(inputStream != null) inputStream.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
				}

	}

}
