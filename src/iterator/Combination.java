package iterator;
import java.util.Iterator;

public final class Combination implements Iterator <int[]> {
    private final int[] array;
    private final int low, high;

    public Combination(int n, int low, int high) {
        this.array = new int[n];
        this.low = low;
        this.high = high;
        this.initialize();
    }

    @Override
    public boolean hasNext() {
        return array[0] <= high;
    }

    @Override
    public int[] next() {
        int[] res = new int[array.length];
        System.arraycopy(array, 0, res, 0, array.length);
        int i = array.length - 1;
        while (array[i] == high && i > 0) {
            array[i] = low;
            i--;
        }
        array[i]++;
        return res;
    }
    
    public void showCombinations() {
        while(this.hasNext()){
            for (int i : this.next()) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
    
    public void initialize(){
        for (int i : array) {
            array[i] = low;
        }
    }
}