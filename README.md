# Eshop (Tutorial)

Nama    : Syifa Kaffa Billah

NPM     : 2206816430

Kelas   : Adpro-C

Link Deploy: https://eshop-syifakaffa.koyeb.app/

<details>
<summary>Module 4</summary>

## Reflection - Module 4


</details>

1) **Reflect based on Percival (2017) proposed self-reflective questions (in “Principles and Best Practice of Testing” submodule, chapter “Evaluating Your Testing Objectives”), whether this TDD flow is useful enough for you or not. 
If not, explain things that you need to do next time you make more tests.**

   Menurut saya, penggunaan menggunakan pendekatan TDD cukup berguna bagi saya karena pendekatan TDD ini melakukan pengujian terlebih dahulu sebelum menulis kode yang akan diuji. 
Saya cukup merasakan perbedaannya dibandingkan sebelumnya, dimana waktu yang saya gunakan untuk men debug tidak selama yang sebelumnya, walaupun memang di awal cukup sulit saat membuat test.


2) **You have created unit tests in Tutorial. Now reflect whether your tests have successfully followed F.I.R.S.T. principle or not.
If not, explain things that you need to do the next time you create more tests.**

   Ya, saya rasa kode yang saya buat telah mengikuti F.I.R.S.T Principle. 

<details>
<summary>Module 3</summary>

## Reflection - Module 3

1) **Explain what principles you apply to your project!**

    - **Single Reponsibility Principle (SRP)**: 
      Ya, saya menerapkan SRP dalam kode saya, dimana saya memisahkan tanggung jawab mengenerate Id dan create product ke dalam dua method yang berbeda. 
      Selain itu, saya juga memisahkan tanggung jawab pada method update car dimana melakukan pencarian mobil dengan ID tertentu dan melakukan pengeditan atribut mobil ditempatkan di dua method yang berbeda, 
      sehingga keduanya memiliki satu fokus saja yang harus dikerjakan.

    - **Open-Closes Principle**: 
      Ya, saya telah menerapkan OCP dalam kode saya. Saya membuat agar ID dari sebuah product dan Car (pada method create) bisa open untuk extend dengan cara lain tanpa harus memodifikasi kode yang sebelumnya.

    - **Liskov Substitution Principle**:
      Ya, saya telah menerapkan LSP dengan membuat CarController tidak meng-extend ProductController dan menjadi class yang berdiri sendiri.
      Kita tahu bahwa LSP menyatakan bahwa objek dari suatu kelas harus bisa diganti dengan instance dari subkelasnya tanpa mengubah fungsionalitas program.
      Jika saya tetap memaksa CarController mengextend ProductController, maka bisa saja CarController akan memiliki behavior yang tidak sesuai dengan entitas Car.
      Dengan membatalkan CarController mengextend ProductController, saya dapat memastikan bahwa setiap kontroler fokus pada tanggung jawabnya sendiri tanpa tercampur-aduk dengan logika yang tidak relevan.

    - **Interface Segregation**:
      Ya, saya rasa saya sudah menerapkan ISP dalam program saya. Semua Interface yang ada pada program saya hanya memiliki fungsi-funsgi (method) yang terkait dengan fokus mereka, seperti misalnya interface ProductService hanya memiliki fungs-fungsi yang terkait dnegan layanan product seperti edit, create, delete.
   
    - **Dependency Inversion**:
      Ya, saya sudah merafactoring agar program menerapkan DIP. Pada program saya, saya membuat ProductRepositoryInterface dan CarRepositoryInterface untuk membuat abstraksi dari operasi-operasi yang diperlukan oleh product dan car. Dengan kata lain, memungkinkan saya untuk memisahkan kelas-kelas tingkat tinggi dari detail implementasi repositori yang mana sudah memenuhi DIP.
  

2) **Explain the advantages of applying SOLID principles to your project with examples.**

   Dengan menerapkan SOLID principle, program yang saya buat menjadi lebih fleksibel dan mudah untuk di modifikasi oleh pengembang lain. Ketika aturan perubahan terjadi, desain yang menerapkan SOLID lebih mampu menyesuaikan diri tanpa mempengaruhi bagian lain dari sistem.
   Karena saya memfaktorkan ulang agar repository menggunakan interface, pengembang lain dapat menambahkan implementasi repositori baru tanpa khawatir memengaruhi sistem yang sudah dibuat sebelumnya.


3) **Explain the disadvantages of not applying SOLID principles to your project with examples.**

   Jika kita tidak menerapkan SOLID principle, saya rasa akan sulit untuk mengembangkan program ke tingkat yang lebih kompleks karena sistem yang tidak mengikuti SOLID cenderung kurang fleksibel dalam mengakomodasi perubahan.
   Selain itu, kurangnya pemisahan tanggung jawab dan pengkodean yang tidak jelas dapat menyebabkan perilaku yang tidak terduga dan menyebabkan kesalahan yang sulit diidentifikasi dan diperbaiki. 
   Misalnya, pengembang lain ingin agar ID yang diterapkan pada Product bisa menggunakan opsi selain UUID. Namun, karena sebelumnya saya selalu mengeset ID menggunakan UUID saat create product, maka bisa saja akan menyulitkan pengembang lain untuk mengextendnya.

</details>

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