# Eshop (Tutorial)

Nama    : Syifa Kaffa Billah

NPM     : 2206816430

Kelas   : Adpro-C

Link Deploy: https://eshop-syifakaffa.koyeb.app/

<details>
    <summary>Module 2</summary>

## Reflection - Module 2
Code Coverage: 100%

>List the code quality issue(s) that you fixed during the exercise and explain your strategy on fixing them.

Salah satu _code quality issue_ yang saya hadapi adalah tidak konsistenya penamaan method class Product. Ketidak konsistenan tersebut membuat unit test yang saya gunakan tidak terpanggil, sebab saya salah memanggil nama method.
Strategi yang saya gunakan untuk memperbaiki isu tersebut adalah mengganti penamaan method-method agar menjadi lebih konsisten, seperti jika berkaitan dengan Product maka saya akan menambahkan kata "product" di nama methodnya.

>Look at your CI/CD workflows (GitHub)/pipelines (GitLab). Do you think the current implementation has met the definition of Continuous Integration and Continuous Deployment? Explain the reasons (minimum 3 sentences)!

Ya, saya rasa CI/CD workflows yang saya implementasikan saat ini sudah sesuai dengan definisi dari CI/CD. Untuk penerapan Continuous Integration (CI), saya telah mengintegrasikan berbagai alat pengujian seperti JUnit, OSSF Scorecard, dan SonarCloud. Tools-tools tersebut dibuat untuk mengawasi kode yang diperbarui, menjamin integrasinya yang lancar, dan memvalidasi fungsionalitasnya.
Untuk Continuous Deployment (CD), saya telah mengkonfigurasi proses *deployment* otomatis ke Koyeb menggunakan Dockerfile. Ini memungkinkan _deployment_ aplikasi yang cepat dan efisien setelah proses CI selesai.

</details>

<details>
<summary>Module 1</summary>

## Reflection 1 - Module 1

Saya rasa, kode yang saya buat sudah cukup baik dalam menerapkan Clean dan Secure Code. Saya telah mengimplementasikan penamaan variabel dan method yang deskriptif sesuai dengan fungsinya, sehingga penamaan tersebut lebih bermakna. Selain itu, saya juga menambahkan beberapa comments pada kode-kode yang dirasa memang membutuhkannya. Terkait secure coding, saya masih merasa belum sepenuhnya secure. Namun, beberapa secure coding yang sudah saya terapkan, yaitu pembuatan Id Product menggunaan UUID agar orang lain tidak mudah untuk menebaknya. Terkait masalah yang dihadapi, saya sempat mendapati beberapa error pada saat run, salah satunya yaitu saat melakukan redirect ke page lain yang membutuhkan Id Product. Pada saat error, website menampilkan page yang berisi banyak ringkasan error. Hal tersebut tentu bisa ditingkatkan dengan membuat scenario page yang dituju jika terdapat error, sehingga program yang dimiliki bisa lebih clean dan nyaman digunakan.

## Reflection 2 - Module 1
Setelah membuat unit-test, saya merasa bahwa sebagai seorang developer sangat penting untuk melakukan pengujian terlebih dahulu, sebab bisa saja code yang kita anggap benar ternyata masih akan menimbulkan error. Seperti yang terjadi pada saya, yaitu pada method create product yang ternyata id bisa saja ter set dua kali yang mengakibatkan error. Saya juga merasa bahwa kemampuan saya dalam membuat unit-test masih sangat minim, terutama pada saat membuat funtional-test. Sehingga saya harus lebih meningkatkan pemahaman terhadap unit-test.

Terkait jumlah unit test yang harus dibuat dalam sebuah class, saya rasa kita harus menyesuaikan jumlahnya dengan beberapa pertimbangan, seperti kekompleksitasan sebuah class atau berdasarkan  jumlah method yang ada.  Namun satu hal yang pasti, usahakan untuk minimal memiliki 1 unit-test pada sebuah program.

Untuk memastikan unit-test yang kita buat sudah cukup baik, kita bisa mencoba beberapa unit-test dengan test case yang bisa saja outlier. Lalu, saya rasa jika code kita memiliki 100% code coverage, itu tidak berarti kode kita tidak akan mengalami bug/error.
</details>
