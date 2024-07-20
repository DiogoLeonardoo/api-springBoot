package br.edu.ifs.apinewsigaa.service;

import br.edu.ifs.apinewsigaa.model.projection.DisciplinaProfessorProjection;
import br.edu.ifs.apinewsigaa.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<DisciplinaProfessorProjection> obterDisciplinasProfessor(int matricula) {
        return professorRepository.ObterDisciplinasProfessor(matricula);
        //professorRepository.
    }
}
