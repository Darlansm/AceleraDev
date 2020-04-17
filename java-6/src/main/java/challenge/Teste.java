package challenge;

public class Teste {

    public static void main(String[] args) {
        Criptografia criptografia = new CriptografiaCesariana();

        String teste = "Darlan xyz 234.:?#@";
       // String teste2 = "";
        //System.out.println(criptografia.criptografar(teste2));
        String cript = criptografia.criptografar(teste);
        //criptografia.criptografar(null);
        //criptografia.descriptografar(null);

        System.out.println(criptografia.criptografar(teste));

        System.out.println(criptografia.descriptografar(cript));


    }
}
