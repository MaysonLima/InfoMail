public class Usuario {

        private String nome;
        private String cidade;
        private String email;

        public Usuario(String nome, String cidade, String email) {
            this.nome = nome;
            this.cidade = cidade;
            this.email = email;


        }

        public String resumo() {

            return "Olá!" + nome + "\n" +
                    "Você receberá atualizações do clima de: " + cidade +
                    "\n" + "No E-mail: " + email;
        }




}
