def count(string):
    if string is "":
        return {}
    charDic = {}
    for i in range(0, len(string)):
        if string[i] not in charDic:
            charDic[string[i]] = 1
        else:
            charDic.update({string[i]: charDic.get(string[i]) + 1})
    return charDic
