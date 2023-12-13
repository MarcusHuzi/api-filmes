package dev.huzi.filmes;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepositorio filmeRepositorio;
    public List<Filme> todosFilmes(){
        return filmeRepositorio.findAll();
    }

    public Optional<Filme> umFilme(ObjectId id){
        return filmeRepositorio.findById(id);
    }
}
