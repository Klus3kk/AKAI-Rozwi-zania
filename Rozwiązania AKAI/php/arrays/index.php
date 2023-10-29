<?php
$str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
$words = explode(" ", $str);

foreach ($words as $key => $word) {
    $wordLength = strlen($word);
    if ($wordLength < 4) {
        unset($words[$key]); 
    } else {
        $words[$key] = ucfirst($word); 
    }
}

echo "Pierwotny ciąg: ";
print_r($words);
echo "<br>";

echo "Ciąg po modyfikacjach: ";
print_r(array_values($words));
?>