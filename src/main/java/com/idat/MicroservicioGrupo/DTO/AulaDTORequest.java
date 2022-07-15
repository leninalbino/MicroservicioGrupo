package com.idat.MicroservicioGrupo.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AulaDTORequest {
    private Integer idAula;
    private String nombre;
    private String numAula;
}
