import enitities.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Author author1 = new Author("Adam Smith", LocalDate.of(1723, 5, 16));
        Author author2 = new Author("Ludwig von Mises", LocalDate.of(1881, 9, 29));

        Book book1 = new Book("A Riqueza das Nações", author1);
        Book book2 = new Book("As seis lições", author2);

        library.addBook(book1);
        library.addBook(book2);

        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Você gostaria de ver os livros disponíveis? (sim/não)");
            resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("sim")) {
                library.showBooks();

                System.out.println("Digite o ID do livro que deseja emprestar:");
                int idLivro = scanner.nextInt();
                scanner.nextLine();

                Book chosenBook = library.getBookById(idLivro);

                if (chosenBook != null && chosenBook.getAvailable()) {
                    System.out.println("Digite seu nome:");
                    String clientName = scanner.nextLine();
                    Client client = new Client(clientName);

                    chosenBook.loan(client);
                    System.out.println("O livro \"" + chosenBook.getTitle() + "\" foi emprestado com sucesso para " + client.getName() + ".");
                } else {
                    System.out.println("O livro não está disponível ou não foi encontrado.");
                }
            }
        } while (!resposta.equals("não"));

        System.out.println("Sistema encerrado. Até mais!");
        scanner.close();
    }
}