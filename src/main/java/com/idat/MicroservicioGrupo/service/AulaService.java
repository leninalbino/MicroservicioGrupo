package com.idat.MicroservicioGrupo.service;

import com.idat.MicroservicioGrupo.DTO.AulaDTORequest;
import com.idat.MicroservicioGrupo.DTO.AulaDTOResponse;

import java.util.List;

public interface AulaService {
    public void guardarAula(AulaDTORequest producto);
    public void editarAula(AulaDTORequest producto);

    public void eliminarAula(Integer id);

    public List<AulaDTOResponse> listarAula();
    public AulaDTOResponse obtenerAulaId(Integer id);
}
