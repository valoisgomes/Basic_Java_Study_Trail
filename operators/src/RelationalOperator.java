public class RelationalOperator {
    
    public static void main(String[] args) {
        
        //classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2){
            
            boolean booleanValue = numero1>numero2;
            System.out.println("Numero 1 maior que numero 2 " + booleanValue);
        }

        if(numero1 < numero2){

            boolean booleanValue = numero1<numero2;
            System.out.println("Numero 1 menor que numero 2 " + booleanValue);

        }


        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4));

        int num1 = 130;
        int num2 = 130;
        System.out.println(num1 == num2); //true
        
        Integer number1 = 130;
        Integer number2 = 130;

        System.out.println(number1 == number2); //false
        
        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals
        
         System.out.println(number1.equals(number2));

    }
}
