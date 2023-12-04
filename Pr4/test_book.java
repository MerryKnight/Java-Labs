public class test_book
{
    public static void main(String[] args)
    {
        Book b2 = new Book("Supernatural Fairy Tale","A Maclean",1975);
        Book b1 = new Book("bbe","B Taler Jr",2);
        
        System.out.println(b1.getauthor());
        System.out.println(b2.toStringg());

    }

    public static class Book
    {
        private String name;
        private String author;
        private int year;

        public Book(String n, String c, int a) {
            name = n;
            author = c;
            year = a;
        }
        public Book(String n) {
            name = n;
            author = "Unknown";
            year = 0;
        }
        public Book()
        {
            name = "Bible";
            author = "Unknown";
            year = 0;
        }
        public void setyear(int year)
        {
            this.year = year;
        }
        public void setname(String name)
        {
            this.name = name;
        }
        public void setauth(String auth)
        {
            this.author = auth;
        }
        public String getname()
        {
            return this.name;
        }
        public String getauthor()
        {
            return this.author;
        }
        public int getyear()
        {
            return this.year;
        }
        public String toStringg()
        {
            return this.name+", year "+this.year + " author "+ this.author;
        }
    }
}