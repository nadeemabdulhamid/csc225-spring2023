
import java.util.*;

public class Range implements Iterable<Integer> {
    private int start, stop, step;
    
    public Range(int stop) {
        this(0, stop);
    }
    
    public Range(int start, int stop) {
        this(start, stop, 1);
    }
    
    public Range(int start, int stop, int step) {
        this.start = start;
        this.stop = stop;
        this.step = step;
    }

    
    public boolean equals(Object x) {
        
        

        Range rx = (Range) x;
        return this.start == rx.start && 
                this.stop == rx.stop &&
                this.step == rx.step;
    }
    
    
    public Iterator<Integer> iterator() {
        return new RI();
    }
    
    // range iterator
    private class RI implements Iterator<Integer> {
        private int current;
        
        public RI() {
            current = start;
        }
        
        public Integer next() {
            int toReturn = current;
            current += step;
            return toReturn;
        }
        
        public boolean hasNext() {
            return current < stop;
        }
    }
    
}
