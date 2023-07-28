package Enumeracoes;

public enum DiasDaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
}

// Utilização
class ExemploEnum {
    public static void main(String[] args) {
        DiasDaSemana hoje = DiasDaSemana.QUARTA;
        System.out.println(hoje);  // Saída: QUARTA

        // Comparando enumerações
        if (hoje == DiasDaSemana.QUARTA) {
            System.out.println("Hoje é quarta-feira!");
        }
    }
}

