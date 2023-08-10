package Arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List<Produto> p1 = new ArrayList<>();
		System.out.println("Entre com o caminho do arquivo: ");
		String sourceFile = sc.nextLine();
		
		File source = new File(sourceFile);
		String sourceFolder = source.getParent();
		System.out.println(sourceFolder);
		
		//Criar uma PASTA:
		boolean sucesso = new File(sourceFolder + "/out").mkdir();
		System.out.println(sucesso);
		
		//ARQUVIO DE SAIDA:
		String targetFile = sourceFolder + "ws-java/out/sumario.csv";
		
		//Try-with-resource
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))){
			String itemCsv = br.readLine();
			
			while(itemCsv != null) {
				
				String[] campos = itemCsv.split(",");
				String nome = campos[0];
				double preco = Double.parseDouble(campos[1]);
				int quantidade = Integer.parseInt(campos[2]);
				
				p1.add(new Produto(nome, preco, quantidade));
				
				itemCsv = br.readLine();
			}
			
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))){
				for (Produto item : p1) {
					bw.write(item.getNome() + ", " + String.format("%.2f", item.total()));
					bw.newLine();
				}
				System.out.println("Arquivo de destino criado");
			}catch(IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}
			
		} catch (IOException e) {
			System.out.println("Erro " + e.getMessage());
		}
		
		sc.close();
	}
}
