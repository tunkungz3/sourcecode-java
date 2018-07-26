import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortTest {

    @Test
    public void sortOne() {
        Sort sort = new Sort();
        int[] input = {1};
        int [] sorted = sort.offend(input);
        assertArrayEquals(new int[] {1}, sorted);
    }
    @Test
    public void sortTwo() {
        Sort sort = new Sort();
        int[] input = {2,1};
        int [] sorted = sort.offend(input);
        assertArrayEquals(new int[] {1,2}, sorted);
    }
    @Test
    public void sortThree() {
        Sort sort = new Sort();
        int[] input = {3,1,2};
        int [] sorted = sort.offend(input);
        assertArrayEquals(new int[] {1,2,3}, sorted);
    }
    @Test
    public void mutipleSort() {
        Sort sort = new Sort();
        int[] input = {1,2,3,4,5};
        int [] sorted = sort.of(input);
        assertArrayEquals(new int[]{1,2,3,4,5}, sorted);
    }

}
