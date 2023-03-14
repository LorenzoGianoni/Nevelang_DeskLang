module Program {
    reference syntax {
        prog: Program <-- VarInitSect;
    }

    role(evaluation){
        prog: .{
            System.out.println($$VarTable);
        }.
    }
}