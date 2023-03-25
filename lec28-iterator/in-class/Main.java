

public class Main {
    public static void main(String[] args) {
        
        
        ArrayStack<String> st = new ArrayStack<String>();
        st.push("apple");
        st.push("banana");
        st.push("carrot");
        st.push("elephant");
        
        for (String s : st) {
            System.out.println(s);
            // ...
        }
        
        /*
         
          Iterator it = st.iterator();
          while ( it.hasNext() ) {
              String s = it.next();
              ...
          }
         
         
         */
        
        
        
        
        //    for (x in range(11)): ...
        
        
        for (int x : new Range(11, 100, 11)) {
            System.out.println(x);
        }
        
        
        
        
    }
}
