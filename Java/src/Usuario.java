import java.util.ArrayList;
import java.util.List;

public class Usuario {

        private String nome;
        private String cidade;
        private String email;
        private List<Categoria> interesses;

        public Usuario(String nome, String cidade, String email) {
            this.nome = nome;
            this.cidade = cidade;
            this.email = email;
            this.interesses = new ArrayList<Categoria>();

        }

        public void adicionarInteresse(Categoria categoria) {
            interesses.add(categoria);

    }

        public String resumo() {

            return "Olá!" + nome + "\n" +
                    "Você receberá atualizações do clima de: " + cidade + "\n" +
                    "Interesses: " + interesses + "\n" +
                    "\n" + "No E-mail: " + email;
        }




}
