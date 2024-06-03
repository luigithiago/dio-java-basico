public class Ternária {
    //Cenário 1
   /*   public static void main(String[] args) {
            int nota = 3;
            
            String resultado = nota >=7 ? "Aprovado" : "Reprovado";
            
            System.out.println(resultado);
        }
        */

    //  Cenário 2
    
	public static void main(String[] args) {
		int nota = 8;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
    
}
