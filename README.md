# Program Kalkulator Kelompok A6

Program kalkulator dengan unit testing menggunakan build tools Maven.

## Project Structure

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

## How to run Program

1. Clone Project
```shell
git clone https://github.com/fardanaljihad/program-kalkulator.git
```
2. Open Terminal / CMD
3. Install Dependencies
```shell
mvn install
```
4. Build Program
```shell
mvn package
```
5. Run Program
```shell
java -cp .\target\program-kalkulator-1.0-SNAPSHOT.jar kelompok.a6.maven.App
```
   
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
