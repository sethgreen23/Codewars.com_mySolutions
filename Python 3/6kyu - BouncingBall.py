def bouncingBall(h, bounce, window):
    if bounce > 1 or bounce < 0:
      return -1
    count = 0
    while h > window:
        count += 1
        h *= bounce
        if h > window:
          count += 1
    return count or -1
