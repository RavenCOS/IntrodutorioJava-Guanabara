package guanabara.introdutorio.java.aula6;

public class UtilizandoWrapperClass {
    public static void main(String[] args) {
//        Convertendo números para string:
                int idade = 45;
                String valor = Integer.toString(idade);
                System.out.println("Rogerio tem " + valor + " anos de idade.");

                float litros = 100.49f;
                String valor2 = Float.toString(litros);
                System.out.printf("A caixa d'àgua ficou com %s\n", valor2);

//        Convertendo string para Números:
                String valor3 = "30";
                int idade2 = Integer.parseInt(valor3);
                System.out.printf("Robertina tem %d anos de idade\n", idade2);
                short cargaCelular = Short.parseShort(valor3);
                System.out.println("O celular está com " + cargaCelular + "% de carga");

//        Usa-se 'Invólucro'.toString para converter para string
//        Usa=se 'Invólocro'.parse'TipoPrimitivo' para converter string para números;
    }
}
