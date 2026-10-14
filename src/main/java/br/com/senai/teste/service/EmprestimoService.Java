@Service 

public class EmprestimpoService {

    private final EmprestimoRepository emprestimoRepository;
    private final AlunoRepository alunoRepository;
    private final LivroRepository livroRepository;

    public Emprestimoservice(
        EmprestimoRepository emprestimoRepository,
        AlunoRepository alunoRepository,
        LivroRepository livroRepository){
    }

    public Optional<Emprestimo>cadastrar
    (Integer alunoId,Integer livroid){
        Optional<Aluno> aluno = alunoRepository.findById(alunoId);
        Optional<Livro> livro = livroRepository.findById(livroid);

        if(auno.isEmpty() || livro.isEmpty()){
            return Optional.empty();

        }
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setAluno(aluno.get());
        emprestimo.setLivro(livro.get());
        emprestimo.setDataEmprestimo(dataEmprestimo.get());

        return Optional.of(emprestimoRepository.save(emprestimo));

    }
}