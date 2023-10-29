<?php
for($i = 100; $i >= 0; $i--) {
    if ($i % 10 === 0) {
        echo '<span style = "color:red;"'.str_repeat($i.' ', 10).'</span><br>';
    } elseif ($i % 4 === 0) {
        echo 'Fire<br>';
    } elseif ($i % 7 === 0) {
        echo 'Boom<br>';
    } else {
        echo $i . '<br>';
    }
}
?>
