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

    print(arr)
    arr = sorted(arr)
    print(arr)
    cant = 0 # cantidad de riegadores usados
    length = 0 # la longitud de los que se regara ,tiene que ser mayor a l, para que de esta forma sepamos que se rego todo
    while(length < l): # recorremos mientras que length sea menor que l
        for i in range(n): 
            if (arr[i][0] <= length and arr[i][1] > length):
                length = arr[i][1]
                cant += 1 # aumentamos el numero de riegadores
                break
        if(i == n):
            break

    if(length < l):
        print(-1)
    else:
        print(cant)



wateringGrass()
