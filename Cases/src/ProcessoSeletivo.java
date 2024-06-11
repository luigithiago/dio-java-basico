public class ProcessoSeletivo {
    
    /*
    Case1
    public static void main(String[] args) {
        double salario = 2000.87;
        double valorSolicitado = 2000.87;

        if (valorSolicitado < salario){
            System.out.println("Ligar para o Candidato");

        }
        else if (valorSolicitado == salario){
            System.out.println("Ligar para o candidato, com contra proposta");

        }
        else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
    
}
*/

public static void main(String[] args) {
    //salario base maior que salario pretendido
    case1(2000.0, 1900.0);
    
    //salario base igual que salario pretendido
    case1(2000.0, 2000.0);
    
    //salario base igual que salario pretendido
    case1(1900.0, 2000.0);
}
static void case1(double salarioBase, double salarioPretendido) {
    
    if(salarioBase > salarioPretendido) {
        System.out.println("LIGAR PARA O CANDIDATO");
    }
    else if(salarioBase == salarioPretendido) {
        System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    }
    else {
        System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
    }
}
}

