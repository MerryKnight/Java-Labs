public class HumanTest {
    public static void main(String[] args) {
        Human h = new Human("Bob","15","176","63","student");
        System.out.println(h.getInf());
    }

    public static class Human {
        private String name;
        private String age;
        private String height;
        private String weight;
        private String occupation;


        Head h1 = new Head(true,"brown","circle");
        Hand h2 = new Hand(5,"short",true);
        Leg l1 = new Leg(5,"short",43);
        public Human(String a, String b, String c, String d, String e)
        {
            name = a;
            age = b;
            height = c;
            weight = d;
            occupation = e;
        }
        public Human()
        {
            name = "No Name";
            age = "Unknown";
            height = "Unknown";
            weight = "Unknown";
            occupation = "Unknown";
        }

        class Head{
            private boolean hair;
            private String colorhair;
            private String shape;

            public Head(boolean a, String b, String c)
            {
                hair = a;
                colorhair = b;
                shape = c;
            }
            public Head()
            {
                hair = true;
                colorhair = "brown";
                shape = "circle";
            }

            public String getHead()
            {
                return this.hair+" "+this.colorhair+" "+this.shape;
            }
        }
        class Hand{
            private int fingernumber;
            private String length;
            private boolean muscles;

            public Hand(int a, String b, boolean c)
            {
                fingernumber = a;
                length = b;
                muscles = c;
            }
            public Hand()
            {
                fingernumber = 5;
                length = "short";
                muscles = true;
            }
            public String getHand()
            {
                return this.length+" "+this.fingernumber+" "+this.muscles;
            }

        }
        class Leg{
            private int fingernumber;
            private String length;
            private int legsize;

            public Leg(int a, String b, int c)
            {
                fingernumber = a;
                length = b;
                legsize = c;
            }
            public Leg()
            {
                fingernumber = 5;
                length = "short";
                legsize = 40;
            }
            public String getLeg()
            {
                return this.fingernumber+" "+this.length+" "+this.legsize;
            }
        }

        public String getInf()
        {
            return "This human is "+this.age+".\nHis name is "+this.name+".\nPhysical parametrs(height/weight): "+this.height+" "+this.weight +
                    ".\nHand parametrs(length/fingernumber/muscles): "+ h2.getHand()+".\nHead parametrs(hair/color/shape): "+ h1.getHead()+
                    ".\nLeg parametrs(fingernumber/length/legsize): "+ l1.getLeg();
        }
    }
}