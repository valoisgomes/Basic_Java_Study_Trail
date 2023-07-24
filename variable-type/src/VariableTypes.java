public class VariableTypes {
    
    // Constants example
    public static final double PI = 3.14159;
    public static final int CURRENT_YEAR = 2023;

    public static void main(String[] args) throws Exception {
        
        // Primitive variables example
        int age = 25;
        double height = 1.75;
        char gender = 'M';
        boolean isStudent = true;

        System.out.println("User Information:");
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " meters");
        System.out.println("Gender: " + gender);
        System.out.println("Is a student? " + isStudent);

        // Constants usage example
        double radius = 5.0;
        double circleArea = PI * radius * radius;
        int birthYear = CURRENT_YEAR - age;

        System.out.println("\nCalculations with constants:");
        System.out.println("Circle area with radius " + radius + " is: " + circleArea);
        System.out.println("Approximate birth year: " + birthYear);

    }
}
