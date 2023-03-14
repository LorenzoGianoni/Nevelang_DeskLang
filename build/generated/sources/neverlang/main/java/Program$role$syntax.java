import neverlang.runtime.Syntax;

public class Program$role$syntax extends Syntax {
 public Program$role$syntax() {
   declareProductions(
    p(nt("Program"), nt("VarInitSect")).setLabel("prog").setScore(0)
   );
   

 }
}