import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter document type (word/pdf/excel): ");
            String type = sc.nextLine();
            
            DocumentFactory factory;
            
            if (type.equalsIgnoreCase("word")) {
                factory = new WordFactory();
            } else if (type.equalsIgnoreCase("pdf")) {
                factory = new PdfFactory();
            } else {
                factory = new ExcelFactory();
            }
            
            Document doc = factory.createDocument();
            doc.open();
        }
    }
}
