fun main() {
    val wordCount = mutableMapOf<String, Int>()
    val sentences = listOf(
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
    )

    for (sentence in sentences) {
        val words = sentence.toLowerCase().split(" ")
        for (word in words) {
            wordCount[word] = wordCount.getOrDefault(word, 0) + 1
        }
    }
    val sortedWordCount = wordCount.entries.sortedByDescending { it.value }

    for (i in 0 until 3) {
        println("${i + 1}. \"${sortedWordCount[i].key}\" - ${sortedWordCount[i].value}")
    }
}