import neverlang.runtime.Syntax;

public class VarDef$role$syntax extends Syntax {
 public VarDef$role$syntax() {
   declareProductions(
    p(nt("VarInitSect"), "where", nt("VarList")).setLabel("varinitsec").setScore(0),
    p(nt("VarList"), nt("VarDef"), ",", nt("VarList")).setLabel("list").setScore(0),
    p(nt("VarList"), nt("VarDef")).setLabel("endlist").setScore(0),
    p(nt("VarDef"), nt("VarName"), "=", nt("VarValue")).setLabel("def").setScore(0),
    p(nt("VarName"), regex("[a-z]", "[a-z]")).setLabel("name").setScore(0),
    p(nt("VarValue"), regex("[0-9]+", "[0-9]+")).setLabel("value").setScore(0)
   );
   

 }
}