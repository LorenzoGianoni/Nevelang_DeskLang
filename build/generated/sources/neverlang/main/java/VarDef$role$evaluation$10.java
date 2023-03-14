/* This is a Neverlang-generated source file. Do not edit. */
import neverlang.runtime.*;

import java.util.HashMap;


public class VarDef$role$evaluation$10 implements PostorderSemanticAction, java.io.Serializable {

  private int priority = -2147483648;

  private boolean softGuard = false;

  @Override
  public boolean isSoftGuarded() { return softGuard; }

  @Override
  public int getPriority() { return priority; }

  @Override
  public void setPriority(int p) { priority = p; }

  @Override
  public java.lang.String getLabel() { return "name"; };

  @Override
  public int getPosition() { return 10; }

  @Override
  public java.util.Map<java.lang.Integer, java.util.Set<AttributeDefinition>> getRequiredNtAttributes() {
      return java.util.Map.ofEntries(
      
    );
  }

  @Override
  public java.util.Map<java.lang.Integer, java.util.Set<AttributeDefinition>> getProvidedNtAttributes() {
    return java.util.Map.ofEntries(
      new java.util.AbstractMap.SimpleImmutableEntry<java.lang.Integer, java.util.Set<AttributeDefinition>>(10, java.util.Set.of(new AttributeDefinition("value", java.lang.Object.class)))
    );
  }

  @Override
  public boolean predicate(Context $ctx) {
    ASTNode $n = $ctx.node();
    return true;
  }

  public void apply(Context $ctx) {
    ASTNode $n = $ctx.node();
    $ctx.nt(10).setValue($ctx.attr(10, "value"), (java.lang.Object)( $n.tchild(0).token.text));
    
  }
}