package med.voll.api.infra.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GerarHashSenha {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String senha = "123456";
        String hash = encoder.encode(senha);

        System.out.println("Hash gerado: " + hash);

        // Verifica se a senha original corresponde ao hash
        boolean confere = encoder.matches("123456", hash);
        System.out.println("Senha válida? " + confere);
    }
}
