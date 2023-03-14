/* This is a Neverlang-generated source file. Do not edit. */
import neverlang.runtime.*;


public class Program$role$evaluation$0 implements PostorderSemanticAction, java.io.Serializable {

  private int priority = -2147483648;

  private boolean softGuard = false;

  @Override
  public boolean isSoftGuarded() { return softGuard; }

  @Override
  public int getPriority() { return priority; }

  @Override
  public void setPriority(int p) { priority = p; }

  @Override
  public java.lang.String getLabel() { return "prog"; };

  @Override
  public int getPosition() { return 0; }

  @Override
  public java.util.Map<java.lang.Integer, java.util.Set<AttributeDefinition>> getRequiredNtAttributes() {
      return java.util.Map.ofEntries(
      
    );
  }

  @Override
  public java.util.Map<java.lang.Integer, java.util.Set<AttributeDefinition>> getProvidedNtAttributes() {
    return java.util.Map.ofEntries(
      
    );
  }

  @Override
  public boolean predicate(Context $ctx) {
    ASTNode $n = $ctx.node();
    return true;
  }

  public void apply(Context $ctx) {
    ASTNode $n = $ctx.node();
    System.out.println($ctx.root().<VarTable>getValue("$VarTable"));
    
  }
}