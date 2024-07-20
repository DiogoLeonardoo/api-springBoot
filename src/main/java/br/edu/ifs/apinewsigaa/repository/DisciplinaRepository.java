package br.edu.ifs.apinewsigaa.repository;


import br.edu.ifs.apinewsigaa.model.DisciplinaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface DisciplinaRepository extends JpaRepository<DisciplinaModel, Integer> {

    Optional<DisciplinaModel> findById(int id);
    void deleteById(int id);

    Optional<DisciplinaModel> findByNome(String nome);

    Optional<DisciplinaModel> findByNumeroCreditos(int numeroCreditos);

}
