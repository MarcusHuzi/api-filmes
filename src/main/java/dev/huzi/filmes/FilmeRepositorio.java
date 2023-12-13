package dev.huzi.filmes;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepositorio extends MongoRepository<Filme, ObjectId> {
}
