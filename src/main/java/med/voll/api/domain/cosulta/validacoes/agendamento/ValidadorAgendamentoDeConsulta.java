package med.voll.api.domain.cosulta.validacoes.agendamento;

import med.voll.api.domain.cosulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {
    void validar(DadosAgendamentoConsulta dados);
}
