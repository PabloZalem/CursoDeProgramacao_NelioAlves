package curso_programacao;

public class Atribuicao {
	public static void main(String[] args) {
//Boa pratica com Double
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		System.out.println(area);
	
//Boa pratica com Float
		float c, C, a, resultado;
		
		c = 6f;
		C = 8f;
		a = 5f;
		
		resultado = (c + C) / 2f * a;
		System.out.println(resultado);
		System.out.println("\n\n");
		
/*
 	O compilador recomenda-se casting, pois o sistema pode sentir que podemos perder a 
 	informacao processada
 */
	}
}
