# Eshop (Tutorial)

Nama    : Syifa Kaffa Billah

NPM     : 2206816430

Kelas   : Adpro-C


## Reflection 1
Saya rasa, kode yang saya buat sudah cukup baik dalam menerapkan Clean dan Secure Code. Saya telah mengimplementasikan penamaan variabel dan method yang deskriptif sesuai dengan fungsinya, sehingga penamaan tersebut lebih bermakna. Selain itu, saya juga menambahkan beberapa comments pada kode-kode yang dirasa memang membutuhkannya. Terkait secure coding, saya masih merasa belum sepenuhnya secure. Namun, beberapa secure coding yang sudah saya terapkan, yaitu pembuatan Id Product menggunaan UUID agar orang lain tidak mudah untuk menebaknya. Terkait masalah yang dihadapi, saya sempat mendapati beberapa error pada saat run, salah satunya yaitu saat melakukan redirect ke page lain yang membutuhkan Id Product. Pada saat error, website menampilkan page yang berisi banyak ringkasan error. Hal tersebut tentu bisa ditingkatkan dengan membuat scenario page yang dituju jika terdapat error, sehingga program yang dimiliki bisa lebih clean dan nyaman digunakan.

## Reflection 2
1. Setelah membuat unit-test, saya merasa bahwa sebagai seorang developer sangat penting untuk melakukan pengujian terlebih dahulu, sebab bisa saja code yang kita anggap benar ternyata masih akan menimbulkan error. Seperti yang terjadi pada saya, yaitu pada method create product yang ternyata id bisa saja ter set dua kali yang mengakibatkan error. Saya juga merasa bahwa kemampuan saya dalam membuat unit-test masih sangat minim, terutama pada saat membuat funtional-test. Sehingga saya harus lebih meningkatkan pemahaman terhadap unit-test.

   Terkait jumlah unit test yang harus dibuat dalam sebuah class, saya rasa kita harus menyesuaikan jumlahnya dengan beberapa pertimbangan, seperti kekompleksitasan sebuah class atau berdasarkan  jumlah method yang ada.  Namun satu hal yang pasti, usahakan untuk minimal memiliki 1 unit-test pada sebuah program.

   Untuk memastikan unit-test yang kita buat sudah cukup baik, kita bisa mencoba beberapa unit-test dengan test case yang bisa saja outlier. Lalu, saya rasa ika code kita memiliki 100% code coverage, itu tidak berarti kode kita tidak akan mengalami bug/error.
