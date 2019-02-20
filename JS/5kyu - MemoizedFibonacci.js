var fibonacci = (function(n) {
    var memory = {};
    function f(n) {
        var x;
        if (n === 0 || n == 1) {
            return n;
        } else {
            if (n in memory) {
                x = memory[n];
            } else {
                x = f(n - 1) + f(n - 2);
            }
            memory[n] = x;
        }
        return x;
    }
    return f;
})();
