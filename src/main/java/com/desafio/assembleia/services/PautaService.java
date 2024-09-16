package com.desafio.assembleia.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.assembleia.domain.Pauta;
import com.desafio.assembleia.repository.PautaRepository;

@Service
public class PautaService {
    
    @Autowired
    private PautaRepository repo;

    public List<Pauta> findAll(){
        return repo.findAll();
    }
}
