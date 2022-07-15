package com.idat.MicroservicioGrupo.service;

import com.idat.MicroservicioGrupo.DTO.AulaDTORequest;
import com.idat.MicroservicioGrupo.DTO.AulaDTOResponse;
import com.idat.MicroservicioGrupo.model.Aula;
import com.idat.MicroservicioGrupo.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AulaServiceImpl implements AulaService{

    @Autowired
    public AulaRepository repositorio;

    @Override
    public void guardarAula(AulaDTORequest aula) {

        Aula a = new Aula();
        a.setIdAula(aula.getIdAula());
        a.setNombre(aula.getNombre());
        a.setNumAula(aula.getNumAula());
        repositorio.save(a);
    }

    @Override
    public void editarAula(AulaDTORequest aula) {


        Aula a = new Aula();
        a.setIdAula(aula.getIdAula());
        a.setNombre(aula.getNombre());
        a.setNumAula(aula.getNumAula());
        repositorio.saveAndFlush(a);
    }

    @Override
    public void eliminarAula(Integer id) {
        repositorio.deleteById(id);
    }

    @Override
    public List<AulaDTOResponse> listarAula() {

        List<AulaDTOResponse> lista = new ArrayList<AulaDTOResponse>();
        AulaDTOResponse a = null;

        for (Aula aula :repositorio.findAll()) {
            a = new AulaDTOResponse();

            a.setIdAula(aula.getIdAula());
            a.setNombre(aula.getNombre());
            a.setNumAula(aula.getNumAula());

            lista.add(a);

        }
        return lista;
    }

    @Override
    public AulaDTOResponse obtenerAulaId(Integer id) {

        Aula aula = repositorio.findById(id).orElse(null);
        AulaDTOResponse a = new AulaDTOResponse();
        a.setIdAula(aula.getIdAula());
        a.setNombre(aula.getNombre());
        a.setNumAula(aula.getNumAula());
        return a;
    }

}
