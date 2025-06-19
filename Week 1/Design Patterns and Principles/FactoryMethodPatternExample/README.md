# Factory Method Pattern – Document Management System

You are developing a document management system that needs to create different types of documents (e.g., Word, PDF, Excel) using the Factory Method Design Pattern to achieve this. The user will input the document type at runtime, and the corresponding document will be created and opened.

This project demonstrates how to implement the Factory Method Pattern in Java using user input to dynamically decide which document type to create. It includes interfaces, abstract classes, concrete classes, and a test class to execute the functionality.

Folder Structure:
```
FactoryMethodPatternExample/
├── Code/
│   ├── src/
│   │   ├── Document.java
│   │   ├── WordDocument.java
│   │   ├── PdfDocument.java
│   │   ├── ExcelDocument.java
│   │   ├── DocumentFactory.java
│   │   ├── WordFactory.java
│   │   ├── PdfFactory.java
│   │   ├── ExcelFactory.java
│   │   └── Main.java
│   └── Output/
└── README.md
```


All document types implement a common interface called `Document` that contains an `open()` method. There are three concrete implementations: `WordDocument`, `PdfDocument`, and `ExcelDocument`. The creation logic is encapsulated in a factory hierarchy: an abstract `DocumentFactory` and concrete factories like `WordFactory`, `PdfFactory`, and `ExcelFactory`.

The `Main.java` file contains the user input logic using `Scanner`. It asks the user to enter a document type and then creates the corresponding document using the appropriate factory.

Sample Output:

Enter document type (word/pdf/excel): word  
Opening Word document.

Enter document type (word/pdf/excel): pdf  
Opening PDF document.

Enter document type (word/pdf/excel): excel  
Opening Excel document.

How to Compile and Run:

Navigate to the `src` folder in terminal and run:

javac *.java  
java Main

This project demonstrates clean separation of object creation logic, encourages loose coupling, and is easily extendable. To add a new document type, simply add a new document class and a corresponding factory – no need to change the client code.


