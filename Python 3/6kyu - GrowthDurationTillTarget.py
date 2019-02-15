def nb_year(p0, percent, aug, p):
    p0 = p0 + p0 * percent/100
    p0 += aug
    if(p0 >= p):
        return 1
    return nb_year(p0, percent, aug, p) + 1
