def josephus(items,k):
    result = []
    index = 0
    for i in range(0, len(items)):
        while len(items) > 0:
            index = (index + k - 1) % len(items)
            result.append(items[index])
            del items[index]
    return result
