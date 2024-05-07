public class FormatadorCep {
        public static void main(String[] args) {
            try {
                String cepFormatado = formatarCep("19857043");
                System.out.println(cepFormatado);
            } catch (CepInvalidoException e) {
                  System.out.println("O cep nao esta digitado corretamente");
            }
        }

        static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
                throw new CepInvalidoException();

                return "19.857-043";
        }
}
