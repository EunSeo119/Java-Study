import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainClass005 {
	
	public static void main(String[] args) {
		
		String fileName = "C:\\java\\pjt\\helloReader.txt";
		
		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(fileName);		//파일 읽음
			br = new BufferedReader(fr);		//버퍼에 잠시 담음(FileReader를 확장해 BufferedReader를 만듬)

			String strLine;

			while ((strLine = br.readLine()) != null) {		//문자를 기본으로 다루기 때문에 한 라인씩 읽음
				System.out.println(strLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (br != null) br.close();
				if (fr != null) fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

	}

}
