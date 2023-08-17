package SET;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_Proposto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com caminho do pacote");
		String path = sc.nextLine();

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

			// Mais rápido e não importa a ordem, apenas queremos contar os usuarios unicos
			Set<EntradaDeLog> log = new HashSet<>();
			String linha = bufferedReader.readLine();
			while (linha != null) {
				String[] campos = linha.split(" ");
				String usuario = campos[0];
				Date momento = Date.from(Instant.parse(campos[1]));

				log.add(new EntradaDeLog(usuario, momento));

				linha = bufferedReader.readLine();
			}
				
			System.out.println("Total de usuario: " + log.size());
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}

class EntradaDeLog {
	private String usuario;
	private Date momento;

	public EntradaDeLog(String usuario, Date momento) {
		this.usuario = usuario;
		this.momento = momento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntradaDeLog other = (EntradaDeLog) obj;
		return Objects.equals(usuario, other.usuario);
	}
}