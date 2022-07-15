package com.idat.MicroservicioGrupo.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AulaDTOResponse {
    private Integer idAula;
    private String nombre;
    private String numAula;
}
