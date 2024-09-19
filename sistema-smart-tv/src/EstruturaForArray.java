public class EstruturaForArray {
    public static void main(String[] args) {
        String alunos [] = {"João", "Felipe", "Eduardo", "Maria"};

        /* Padrão antigo
        for (int x = 0; x < alunos.length; x++){
        */
        
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno);
        }
    }
}
