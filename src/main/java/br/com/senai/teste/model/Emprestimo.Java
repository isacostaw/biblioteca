@Entity
@Table(name="emprestimo")
public class Emprestimo{
    @Id
    @GeneratedValue(strategy=GeneretionType.IDENTITY)
     private Integer id;

     private LocalDate dataEmprestimo;

     @ManyToOne
     @JoinInColumn(name ="aluno_id" nullable= false)
     private Aluno aluno;

     @ManyToOne
     @JoinInColumn(name ="livro_id" nullable= false)
     private Livro livro;

     public Emprestimo(){

     }
 
     public Integer getId(){
        return id;
     }
     public Aluno getAluno(){
        return aluno;
     }
     public Livro getLivro(){
        return livro;
     }

     public LocalDate getDataEmprestimo(){
        return dataEmprestimo;
     }

     public void setAluno(Aluno aluno){
        this.aluno=aluno;
     }
     public void setLivro(Livro livro){
        this.livro=livro;
     }

     public void setDataEmprestimo(LocalDate dataEmprestimo){
        this.dataEmprestimo=dataEmprestimo;
     }

}

