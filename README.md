# Program Kalkulator Kelompok A6

Program kalkulator dengan unit testing menggunakan build tools Maven.
<br><br>
Program Kalkulator ini merupakan sebuah proyek sederhana yang menyediakan fungsi tambah, kurang, kali, dan bagi. Pengguna dapat memasukkan dua operand dan memilih operator yang ingin digunakan. Proses perhitungan dilakukan dengan memanggil modul terisolasi yang melakukan validasi input dan operasi perhitungan. Validasi meliputi pengecekan apakah input adalah angka, apakah angka berada dalam range yang diizinkan, apakah operator yang dimasukkan valid, dan apakah pembagi tidak nol. Jika semua validasi berhasil, perhitungan dilanjutkan dan hasilnya ditampilkan; jika tidak, pesan error yang sesuai akan ditampilkan.

<img src="https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white"> <img src="https://img.shields.io/badge/-Maven-C71A36?style=flat&logo=apache-maven&logoColor=white"> <img src="https://img.shields.io/badge/-JUnit-25A162?style=flat&logo=junit&logoColor=white">

## Project Structure

Berikut ini adalah struktur direktori untuk program kalkulator menggunakan Maven.

```bash
program-kalkulator/
├── src/
├   ├── main/java/kelompok/a6/maven/
├   ├   └── App.java
├   └── test/java/kelompok/a6/maven/
├       └── AppTest.java
├── target/
├── .gitignore
├── pom.xml
└── README.md
```

- **src/ :** Direktori tempat source code proyek disimpan. Terbagi menjadi dua sub-direktori:

  - **main/java/kelompok/a6/maven/ :** Source code proyek disimpan di direktori ini, termasuk file `App.java` yang berisi logika utama dari kalkulator.
  - **test/java/kelompok/a6/maven/ :** Direktori ini berisi source code (unit test) untuk memastikan fungsi aplikasi sesuai harapan.

- **target/ :** Direktori ini dihasilkan oleh Maven saat proyek dikompilasi. Berisi file-file hasil kompilasi seperti file bytecode, file JAR, dan hasil pembuatan lainnya.

- **.gitignore :** File ini berisi daftar file dan direktori yang diabaikan oleh Git saat proses pelacakan perubahan (version control), berguna untuk menyimpan file-file sementara atau hasil kompilasi.

- **pom.xml :** Ini adalah file konfigurasi utama untuk proyek Maven. Di dalamnya, ditentukan dependensi proyek, pengaturan pembuatan, konfigurasi plugin, dan informasi proyek lainnya seperti nama, versi, dan deskripsi.

## Prerequisites

1. Install Java (JDK)
2. Install Maven
3. Install IDE (example: Visual Studio Code)

## How to run Program

1. Clone Project

```shell
git clone https://github.com/fardanaljihad/program-kalkulator.git
```

2. Open Project on IDE
3. Open Terminal on IDE
4. Install Dependencies

```shell
mvn install
```

5. Build Program

```shell
mvn package
```

6. Run Program

```shell
java -cp .\target\program-kalkulator-1.0-SNAPSHOT.jar kelompok.a6.maven.App
```

## List Test Case

| No  | Test Case Name                                                    | Modul Test Name                       |
| :-- | :---------------------------------------------------------------- | :------------------------------------ |
| 1.  | Menginputkan nilai operand yang di luar batas bawah nilai integer | WithInputBelowLowerLimittestMain      |
| 2.  | Menginputkan nilai operand yang dl iuar batas atas nilai integer  | testMainWithInputBeyondUpperLimit     |
| 3.  | Memeriksa nilai operator yang tidak valid                         | testValidateInputInvalidOperator      |
| 4.  | Memeriksa operasi pembagian dengan pembagi bernilai nol           | testValidateInputDivisionByZero       |
| 5.  | Menginputkan operator khusus yang selain (+, -, / , \*)           | testMainwithInvalidOperator           |
| 6.  | Kalkulasi dua bilangan dengan menggunakan operator kurang         | testKalkulasiOperatorKurang           |
| 7.  | Kalkulasi dua bilangan dengan menggunakan operator tambah         | testKalkulasiOperatorTambah           |
| 8.  | Memeriksa nilai operand di luar batas bawah yang diizinkan        | testValidateInputOutOfRangeLowerBound |
| 9.  | Menginputkan Operand1, Operand2 dan Operator yang valid           | testMainwithValidInput                |
| 10. | Menginputkan pembagian bilangan dengan angka 0                    | testMainWithDivisionByZero            |
| 11. | Kalkulasi dua bilangan dengan menggunakan operator bagi           | testKalkulasiOperatorBagi             |
| 12. | Kalkulasi dua bilangan dengan menggunakan operator kali           | testKalkulasiOperatorKali             |
| 13. | Memeriksa nilai operator dan nilai operand yang valid             | testValidateInputValid                |
| 14. | Memeriksa nilai operand di luar batas atas yang diizinkan         | testValidateInputOutOfRangeUpperBound |

## How to run test cases

1. Open the terminal by pressing `Ctrl + Shift + ~`.
2. Command to run a specific test `case: mvn -Dtest=AppTest#[test case name] test`.
3. Command to run all test cases: `mvn test`.
4. Command for generating project report: `mvn site`.
5. Command to generate a test report: `mvn surefire-report:report`.

## Author

- Fardan Al Jihad
- Muhaman Naufal Al Ghani
- Yayang Setia Budi
