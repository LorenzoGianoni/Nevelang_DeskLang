module Utils {
    reference syntax {
        name: VarName <-- /[a-z]/;
        int: Integer <-- /[-]?[0-9]+/;
    }

    role(evaluation){
        name: .{$name.value = #0.text; }.
        int: .{$int.value = Integer.parseInt(#0.text); }.
    }

}