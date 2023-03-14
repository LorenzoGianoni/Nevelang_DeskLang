
import neverlang.runtime.*;
public class VarDef extends neverlang.runtime.Module {
  public VarDef() {
    declareSyntax(); /* no syntax specified */
    declareRole("evaluation", 7,10,11);

    requireEndemicSlices("VarTable");
  }

}
