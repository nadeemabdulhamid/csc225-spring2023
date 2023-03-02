
import java.io.*;
import java.util.*;

/**
Loads a dictionary of words and provides
spell-checking facilities.
 */
public class SpellChecker
{
    private ArrayList<String> words;

    // given the file name of the dictionary
    public SpellChecker(String fileName) throws FileNotFoundException {
        words = new ArrayList<String>();

        Scanner sc = new Scanner(new File(fileName));

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            words.add( s );
        }
        sc.close();

        // profiling
        System.out.println( "Words loaded: " + words.size() );

    }

    // check if the given word is a valid word in
    // the dictionary
    public boolean checkSpelling(String word) {
        boolean result = false;
        int cost = 0;

        for (int i = 0; i < words.size(); i++) {
            cost++; // charge for the upcoming .equals()
            if ( words.get(i).equals( word ) ) {
                result = true;
                break;
            }
        }

        System.out.println("Total cost (basic): " + cost);
        return result;
    }

    
    public boolean checkSpellingOpt(String word) {
        int N = words.size();
        int cost = 0;                   // code profiling = adding logic to code
                                        //    to compute some measure of efficiency

        int lo = 0;
        int hi = N-1;
        
        while ( lo <= hi ) {
            int mid = (lo + hi)/2;      //   find the midpoint between lo and hi
            cost++;
            int comp = words.get(mid).compareTo(word);  // store the comparison result, 0/neg/pos
                    
            if (comp == 0) {            // if words.get(mid) matches `word` return true
                System.out.println("Total cost (opt): " + cost);
                return true;
            } else if (comp < 0) {      // otherwise if words.get(mid) < `word`
                lo = mid+1;             //     repeat with  lo becoming `mid + 1`
            } else {                    // otherwise (words.get(mid) > `word`)
                hi = mid-1;             //     repeat with  hi becoming `mid - 1`
            }
        }
        
        System.out.println("Total cost (opt): " + cost);
        return false;
    }

    /* check if word occurs in this dictionary anywhere between
     * the indices `lo` and `hi`, both inclusive.
     */
    public boolean checkSpellingOpt(String word, int lo, int hi) {
        if (lo > hi) { return false; }
        
        int mid = (lo + hi)/2;      //   find the midpoint between lo and hi
        int comp = words.get(mid).compareTo(word);  // store the comparison result, 0/neg/pos
        
                                    // if words.get(mid) matches `word` return true
        if (comp == 0) {
            return true;
        } else if (comp < 0) {
                                    // otherwise if words.get(mid) < `word`
                                    //     repeat with  lo becoming `mid + 1`
            return checkSpellingOpt(word, mid+1, hi);
        } else {
                                    // otherwise (words.get(mid) > `word`)
                                    //     repeat with  hi becoming `mid - 1`
            return checkSpellingOpt(word, lo, mid-1);
        }
                                    //  note: need to figure out when to return false????
    }
    

    public boolean checkSpellingSilly(String word) {
        boolean found = false;
        int cost = 0;

        for (int i = 0; i <= words.size(); i++) {
            cost++; 
            if (i < words.size() && words.get(i).equals(word)) { found = true; break; }

            for (int j = 0; j < i; j++) {
                cost++;
                if (words.get(j).equals(word)) { found = true; }
            }
        }

        System.out.println("Total cost (silly): " + cost);
        return found; 
    }

}

