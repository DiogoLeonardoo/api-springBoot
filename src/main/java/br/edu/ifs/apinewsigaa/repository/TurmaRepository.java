package br.edu.ifs.apinewsigaa.repository;

import br.edu.ifs.apinewsigaa.model.TurmaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TurmaRepository extends JpaRepository<TurmaModel, Integer> {

    Optional<TurmaModel> findById(int id);
    void deleteById(int id);
    List<TurmaModel> findAll();

    //Query para encontrar professores das turmas
    //Query para encontrar disciplinas das turmas
    //Query para encontrar alunos das turmas
    //Query para encontrar matriculas das turmas


}
