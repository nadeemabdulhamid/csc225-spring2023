public class GPANormalizer implements IFunc<Student, Double> {
       public Double apply( Student s ) {
           return s.normalizeGPA();
       }
   }