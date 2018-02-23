import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListWithBugsTest {



    @Test
    public void testCaseOne() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        assertEquals(0, mawb.size());
        mawb.add(new String("Hej"));
        assertEquals(1, mawb.size());
        mawb.add(new String("Hej"));
        assertEquals(2, mawb.size());
    }
    @Test
    public void testCaseTwo() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        assertEquals(0, mawb.size());
        mawb.add(new String("Hej"));
        assertEquals(1, mawb.size());
        mawb.add(new String("Hej"));
        mawb.add(new String("Hej"));
        mawb.add(new String("Hej"));
        mawb.add(new String("Hej"));
        assertEquals(5, mawb.size());
    }
    @Test
    public void testCaseThree() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        assertEquals(0, mawb.size());
        mawb.add(new String("Hej"));
        assertEquals(1, mawb.size());
        mawb.add(new String("Hej"));
        mawb.add(new String("Hej"));

        mawb.add(new String("Hej"));

        mawb.add(new String("Hej"));
        mawb.add(new String("Hej"));
        assertEquals(6, mawb.size());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCaseFour() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        mawb.get(1);
    }

    @Test
    public void testCaseFive() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        String o1 = new String("Hej1");
        mawb.add(o1);
        String o2 = new String("Hej2");
        mawb.add(o2);
        String o3 = new String("Hej3");
        mawb.add(o3);
        String o4 = new String("Hej4");
        mawb.add(o4);
        String o5 = new String("Hej5");
        mawb.add(o5);
        assertEquals(o4, mawb.get(3));
        assertEquals(o2, mawb.get(1));
        assertEquals(o3, mawb.get(2));
        assertEquals(o1, mawb.get(0));
        assertEquals(o5, mawb.get(4));
    }
    @Test
    public void testCaseSix() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        assertEquals(0, mawb.size());

        String o1 = new String("Hej1");
        mawb.add(o1);
        mawb.add(new String("Hej2"));
        mawb.add(new String("Hej3"));
        mawb.add(new String("Hej4"));
        String o5 = new String("Hej5");
        mawb.add(o5);
        String o6 = new String("Hej6");
        mawb.add(o6);
        String o7 = new String("Hej7");
        mawb.add(o7);
        String o8 = new String("Hej8");
        mawb.add(o8);
        //assertEquals(o1, mawb.get(1));
        assertEquals(o5, mawb.get(4));
        assertEquals(o8, mawb.get(7));
        //assertEquals(o8, mawb.get(9));

    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCaseSeven() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        mawb.remove(1);
    }


    @Test
    public void testCaseEight() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        String o1 = new String("Hej1");
        mawb.add(o1);
        mawb.add(new String("Hej2"));
        mawb.add(new String("Hej3"));
        mawb.add(new String("Hej4"));
        String o5 = new String("Hej5");
        mawb.add(o5);
        String o6 = new String("Hej6");
        mawb.add(o6);
        assertEquals(6, mawb.size());
        assertEquals(o6, mawb.remove(5)); //get and remove uses different indexes
        assertEquals(5, mawb.size());
    }
    @Test
    public void testCaseNine() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        String o1 = new String("Hej1");
        mawb.add(o1);
        mawb.add(new String("Hej2"));
        mawb.add(new String("Hej3"));
        mawb.add(new String("Hej4"));
        String o5 = new String("Hej5");
        mawb.add(o5);
        String o6 = new String("Hej6");
        mawb.add(o6);
        assertEquals(6, mawb.size());
        String o7 = new String("Hej7");
        mawb.add(o7);
        assertEquals(o7, mawb.remove(6));
        assertEquals(6, mawb.size());
        mawb.add(new String("Hej8"));
        mawb.add(new String("Hej9"));
        mawb.remove(6);
       assertEquals(7, mawb.size());
    }


    @Test
    public void testCaseTen() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        String o1 = new String("Hej1");
        mawb.add(o1);
        String o2 = new String("Hej2");
        mawb.add(o2);
        String o3 = new String("Hej3");
        mawb.add(o3);
        String o4 = new String("Hej4");
        mawb.add(o4);
        String o5 = new String("Hej5");
        mawb.add(o5);
        String o6 = new String("Hej6");
        mawb.add(o6);
        assertEquals(6, mawb.size());
        String o7 = new String("Hej7");
        mawb.add(o7);
        assertEquals(o7, mawb.remove(6));
        assertEquals(6, mawb.size());
        String o72 = new String("Hej72");
        mawb.add(o72);
        String o8 = new String("Hej8");
        mawb.add(o8);
        assertEquals(8, mawb.size());

        assertEquals(o8, mawb.get(7));
        assertEquals(o72, mawb.get(6));
        assertEquals(o6, mawb.get(5));
        assertEquals(o5, mawb.get(4));

        assertEquals(o4, mawb.get(3));
        assertEquals(o3, mawb.get(2));
        assertEquals(o2, mawb.get(1));
        assertEquals(o1, mawb.get(0));


        assertEquals(o8, mawb.remove(7));
        assertEquals(o72, mawb.remove(6));
        assertEquals(o6, mawb.remove(5));

        assertEquals(o5, mawb.remove(4));
        assertEquals(o4, mawb.remove(3));
        assertEquals(o3, mawb.remove(2));
        assertEquals(o2, mawb.remove(1));
        assertEquals(o1, mawb.remove(0));
        assertEquals(0, mawb.size());

    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCaseEleven() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        String o1 = new String("Hej1");
        mawb.add(o1);
        String o2 = new String("Hej2");
        mawb.add(o2);
        String o3 = new String("Hej3");
        mawb.add(o3);
        String o4 = new String("Hej4");
        mawb.add(o4);
        String o5 = new String("Hej5");
        mawb.add(o5);
        assertEquals(5, mawb.size());
        assertEquals(o5, mawb.get(4));
        assertEquals(o4, mawb.get(3));
        assertEquals(o3, mawb.get(2));
        assertEquals(o2, mawb.get(1));
        assertEquals(o5, mawb.remove(4));
        assertEquals(o4, mawb.remove(3));
        assertEquals(o3, mawb.remove(2));
        assertEquals(o2, mawb.remove(1));
        assertEquals(o1, mawb.remove(0));
        mawb.get(3);
        assertEquals(0, mawb.size());

    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCaseTwelve() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        String o1 = new String("Hej1");
        mawb.add(o1);
        String o2 = new String("Hej2");
        mawb.add(o2);
        String o3 = new String("Hej3");
        mawb.add(o3);
        String o4 = new String("Hej4");
        mawb.add(o4);
        String o5 = new String("Hej5");
        mawb.add(o5);
        assertEquals(5, mawb.size());
        assertEquals(o5, mawb.get(4));
        assertEquals(o4, mawb.get(3));
        assertEquals(o3, mawb.get(2));
        assertEquals(o2, mawb.get(1));
        assertEquals(o5, mawb.remove(4));
        assertEquals(o4, mawb.remove(3));
        assertEquals(o3, mawb.remove(2));
        assertEquals(o2, mawb.remove(1));
        assertEquals(o1, mawb.remove(0));
        mawb.remove(3);
        assertEquals(0, mawb.size());

    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCaseThirteen() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        String o1 = new String("Hej1");
        mawb.add(o1);
        String o2 = new String("Hej2");
        mawb.add(o2);
        String o3 = new String("Hej3");
        mawb.add(o3);
        String o4 = new String("Hej4");
        mawb.add(o4);
        String o5 = new String("Hej5");
        mawb.add(o5);
        String o6 = new String("Hej6");
        mawb.add(o6);
        assertEquals(6, mawb.size());
        assertEquals(o6, mawb.get(5));
        assertEquals(o5, mawb.get(4));
        assertEquals(o4, mawb.get(3));
        assertEquals(o3, mawb.get(2));
        assertEquals(o2, mawb.get(1));
        assertEquals(o6, mawb.remove(5));
        assertEquals(o5, mawb.remove(4));
        assertEquals(o4, mawb.remove(3));
        assertEquals(o3, mawb.remove(2));
        assertEquals(o2, mawb.remove(1));
        assertEquals(o1, mawb.remove(0));
        mawb.get(3);
        assertEquals(0, mawb.size());

    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCaseFourten() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        String o1 = new String("Hej1");
        mawb.add(o1);
        String o2 = new String("Hej2");
        mawb.add(o2);
        String o3 = new String("Hej3");
        mawb.add(o3);
        String o4 = new String("Hej4");
        mawb.add(o4);
        String o5 = new String("Hej5");
        mawb.add(o5);
        String o6 = new String("Hej6");
        mawb.add(o6);
        assertEquals(6, mawb.size());
        assertEquals(o6, mawb.get(5));
        assertEquals(o5, mawb.get(4));
        assertEquals(o4, mawb.get(3));
        assertEquals(o3, mawb.get(2));
        assertEquals(o2, mawb.get(1));

        assertEquals(o6, mawb.remove(5));
        assertEquals(o5, mawb.remove(4));
        assertEquals(o4, mawb.remove(3));
        assertEquals(o3, mawb.remove(2));
        assertEquals(o2, mawb.remove(1));
        assertEquals(o1, mawb.remove(0));
        mawb.remove(1);
        assertEquals(0, mawb.size());

    }


    @Test
    public void testCaseFiften() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        String o1 = new String("Hej1");
        mawb.add(o1);
        String o2 = new String("Hej2");
        mawb.add(o2);
        String o3 = new String("Hej3");
        mawb.add(o3);
        String o4 = new String("Hej4");
        mawb.add(o4);
        String o5 = new String("Hej5");
        mawb.add(o5);
        String o6 = new String("Hej6");
        mawb.add(o6);
        String o7 = new String("Hej7");
        assertEquals(6, mawb.size());
        assertEquals(o6, mawb.get(5));
        assertEquals(o5, mawb.get(4));
        assertEquals(o4, mawb.get(3));
        assertEquals(o3, mawb.get(2));
        assertEquals(o2, mawb.get(1));
        mawb.add(1,o7);
        assertEquals(o7, mawb.get(1));


        assertEquals(7, mawb.size());

    }
}