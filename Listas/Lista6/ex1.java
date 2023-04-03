package Lista6;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {

    static ArrayList<Curso> cursos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner cs = new Scanner (System.in);
        int entrada = 0;        
        
        while (entrada != 6)
        {

            System.out.println("\nMenu:\n1 - Criar Curso\n2 - Criar Aluno\n3 - Remover Aluno\n4 - Mostrar Todos os Cursos\n5 - Mostrar alunos do curso\n6 - Sair");
            entrada = Integer.parseInt(cs.nextLine());
            switch (entrada)
            {
            case 1:
            {             
                System.out.println("Digite o nome do curso");
                var nomeCurso = cs.nextLine();
                System.out.println("Digite o código do curso");
                var codCurso = Integer.parseInt(cs.nextLine());
                System.out.println("Digite a carga horária do curso");
                var carga = Integer.parseInt(cs.nextLine());
                Curso c = new Curso(codCurso, carga, nomeCurso);
                cursos.add(c);
                break;
            }

            case 2:
            {
                Scanner tec = new Scanner(System.in);
                Aluno a = new Aluno();
                System.out.println("Digite o RA do aluno");
                a.setRA(tec.nextLine());
                System.out.println("Digite o nome do aluno");
                a.setNome(tec.nextLine());
                System.out.println("Escolha o código do curso");

                for (Curso curso : cursos) {
                    System.out.println(curso.imprimir());
                }

                int codCurso = Integer.parseInt(tec.nextLine());
                for (Curso curso : cursos) {
                    if (curso.getCodigo() == codCurso) {
                            curso.inserirAluno(a);
                    }
                }
                
                break;
            }
                                        

            case 3:
            {
                Scanner tec = new Scanner(System.in);
                System.out.println("Digite o código do curso.");
                System.out.println("-------------------------");

                for (Curso curso : cursos) {
                    System.out.println(curso.imprimir());
                }

                int codCurso = Integer.parseInt(tec.nextLine());
                Curso cursoEscolhido = new Curso();
                for (Curso curso : cursos) {
                    if (curso.getCodigo() == codCurso) {
                        cursoEscolhido = curso;
                    }
                }
                System.out.println("Digite o RA do aluno a ser removido.");
                var ra = tec.nextLine();
                Aluno alunoEscolhido = new Aluno();
                for (Aluno aluno : cursoEscolhido.getAlunos()) {
                    if (aluno.getRA().equals(ra)) {
                        alunoEscolhido = aluno;
                    }
        }
        cursoEscolhido.removerAluno(
                cursoEscolhido.getAlunos().indexOf(alunoEscolhido));
                    
                break;
            }

            case 4:
            {
                for (Curso curso : cursos) {
                    System.out.println(curso.imprimir());
                }
                break;
            }

            case 5:
            {
                for (Curso curso : cursos) {
                    System.out.println(curso.imprimirCompleto());
                    System.out.println("--------------------");
                }
                
                break;
            }

            case 6:
            {
                System.out.println("\nObrigado!");
                break;
            }
    
            default: 
            {
                System.out.println("Opçao inválida.");
            }

            }

        }

        cs.close();

    }


}
