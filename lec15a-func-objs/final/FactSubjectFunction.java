public class FactSubjectFunction implements IFunc<Fact, String> {
       public String apply( Fact f ) {
           return f.getSubject();
       }
   }