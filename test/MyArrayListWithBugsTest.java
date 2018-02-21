import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListWithBugsTest {

    /*
     *
     * 1 | Assert Size 0 -> Add(Object o) -> Assert size 1
     * 2 | Add(object o1) -> Add(object o2) -> Add(object o3) -> Assert size 3 -> assert get(2)==o3
     * 3 | Add(object o1) -> Add(object o2) -> Add(object o3) -> Assert size 3 -> remove(2) -> Assert size 2
     * 4 | Add(object o1) -> Add(object o2) -> Add(object o3) -> Assert size 3 -> remove(2) -> Assert OutofBounds get(2)
     * 5 | Add(object o1) -> Add(object o2) -> Add(object o3) -> Assert size 3 -> Assert OutOfBounds Add(0, o4)
     * 6 | Add(object o1) -> Add(object o2) -> Add(object o3) -> Assert size 3 -> remove(3) -> add(525, o4) -> Assert get(525)==o4 -> assert Size 4
     * 7 | Add(object o1) -> Add(object o2) -> Assert size 2 -> Assert OutOfBounds remove(3)
     *
     * */

     // 1 | Assert Size 0 -> Add(Object o) -> Assert size 1
    @Test
    public void testCase1() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        mawb.add(new Object());
        assertEquals(1, mawb.size());
    }

    // 2 | Add(object o1) -> Add(object o2) -> Add(object o3) -> Assert size 3 -> assert get(2)==o3
    @Test
    public void testCase2() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        mawb.add(new Object());
        Object o3 = new Object();
        mawb.add(new Object());
        mawb.add(o3);
        assertEquals(o3, mawb.get(2));
    }

    // 3 | Add(object o1) -> Add(object o2) -> Add(object o3) -> Assert size 3 -> remove(2) -> Assert size 2
    @Test
    public void testCase3() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        mawb.add(new Object());
        mawb.add(new Object());
        mawb.add(new Object());
        assertEquals(3, mawb.size());
        mawb.remove(2);
        assertEquals(2, mawb.size());
        mawb.add(new Object());
        mawb.add(new Object());
        mawb.add(new Object());
        mawb.add(new Object());
        mawb.add(new Object());
        mawb.add(new Object());
        assertEquals(8, mawb.size());


    }

    // 4 | Add(object o1) -> Add(object o2) -> Add(object o3) ->
    // Assert size 3 -> remove(2) -> Assert OutofBounds get(2)
    @Test (expected = IndexOutOfBoundsException.class)
    public void testCase4() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        mawb.add(new Object());
        mawb.add(new Object());
        mawb.add(new Object());
        assertEquals(3, mawb.size());
        mawb.remove(2);
        mawb.get(2);
    }

    // 5 | Add(object o1) -> Add(object o2) -> Add(object o3)
    // -> Assert size 3 -> Assert OutOfBounds Add(0, o4)
    @Test (expected = IndexOutOfBoundsException.class)
    public void testCase5() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        mawb.add(new Object());
        mawb.add(new Object());
        mawb.add(new Object());
        assertEquals(3, mawb.size());
        Object o4 = new Object();
        mawb.add(0, o4);
    }

    // 6 | Add(object o1)-> Add(object o2) ->
    // Add(object o3) -> Assert size 3 -> remove(2) -> add(525, o4) -> Assert get(525)==o4 -> assert Size 4
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCase6() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        mawb.add(new Object());
        mawb.add(new Object());
        mawb.add(new Object());
        assertEquals(3, mawb.size());
        mawb.remove(2);
        Object o4 = new Object();
        mawb.add(525,o4);
        mawb.get(525);
        assertEquals(3, mawb.size());
    }


    // 7 | Add(object o1) -> Add(object o2) ->
    // Assert size 2 -> Assert OutOfBounds remove(3)
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCase7() {
        MyArrayListWithBugs mawb = new MyArrayListWithBugs();
        mawb.add(new Object());
        mawb.add(new Object());
        assertEquals(2, mawb.size());
        mawb.remove(3);
        assertEquals(1, mawb.size());

    }

}