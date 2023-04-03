

public class Dictionary {
    String[] words;
    
    public Dictionary() {
        words = new String[1000];
    }
    
    private int hashCode(String word) {
        //return word.length();
        int sum = 0;
            
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                sum = sum + c * (i + 1);
            }
            
        return sum % words.length;
    }
    
    public void add(String word) {
        int i = hashCode(word);
        words[i] = word;
    }
    
    public boolean contains(String word) {
        int i = hashCode(word);
        return words[i] != null &&
                    words[i].equals(word);
    }
    
}





