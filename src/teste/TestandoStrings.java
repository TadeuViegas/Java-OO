package teste;

public class TestandoStrings {
    public static void main(String[] args) {

        //classe String em java.lang
        //e seus métodos mais conhecidos
        String s = "Tadeu";
        String s1 = new String("Tadeu Viegas");

        Boolean bol = s1.startsWith("Tad");
        System.out.println("Prefixo tad?: " + bol);

        boolean bol1 = s1.endsWith("gas");
        System.out.println("Sufixo gas: " + bol1);

        int s2 = s1.lastIndexOf("V");
        System.out.println("lastIndexOf: " + s2);

        String result = s1.replace('T','t');
        System.out.println("Usando replace: " + result);

        String result1 = s1.toLowerCase();
        System.out.println("Usando lower case: " + result1);
        String result2 = s1.toUpperCase();
        System.out.println("Usando Upper case: " + result2);

        int pos = s1.indexOf("Viegas");
        System.out.println("indexof retorna a posicao da strg: " + pos);

        String substring = s1.substring(4, 9);
        System.out.println("substring devolve a str a partir do index: " + substring);

        int size = s1.length();
        System.out.println("length devolve o tamanho da str: " + size);

//        charAt recebe o index e devolve o char na posicao
        for (int i = 0; i < s1.length(); i++){
            System.out.print(s1.charAt(i) + " ");
        }

        String empty = " ";
        System.out.println("\n" + "vazio:" + empty);
        System.out.println("é vazio? " + empty.isEmpty());
        System.out.println("ta em branco? " + empty.isBlank());

        String spaceTest = "   tadeu    ";
        System.out.println("string com espaços: " + spaceTest);
        String spaceTest2 =  spaceTest.trim();
        System.out.println("string com trim que remove os spaces : " + spaceTest2);

        System.out.println("Split separa uma string em substrings");
        String[] split = s1.split(" ");

        for(String substrings : split){
            System.out.println(substrings);
        }

        System.out.println("classe String e StringBuilder se interligam atras da interface CharSequence");
        CharSequence cs = new StringBuilder("TADEU");
        String ss = s1.replace("Tadeu",cs);
        System.out.println(ss);

        System.out.println("Concatenação de Strings, usa-se StringBuilder para menor uso de recurso");
        StringBuilder strBuilder = new StringBuilder("Tadeu ");
        strBuilder.append("Viegas ");
        strBuilder.append("whith nickname: ");
        strBuilder.append("drk god ");
        strBuilder.append("this is csgo top1 ");
        strBuilder.append("\nhtlv confirmed");

        String texto = strBuilder.toString();
        System.out.println(texto);

    }
}
