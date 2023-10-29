import java.util.HashMap;
import java.util.Map;

public class Main {
    private static String[] sentences = {
            "Taki mamy klimat",
            "Wszędzie dobrze ale w domu najlepiej",
            "Wyskoczył jak Filip z konopii",
            "Gdzie kucharek sześć tam nie ma co jeść",
            "Nie ma to jak w domu",
            "Konduktorze łaskawy zabierz nas do Warszawy",
            "Jeżeli nie zjesz obiadu to nie dostaniesz deseru",
            "Bez pracy nie ma kołaczy",
            "Kto sieje wiatr ten zbiera burzę",
            "Być szybkim jak wiatr",
            "Kopać pod kimś dołki",
            "Gdzie raki zimują",
            "Gdzie pieprz rośnie",
            "Swoją drogą to gdzie rośnie pieprz?",
            "Mam nadzieję, że poradzisz sobie z tym zadaniem bez problemu",
            "Nie powinno sprawić żadnego problemu, bo Google jest dozwolony"
    };

    public static void main(String[] args) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String sentence : sentences) {
            String[] words = sentence.toLowerCase().split(" ");
            for (String word : words) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        wordCountMap.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(3)
                .forEach(entry -> System.out.println("\"" + entry.getKey() + "\" - " + entry.getValue()));
    }
}