def printBoard(board):
    for x in range(0, 9):
        print()
        if x==3 or x==6:
                print("\n")
        for y in range(0, 9):
            print(board[x][y], end=" ")
            if y==2 or y==5:
                print("\t",end=" ")

def isFull(board):
    for x in range(0, 9):
        for y in range (0, 9):
            if board[x][y] == 0:
                return False
    return True


def possibleEntries(board, i, j):
    possibilityArray = {}
    for x in range (1, 10):
        possibilityArray[x] = 0
        

    #horizontal
    for y in range (0, 9):
        if not board[i][y] == 0: 
            possibilityArray[board[i][y]] = 1
   
    
    
    #vertical
    for x in range (0, 9):
        if not board[x][j] == 0: 
            possibilityArray[board[x][j]] = 1
    

    #3 x 3
    k = 0
    l = 0
    if i >= 0 and i <= 2:
        k = 0
    elif i >= 3 and i <= 5:
        k = 3
    else:
        k = 6
    if j >= 0 and j <= 2:
        l = 0
    elif j >= 3 and j <= 5:
        l = 3
    else:
        l = 6
    for x in range (k, k + 3):
        for y in range (l, l + 3):
            if not board[x][y] == 0:
                possibilityArray[board[x][y]] = 1 
    

    for x in range (1, 10):
        if possibilityArray[x] == 0:
            possibilityArray[x] = x
        else:
            possibilityArray[x] = 0
    

    return possibilityArray

def sudokuSolver(board):
    i = 0
    j = 0
    possiblities = {}
    if isFull(board):
        print("\n\nSudoku resuelto!")
        printBoard(board)
        return
    else:
        #se encuentra el primer espacio
        for x in range (0, 9):
            for y in range (0, 9):
                if board[x][y] == 0:
                    i = x
                    j = y
                    break
            else:
                continue
            break

        possiblities = possibleEntries(board, i, j)

        # se llama la funcion una y otra vez con las diferentes posibilidades
        for x in range (1, 10):
            if not possiblities[x] == 0:
                board[i][j] = possiblities[x]
                
                sudokuSolver(board)
        # si en algun momento ya no hay posiblilidades se corre esta linea         
        # backtrack
        board[i][j] = 0

def main():
    SudokuBoard = [[0 for x in range(9)] for x in range(9)] 
    SudokuBoard[0][0] = 0
    SudokuBoard[0][1] = 0
    SudokuBoard[0][2] = 0
    SudokuBoard[0][3] = 3
    SudokuBoard[0][4] = 0
    SudokuBoard[0][5] = 0
    SudokuBoard[0][6] = 2
    SudokuBoard[0][7] = 0
    SudokuBoard[0][8] = 0
    SudokuBoard[1][0] = 0
    SudokuBoard[1][1] = 0
    SudokuBoard[1][2] = 0
    SudokuBoard[1][3] = 0
    SudokuBoard[1][4] = 0
    SudokuBoard[1][5] = 8
    SudokuBoard[1][6] = 0
    SudokuBoard[1][7] = 0
    SudokuBoard[1][8] = 0
    SudokuBoard[2][0] = 0
    SudokuBoard[2][1] = 7
    SudokuBoard[2][2] = 8
    SudokuBoard[2][3] = 0
    SudokuBoard[2][4] = 6
    SudokuBoard[2][5] = 0
    SudokuBoard[2][6] = 3
    SudokuBoard[2][7] = 4
    SudokuBoard[2][8] = 0
    SudokuBoard[3][0] = 0
    SudokuBoard[3][1] = 4
    SudokuBoard[3][2] = 2
    SudokuBoard[3][3] = 5
    SudokuBoard[3][4] = 1
    SudokuBoard[3][5] = 0
    SudokuBoard[3][6] = 0
    SudokuBoard[3][7] = 0
    SudokuBoard[3][8] = 0
    SudokuBoard[4][0] = 1
    SudokuBoard[4][1] = 0
    SudokuBoard[4][2] = 6
    SudokuBoard[4][3] = 0
    SudokuBoard[4][4] = 0
    SudokuBoard[4][5] = 0
    SudokuBoard[4][6] = 4
    SudokuBoard[4][7] = 0
    SudokuBoard[4][8] = 9
    SudokuBoard[5][0] = 0
    SudokuBoard[5][1] = 0
    SudokuBoard[5][2] = 0
    SudokuBoard[5][3] = 0
    SudokuBoard[5][4] = 8
    SudokuBoard[5][5] = 6
    SudokuBoard[5][6] = 1
    SudokuBoard[5][7] = 5
    SudokuBoard[5][8] = 0
    SudokuBoard[6][0] = 0
    SudokuBoard[6][1] = 3
    SudokuBoard[6][2] = 5
    SudokuBoard[6][3] = 0
    SudokuBoard[6][4] = 9
    SudokuBoard[6][5] = 0
    SudokuBoard[6][6] = 7
    SudokuBoard[6][7] = 6
    SudokuBoard[6][8] = 0
    SudokuBoard[7][0] = 0
    SudokuBoard[7][1] = 0
    SudokuBoard[7][2] = 0
    SudokuBoard[7][3] = 7
    SudokuBoard[7][4] = 0
    SudokuBoard[7][5] = 0
    SudokuBoard[7][6] = 0
    SudokuBoard[7][7] = 0
    SudokuBoard[7][8] = 0
    SudokuBoard[8][0] = 0
    SudokuBoard[8][1] = 0
    SudokuBoard[8][2] = 9
    SudokuBoard[8][3] = 0
    SudokuBoard[8][4] = 0
    SudokuBoard[8][5] = 5
    SudokuBoard[8][6] = 0
    SudokuBoard[8][7] = 0
    SudokuBoard[8][8] = 0
    printBoard(SudokuBoard)
    sudokuSolver(SudokuBoard)