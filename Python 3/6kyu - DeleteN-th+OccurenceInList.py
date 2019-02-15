def delete_nth(order,max_e):
    for x in order:
        counter = 0
        index = -1
        for y in order:
            index += 1
            if x == y:
                counter += 1
                if counter > max_e:
                    del order[index]
    return order
    
# -------------------------
    
def delete_nth_alternative(order, max_e):
    answer = []
    for x in order:
        if answer.count(x) < max_e: answer.append(x)
    return answer
