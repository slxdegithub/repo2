
var sub = function(val) {
    if (val.length == 0 || val == undefined) {
        return;
    }
    if (val.length > 6) {
        return val.substring(0, 6)+" ....";
    } else {
        return val;
    }
}
