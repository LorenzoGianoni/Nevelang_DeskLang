module VarDef {

    imports {
        javautils.VarTable;
    }

    reference syntax {
        varinitsec: VarInitSect <-- "where" VarList;
        list: VarList <--  VarDef "," VarList;
        endlist: VarList <-- VarDef;
        def: VarDef <-- VarName "=" VarValue;
        name: VarName <-- /[a-z]/;
        value: VarValue <-- /[-]?[0-9]+/;
    }

    role (varDef) {
        name: .{$name.value = #0.text; }.
        value: .{$value.value = Integer.parseInt(#0.text); }.
        def: @{
            $$VarTable.put($def[1].value, $def[2].value);
        }.
    }
}