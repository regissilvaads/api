package med.voll.api.domain.cosulta;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    Boolean existsByMedicoIdAndDataAndMotivoCancelamentoIsNull(Long aLong, LocalDateTime data);

    Boolean existsByPacienteIdAndDataBetween(@NotNull Long aLong, LocalDateTime primeiroHorario, LocalDateTime ultimoHorario);
}
