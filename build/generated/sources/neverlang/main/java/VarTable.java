
import neverlang.runtime.*;
public class VarTable extends EndemicSlice {
  public void declarations() {
    declare("VarTable", new java.util.HashMap());

  }
  public void staticDeclarations() {

  }
  public String[] getTags() {
    return new String[] { "" };
  }

}