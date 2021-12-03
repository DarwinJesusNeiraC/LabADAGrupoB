'''
@Autor: Darwin Jesus Neira Carrasco
@Email: dneirac@unsa.edu.pe
@Descripcion: Encontrar el cuadro maximo formado por solo numeros 1.
'''
def maximalSquare(matrix):
    # recisicimos un arreglo de tipo str lo convertiremos a int
    for x in range(len(matrix)):
        for y in range(len(matrix[x])):
            matrix[x][y] = int(matrix[x][y])

    # declaracion de un arraglo bidimencional en python
    # se creo arr, dado que si se modificar matrix, presento un dar error en varios de lso casos de prueba
    w = len(matrix)
    h = len(matrix[0])
    arr = [[0 for x in range(h + 1)] for y in range(w + 1)]

    printMatrix(arr)


    if len(matrix) == 1 and len(matrix[0]) == 1:
        if matrix[0][0] == 1:
            return 1
        else:
            return 0
    else:
        if len(matrix) == 1 or len(matrix[0]) == 1:
            return maxMatrix(matrix)
        else:
            for x in range(1,w + 1):
                for y in range(1,h + 1):
                    if matrix[x-1][y-1] == 1:
                        arr[x][y] = min(arr[x-1][y-1],arr[x][y-1],arr[x-1][y]) + 1
                    print("\n-----------------------------------------\n")
                    printMatrix(arr)

            result = maxMatrix(arr) 
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

# Casos de prueba
#matrix = [["1"],["1"],["0"],["0"],["0"],["1"]]
#matrix = [["1","0","0","1","0"]]
#matrix = [["0"]]
#matrix = [["1"]]
#matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
#matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
matrix = [["0","1"],["1","0"]]
#matrix = [["1","1","1","1","0"],["1","1","1","1","0"],["1","1","1","1","1"],["1","1","1","1","1"],["0","0","1","1","1"]]
print("Salida: " , maximalSquare(matrix))
