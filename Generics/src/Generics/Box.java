package Generics;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(10);
        Box<String> stringBox = new Box<>("Hello, Generics!");

        int intValue = integerBox.getValue();
        String stringValue = stringBox.getValue();

        System.out.println("Integer value: " + intValue);
        System.out.println("String value: " + stringValue);
    }
}
/*
	Neste exemplo, a classe Box é definida com um tipo genérico T. 
	Isso permite que você crie instâncias da classe Box com diferentes tipos de valores. 
	No método main, estamos criando uma instância de Box<Integer> e uma instância de Box<String>. 
	Note que não é necessário fazer conversões de tipo ao recuperar valores do objeto Box.
 */

