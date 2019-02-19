function sortByLength (array) {
    var result = array;
    for(i = 0; i < result.length; i++) {
        var indexOfSmallest = i;
        for(j = i; j < result.length; j++) {
            if(result[j].length < result[indexOfSmallest].length) {
                indexOfSmallest = j;
            }
        }
        var temp = result[i];
        result[i] = result[indexOfSmallest];
        result[indexOfSmallest] = temp;
    }
    return array;
}