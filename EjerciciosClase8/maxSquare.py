def maximalSquare(matrix):
    # recisicimos un arreglo de tipo str lo convertiremos a int
    for x in range(len(matrix)):
        for y in range(len(matrix[x])):
            matrix[x][y] = int(matrix[x][y])

    printMatrix(matrix)

    if len(matrix) == 1 and len(matrix[0]) == 1:
        if matrix[0][0] == 1:
            return 1
        else:
            return 0
    else:
        if len(matrix) == 1 or len(matrix[0]) == 1:
            return maxMatrix(matrix)
        else:
            for x in range(1,len(matrix)):
                for y in range(1,len(matrix[x])):
                    if matrix[x-1][y-1] == matrix[x][y-1] and matrix[x-1][y-1] == matrix[x-1][y]:
                        matrix[x][y] += 1
                    else:
                        continue

            result = maxMatrix(matrix) 
            return result * result

# para el seguimiento del programa
def printMatrix(matrix):
    for x in range(len(matrix)):
        for y in range(len(matrix[x])):
            print(matrix[x][y], end = "\t")
        print()

# maximo en el arreglo
def maxMatrix(matrix):
    max = matrix[0][0]
    for x in range(len(matrix)):
        for y in range(len(matrix[x])):
            if matrix[x][y] > max:
                max = matrix[x][y]
    return max

#matrix = [["1"],["1"],["0"],["0"],["0"],["1"]]
#matrix = [["1","0","0","1","0"]]
#matrix = [["0"]]
#matrix = [["1"]]

#matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
matrix = [["0","1"],["1","0"]]
print("Salida: " , maximalSquare(matrix))
