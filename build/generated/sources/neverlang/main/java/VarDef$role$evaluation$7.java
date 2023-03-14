/* This is a Neverlang-generated source file. Do not edit. */
import neverlang.runtime.*;

import java.util.HashMap;


public class VarDef$role$evaluation$7 implements SemanticAction, java.io.Serializable {

  private int priority = -2147483648;

  private boolean softGuard = false;

  @Override
  public boolean isSoftGuarded() { return softGuard; }

  @Override
  public int getPriority() { return priority; }

  @Override
  public void setPriority(int p) { priority = p; }

  @Override
  public java.lang.String getLabel() { return "def"; };

  @Override
  public int getPosition() { return 7; }

  @Override
  public java.util.Map<java.lang.Integer, java.util.Set<AttributeDefinition>> getRequiredNtAttributes() {
      return java.util.Map.ofEntries(
      new java.util.AbstractMap.SimpleImmutableEntry<java.lang.Integer, java.util.Set<AttributeDefinition>>(8, java.util.Set.of(new AttributeDefinition("value", java.lang.Object.class))),
      new java.util.AbstractMap.SimpleImmutableEntry<java.lang.Integer, java.util.Set<AttributeDefinition>>(9, java.util.Set.of(new AttributeDefinition("value", java.lang.Object.class)))
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
    $ctx.evalChildren($ctx.nt(7));
    System.out.println($ctx.nt(8).getValue($ctx.attr(8, "value"))+" = "+$ctx.nt(9).getValue($ctx.attr(9, "value")));
    var myMap = (HashMap) $ctx.root().<VarTable>getValue("$VarTable").getDeclaredInstance("VarTable");
    myMap.put($ctx.nt(8).getValue($ctx.attr(8, "value")), $ctx.nt(9).getValue($ctx.attr(9, "value")));
    
  }
}