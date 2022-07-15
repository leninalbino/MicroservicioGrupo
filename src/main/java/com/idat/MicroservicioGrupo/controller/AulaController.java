package com.idat.MicroservicioGrupo.controller;

import com.idat.MicroservicioGrupo.DTO.AulaDTORequest;
import com.idat.MicroservicioGrupo.DTO.AulaDTOResponse;
import com.idat.MicroservicioGrupo.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/Aula")
public class AulaController {
    @Autowired
    private AulaService servicio;

    @GetMapping("/ListAula")
    public @ResponseBody List<AulaDTOResponse> listarAula(){

        return servicio.listarAula();
    }

    @PostMapping("/guardar")
    public @ResponseBody void guardar(@RequestBody AulaDTORequest aula){
        servicio.guardarAula(aula);

    }



    @PutMapping("/actualizar")
    public @ResponseBody void editar(@RequestBody AulaDTORequest aula){

       AulaDTOResponse a = servicio.obtenerAulaId(aula.getIdAula());

        if(a != null)
        servicio.editarAula(aula);
    }

    @DeleteMapping("/eliminar/{id}")
    public @ResponseBody void eliminar(@PathVariable Integer id){

        AulaDTOResponse a = servicio.obtenerAulaId(id);
        if(a != null) {
            servicio.eliminarAula(id);
        }

    }

}
