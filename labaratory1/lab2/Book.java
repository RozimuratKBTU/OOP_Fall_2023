package labatory1.lab2;


    public class Book {

        public enum Genre {
            FICTION, NON_FICTION, SCIENCE_FICTION, MYSTERY, FANTASY
        }


        private static int bookCount = 0;

        private final String title;
        private final String author;
        private final int publicationYear;
        private final Genre genre;


        private final String bookId;


        public Book(String title, String author, int publicationYear, Genre genre) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
            this.genre = genre;


            bookCount++;


            this.bookId = "BOOK-" + bookCount;
        }

        {

        }

        public Book(String title, String author, int publicationYear) {
            this(title, author, publicationYear, Genre.FICTION);
        }


        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

        public Genre getGenre() {
            return genre;
        }


        public String getBookId() {
            return bookId;
        }


        public String toString() {
            return "Title: " + this.title + "\nAuthor: " + this.author + "\nYear: " + this.publicationYear +
                    "\nGenre: " + this.genre + "\nBook ID: " + this.bookId;
        }

    }


