package Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio_2 {
	public static void main(String[] args) {
		String path = "C:/temp/ws-java/int.txt";
		FileReader f1 = null;
		BufferedReader b1 = null;
		
		try {
			f1 = new FileReader(path);
			b1 = new BufferedReader(f1);
			//b1 new BufferedReader(f1 = new FileReader(path));
			
			String linha = b1.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = b1.readLine();
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
								
				if (b1 != null) {
					b1.close();
				}
				if (f1 != null) {
					f1.close();
				}			
			}catch(IOException e) {
				e.getStackTrace();
			}
		}
	}
}
