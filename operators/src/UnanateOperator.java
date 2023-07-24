public class UnanateOperator {
    
    public static void main(String[] args) {
        
        // Operador unário
        int x = 10;

        // Operador unário de incremento
        x++; // Incrementa o valor de x em 1 (x = x + 1)

        // Operador unário de decremento
        int y = 5;
        y--; // Decrementa o valor de y em 1 (y = y - 1)

        // Outros exemplos
        boolean isTrue = true;
        isTrue = !isTrue; // Operador unário NOT (inverte o valor booleano)

        int a = 15;
        int b = -a; // Operador unário negativo (inverte o sinal do valor)

        System.out.println("Valor de x após o incremento: " + x);
        System.out.println("Valor de y após o decremento: " + y);
        System.out.println("Valor de isTrue após a negação: " + isTrue);
        System.out.println("Valor de b após o operador unário negativo: " + b);

    }
}
