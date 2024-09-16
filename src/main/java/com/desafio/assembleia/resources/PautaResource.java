package com.desafio.assembleia.resources;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.desafio.assembleia.domain.Pauta;
import com.desafio.assembleia.services.PautaService;

@RestController
@RequestMapping(value="/pautas")
public class PautaResource {

    @Autowired
    private PautaService service;

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<Pauta>> findAll() {
        List<Pauta> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
