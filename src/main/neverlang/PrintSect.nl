module PrintSect {
    imports {
        javautils.VarTable;
    }

    reference syntax {

        print: PrintSect <-- "print" Expression;
        expr: Expression <-- Value "+" Expression;
        lastexpr: Expression <-- Value;
        var: Value <-- VarName;
        int: Value <-- Integer;
    }

    role(print){

        var: .{ $var.value = (Integer) $$VarTable.get($var[1].value); }.
        int: .{ $int.value = $int[1].value; }.
        lastexpr: .{ $lastexpr.value = $lastexpr[1].value; }.
        expr: .{$expr.value = ((int)$expr[1].value) + ((int)$expr[2].value);}.
        print: .{ System.out.println(""+$print[1].value);}.

    }


}