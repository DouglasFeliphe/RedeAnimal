package testesJUnit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscreveBinario {
	public static void main(String[] args) throws IOException {
		//copia uma arquivo de um diretório para outro
		 try {
	            String inFileName = "C:\\Users\\salguod\\Pictures\\interruptor.jpg";
	            String outFileName = "D:\\copia.jpg";
	            FileInputStream in = new FileInputStream(inFileName);
	            FileOutputStream out = new FileOutputStream(outFileName);
	            byte[] buf = new byte[1024];
	            int len;
	            while ((len = in.read(buf)) > 0) {
	                out.write(buf, 0, len);
	            }
	            out.close();
	            in.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
        }
	
	
}
