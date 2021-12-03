def maximalSquare(matrix):
    # recisicimos un arreglo de tipo str lo convertiremos a int
    for x in range(len(matrix)):
        for y in range(len(matrix[x])):
            matrix[x][y] = int(matrix[x][y])

    printMatrix(matrix)


# para el seguimiento del programa
def printMatrix(matrix):
    for x in range(len(matrix)):
        for y in range(len(matrix[x])):
            print(matrix[x][y], end = "\t")
        print()


matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
maximalSquare(matrix)
