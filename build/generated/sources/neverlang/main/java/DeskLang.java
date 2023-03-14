

import neverlang.runtime.*;
import com.google.inject.AbstractModule;
import neverlang.tools.NeverlangInterpreterFactory;

@NeverlangAbstractModule(DexterNeverlangModule.class)
public class DeskLang extends Language {
  public DeskLang() {
    super();
  }
  public DeskLang(NeverlangModule neverlangModule, AbstractModule... modules){
    super(neverlangModule, modules);
  }
  public DeskLang(AbstractModule... modules){
    super(modules);
  }
  public void lazyLoad() {
    
	importEndemicSlices(
	 "VarTable"
	);
	importSlices(
	 "VarDef",
	 "Program"
	);
	declare(
	 role(Role.Flags.POSTORDER,"evaluation")
	);
  }

  public static void main (java.lang.String[] args) {
    try {
      var nlg = new NeverlangInterpreterFactory("DeskLang").build();
      nlg.run();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}