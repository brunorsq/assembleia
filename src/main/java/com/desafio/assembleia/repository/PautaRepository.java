package com.desafio.assembleia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.desafio.assembleia.domain.Pauta;


@Repository
public interface PautaRepository extends MongoRepository<Pauta, String> {
    
}
