package med.voll.api.domain.cosulta;

import jakarta.validation.constraints.NotNull;

public record DadosCancelamentoConsulta(
        @NotNull
        Long idConsulta,

        @NotNull MotivoCancelamento motivo
) {

}
