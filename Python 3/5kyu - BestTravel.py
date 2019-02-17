from itertools import combinations

def choose_best_sum(t, k, ls):
    #t (maximum sum of distances, integer >= 0)
    #k (number of towns to visit, k >= 1) 
    #ls (list of distances, all distances are positive or null integers and this list has at least one element)
    
    bestChoice = 0
    for c in combinations(ls, k):
        if bestChoice < sum(c) <= t:
            bestChoice = sum(c)
    return bestChoice if bestChoice else None
