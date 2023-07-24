public class Case1 {
    
    public static void main(String[] args) throws Exception {
        
        analiseCandidatos(1800.00);
        analiseCandidatos(3000.00);
        analiseCandidatos(2000.00);
                
    }
    
    static void analiseCandidatos(double SalarioPretendido){
        double salarioBase = 2000.00; 

        if(salarioBase > SalarioPretendido){
        
            System.out.println("LIGAR PARA O CANDIDATO");
        
        }
        else if(salarioBase == SalarioPretendido){

            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        }
        else{

            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");

        }


    }
}
