package med.voll.api.domain.cosulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.cosulta.DadosAgendamentoConsulta;

import java.time.Duration;
import java.time.LocalDateTime;

public class ValidadorHorarioAntecedencia {

    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();
        var agora = LocalDateTime.now();

        var diferecaEmMinutos = Duration.between(agora, dataConsulta).toMinutes();

        if (diferecaEmMinutos < 30) {
            throw new ValidacaoException("Consulta deve ser agendada com antecedência mínima de 30 minutos");
        }
    }
}
