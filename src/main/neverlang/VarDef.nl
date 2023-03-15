module VarDef {

    imports {
        javautils.VarTable;
    }

    reference syntax {
        varinitsec: VarInitSect <-- "where" VarList;
        list: VarList <--  VarDef "," VarList;
        endlist: VarList <-- VarDef;
        def: VarDef <-- VarName "=" Integer;

    }

    role (varDef) {

        def: @{
            $$VarTable.put($def[1].value, $def[2].value);
        }.
    }
}