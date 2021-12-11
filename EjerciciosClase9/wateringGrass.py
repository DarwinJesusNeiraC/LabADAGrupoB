'''
@Autor: Darwin Jesus Neira Carrasco
@Email: dneirac@unsa.edu.pe
@Descripcion:

'''

from  math import sqrt
def wateringGrass():
    n , l , w = map(int,input().split())
    arr = []
    halfcuadratic = (w/2)**2 #area cuadrada de la mitad de la altura 
    for i in range(n):
        p , r = map(int, input().split())
        if (2 * r) > w:
            distance = sqrt(r**2 - halfcuadratic) #distancia de rango de riego
            arr.append((p - distance, p + distance))

    print(arr) # seguimiento
    arr = sorted(arr, reverse= True) # se le asigna dado que  sorted genera un nuevo array
    print(arr) # seguimiento
    cant = 0 # cantidad de riegadores usados
    length = 0 # la longitud de los que se regara ,tiene que ser mayor a l, para que de esta forma sepamos que se rego todo
    i = 0
    print("tamaño ", len(arr))

    while(length < l):
        for i in range(len(arr)):
            if arr[i][0] <= length and arr[i][1] > length:
                length = arr[i][1]
                cant += 1
                break
        if(i == n):
            break

    if(length < l):
        cant = -1

    print(cant)


wateringGrass()
