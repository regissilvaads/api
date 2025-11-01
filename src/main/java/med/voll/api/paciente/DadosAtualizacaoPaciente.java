package med.voll.api.paciente;

import med.voll.api.endereco.Endereco;

public record DadosAtualizacaoPaciente(Long id, String nome, String telefone, Endereco endereco) {
}
