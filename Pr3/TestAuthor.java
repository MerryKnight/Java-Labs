public class TestAuthor {
    public static void main(String[] args)
    {
        Author a1 = new Author("V Pelevin","levitation@gmail.com",'m');
        System.out.println(a1.getEmail());
        System.out.println(a1.getName());
        System.out.println(a1.getGender());
        System.out.println(a1.to_String());
    }

}
