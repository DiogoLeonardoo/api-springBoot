package br.edu.ifs.apinewsigaa.service;

import br.edu.ifs.apinewsigaa.model.AlunoModel;
import br.edu.ifs.apinewsigaa.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoModel> obterAlunos() {
        return alunoRepository.findAll();
    }

    public AlunoModel obterAluno(int id) {
        return alunoRepository.findById(id).orElse(null);
    }

   public AlunoModel insert (AlunoModel aluno) {
        return alunoRepository.save(aluno);
   }

   public void deletarAluno(int id) {
        alunoRepository.deleteById(id);
   }

}
