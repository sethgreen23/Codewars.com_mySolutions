def score(dice):
  result = 0
  for x in range(1, 7):
    if x == 1:
        if dice.count(x) >= 3:
            result += 1000 
        result += 100 * (dice.count(x) % 3)
    else:
        if dice.count(x) >= 3:
            result += 100 * x
        if x == 5:
            result += 50 * (dice.count(x) % 3)
  return result
