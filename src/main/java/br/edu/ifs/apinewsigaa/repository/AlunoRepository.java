package br.edu.ifs.apinewsigaa.repository;

import br.edu.ifs.apinewsigaa.model.AlunoModel;
import br.edu.ifs.apinewsigaa.model.TurmaModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface AlunoRepository extends JpaRepository<AlunoModel, Integer> {

    Optional<AlunoModel> findById(int ind);


    void deleteById(int id);

    Optional<AlunoModel> findByCpf(String cpf);

    void deleteByCpf(String cpf);

    Optional<AlunoModel> findByEmail(String email);




}
