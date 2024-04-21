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
