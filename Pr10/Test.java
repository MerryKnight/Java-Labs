
public class Test
{
   public static void rec_simple(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            rec_simple(n / k, k);
        } 
        else {
            rec_simple(n, ++k);
        }
    }
    public static String rec_pal(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return rec_pal((s.substring(1, s.length() - 1)));
            } 
            else 
            {
                return "NO";
            }
        }
    }
    public static int rec_onezero(int a,int b)
    {
        if (a > b+1) return 0;
        if (a==0 || b==0) return 1;
        return rec_onezero(a,b-1) + rec_onezero(a-1,b-1);
    }
    
    public static void main(String[] args)
   {
       rec_simple(145,2);
       System.out.println(rec_pal("abba"));
        System.out.println(rec_onezero(5,6));
   }
}
