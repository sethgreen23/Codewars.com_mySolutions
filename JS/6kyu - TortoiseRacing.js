function race(v1, v2, g) {
    //v1 and v1 in feet per second
    var v1_feetPerSecond = v1 / 3600;
    var v2_feetPerSecond = v2 / 3600;
    var v1_distanceTravelled = g;
    var v2_distanceTravelled = 0;
    var secondsPassed = 0;

    if(v1 > v2) {
        return null;
    } else {
        //seconds passed till A and B travelled the same distance
        secondsPassed = Math.floor(g / (v2 - v1) * 3600);
    }
    
    //convert seconds and return [h:m:s]
    var hours = 0;
    var minutes = 0;
    while(secondsPassed >= 60) {
        minutes += 1;
        secondsPassed -= 60;
    }
    while(minutes >= 60) {
        hours += 1;
        minutes -= 60;
    }
    return [hours, minutes, secondsPassed];
