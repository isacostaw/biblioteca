package br.com.senai.teste.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import br.com.senai.teste.model.Livro;
import br.com.senai.teste.repository.LivroRepository;

@Service 
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository){
        this.livroRepository=livroRepository;
    }
    public Livro cadastrarLivro(Livro livro){
        return livroRepository.save(livro);
    }
    public List<Livro> listarLivros(){
        return livroRepository.findAll();
    }
    public Livro buscarPorId(int id ){
        return livroRepository.findById(id).orElse(null);
    }
    
    public Optional<Livro> atualizarLivro(int id, Livro novoLivro){
        Optional <Livro> lexist = livroRepository.findById(id);
        if (lexist.isPresent()){
            Livro livro = lexist.get();
            livro.setTitulo(novoLivro.getTitulo());
            livro.setAutor(novoLivro.getAutor());
            livro.setAnoPublicacao(novoLivro.getAnoPublicacao());
            Livro livroAtualizado = livroRepository.save(livro);
            return Optional.of(livroAtualizado);
        }else{
            return Optional.empty();
        }

    }
    public boolean excluirLivro(int id){
        Optional<Livro> livroexist = livroRepository.findById(id);

        if(livroexist.isPresent()){
            livroRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
        }
        
        
    }
    

