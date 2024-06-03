public class Break {
    // Modo condicional if/else
	/* 
    public static void main(String[] args) {
		String sigla = "P";

		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");
			
	}
    */

    // Modo condicional switch / case (aplicável, não recomendável)
	/* 
    public static void main(String[] args) {
		String sigla = "M";
        switch (sigla) {
		    
            case "P":{
			System.out.println("PEQUENO");
			break;
		    }
		   
            case "M":{
			System.out.println("MÉDIO");
			break;
		    }
		    
            case "G":{
			System.out.println("GRANDE");
			break;
		    }
		    
            default:
			System.out.println("INDEFINIDO");
        }
    }
    */

    // Modo condicional convencional (Plano Operadora)
    /* 
	public static void main(String[] args) {
		String plano = "T"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		
        }else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		
        }else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
    }
    */
    
    
    // Modo condicional switch/case (Plano Operadora)
	public static void main(String[] args) {
		String plano = "B"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			
            case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			
            case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
    }
}
