package it.figuccia;

public class Start {
    public static void main(String[] args) {

        String phrase = "I Like to code near the Lake with my friend Luke";

        String result = phrase.replaceAll("(?i)(?!friend )l[a-z]*ke", "BLA");

        System.out.println(result);
    }
}
