package dev.huzi.filmes;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public ResponseEntity<List<Filme>> getTodosFilmes(){
        return new ResponseEntity<List<Filme>>(filmeService.todosFilmes(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Filme>> getUmFilme(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Filme>>(filmeService.umFilme(id), HttpStatus.OK);
    }
}
