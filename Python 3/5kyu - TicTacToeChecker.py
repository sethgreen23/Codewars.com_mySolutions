def isSolved(board):
    #Variable if board has empty spots
    b = False
    
    #Check HorizontalRows
    for x in board:
        if checkRow(x) == "X":
            return 1
        elif checkRow(x) == "O":
            return 2
        elif checkRow(x) == 0:
            b = True
        
    #Check VerticalRows
    for i in range(len(board)):
        if checkRow([board[0][i],board[1][i],board[2][i]]) == "X":
            return 1
        elif checkRow([board[0][i],board[1][i],board[2][i]]) == "O":
            return 2

    #Diagonal LowerLeft2UpperRight
    if checkRow([board[2][0], board[1][1], board[0][2]]) == "X":
        return 1
    elif checkRow([board[2][0], board[1][1], board[0][2]]) == "O":
        return 2
    
    #Diagonal UpperLeft2LowerRight
    if checkRow([board[0][0], board[1][1], board[2][2]]) == "X":
        return 1
    elif checkRow([board[0][0], board[1][1], board[2][2]]) == "O":
        return 2

    #Dependent of Boolean b: True -> EMPTY | False -> DRAW
    if b == True:
        return -1
    elif b == False:
        return 0
    
def checkRow(arr):
    if arr[0] == arr[1] == arr[2] == 1:
        return "X"
    elif arr[0] == arr[1] == arr[2] == 2:
        return "O"
    elif 0 in arr:
        return 0
