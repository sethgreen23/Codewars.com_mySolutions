def permutations(string):
    if len(string) <= 1:
        return list(string)    
    res = set([string])
    if len(string) == 2:
        res.add(string[1] + string[0])
    if len(string) > 2:
        for i, c in enumerate(string):
            for s in permutations(string[:i] + string[i + 1:]):
                res.add(c + s)
    return list(res)
