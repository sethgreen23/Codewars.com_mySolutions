def format_duration(seconds):
    #case if seconds == 0
    if seconds == 0: return "now"
    
    #initialize variables
    yrs, day, hrs, mns, sec = 0, 0, 0, 0, seconds
    unit, v = [], []
    y, d, h, m, s = " year", " day", " hour"," minute", " second"
    
    #calculate distribution of years, days, ...
    while sec >=  60:
        mns += 1
        sec -=  60       
    while mns >=  60:
        hrs += 1
        mns -=  60   
    while hrs >=  24:
        day += 1
        hrs -=  24;   
    while day >= 365:
        yrs += 1
        day -= 365

    if yrs > 0:
        if yrs > 1:
            y += "s"
        unit.append(y)
        v.append(yrs)

    #edit values and presetstrings
    if day > 0:
        if day > 1:
            d += "s"
        unit.append(d)
        v.append(day)
        
    if hrs > 0:
        if hrs > 1:
            h += "s"
        unit.append(h)
        v.append(hrs)
        
    if mns > 0:
        if mns > 1:
            m += "s"
        unit.append(m)
        v.append(mns)
        
    if sec > 0:
        if sec > 1:
            s += "s"
        unit.append(s)
        v.append(sec)

    #addem together
    i = len(unit) -1
    res = ""
    while i >= 0:
        res = str(v[i]) +unit[i] + res      
        if i == len(unit) -1 and len(unit) > 1:
            res = ' and ' +res
        elif i <= len(unit) -2 and i > 0:
            res = ", " +res       
        i -= 1
    return res
