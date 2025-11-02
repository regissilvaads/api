package med.voll.api.domain.endereco;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Objects;
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    public Endereco(DadosEndereco endereco) {
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.uf = endereco.uf();
        this.cidade = endereco.cidade();
        this.complemento = endereco.complemento();
        this.logradouro = endereco.logradouro();
        this.numero = endereco.numero();
    }
    public void atualizarInformacoes(Endereco endereco) {
        if (Objects.nonNull(endereco.bairro)) {
            this.bairro = endereco.bairro;
        }
        if (Objects.nonNull(endereco.cep)) {
            this.cep = endereco.cep;
        }
        if (Objects.nonNull(endereco.uf)) {
            this.uf = endereco.uf;
        }
        if (Objects.nonNull(endereco.cidade)) {
            this.cidade = endereco.cidade;
        }
        if (Objects.nonNull(endereco.complemento)) {
            this.complemento = endereco.complemento;
        }
        if (Objects.nonNull(endereco.logradouro)) {
            this.logradouro = endereco.logradouro;
        }
        if (Objects.nonNull(endereco.numero)) {
            this.numero = endereco.numero;
        }
    }
}
