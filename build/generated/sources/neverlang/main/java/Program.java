
import neverlang.runtime.*;
public class Program extends neverlang.runtime.Module {
  public Program() {
    declareSyntax(); /* no syntax specified */
    declareRole("evaluation", 0);

    requireEndemicSlices("VarTable");
  }

}
