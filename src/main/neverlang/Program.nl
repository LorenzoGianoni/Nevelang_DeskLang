module Program {
    reference syntax {
        prog: Program <-- PrintSect VarInitSect;
    }

    role(varDef){
        prog: .{
            System.out.println($$VarTable);
        }.
    }
}