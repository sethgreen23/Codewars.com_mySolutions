def perimeter(n):
    if not n > 1:
        return False
    sum = 2
    f1 = f2 = 1
    for i in range(2, n+1):
        temp = f2
        f2 = f1 + f2
        f1 = temp
        sum += f2
    return 4 * sum
