var maxSequence = function(arr) {
    var min = 0;
    var ans = 0;
    var sum = 0;
    for (var i = 0; i < arr.length; ++i) {
      sum += arr[i];
      min = Math.min(sum, min);
      ans = Math.max(ans, sum - min);
    }
    return ans;
}
