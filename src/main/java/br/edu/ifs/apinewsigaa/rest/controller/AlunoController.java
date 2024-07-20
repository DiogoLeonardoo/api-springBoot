package br.edu.ifs.apinewsigaa.rest.controller;

import br.edu.ifs.apinewsigaa.model.AlunoModel;
import br.edu.ifs.apinewsigaa.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public ResponseEntity<List<AlunoModel>> getAlunos() {
        List<AlunoModel> alunos = alunoService.obterAlunos();
        return ResponseEntity.ok(alunos);
    }


    @GetMapping("/{id}")
    public ResponseEntity<AlunoModel> getAluno(@PathVariable int id) {
         AlunoModel aluno = alunoService.obterAluno(id);
         if (aluno != null) {
             return ResponseEntity.ok(aluno);
         } else {
             return ResponseEntity.notFound().build();
         }
    }

    @PostMapping
    public ResponseEntity<AlunoModel> insert(@RequestBody AlunoModel obj) {
        obj = alunoService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        alunoService.deletarAluno(id);
        return ResponseEntity.noContent().build();
    }
}
