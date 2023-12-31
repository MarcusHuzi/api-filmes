package dev.huzi.filmes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.SpringDataMongoDB;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
@Document(collection = "filmes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Filme {

    @Id
    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewIds;
}
