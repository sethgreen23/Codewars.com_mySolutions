def partlist(arr):
    result = []
    for i in range(1, len(arr)):
        first = ' '.join(arr[0:i])
        sec = ' '.join(arr[i:])
        result.append((first, sec))
    return result
