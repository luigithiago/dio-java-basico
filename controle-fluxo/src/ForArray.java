public class ForArray {
    // em arrays o índice de elementos inicia em ZERO
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        //Forma abreviada
	    for(String aluno : alunos) {
        System.out.println("Nome do alune é: " + aluno);
        }
    
       /*  for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
        */
    }
}
