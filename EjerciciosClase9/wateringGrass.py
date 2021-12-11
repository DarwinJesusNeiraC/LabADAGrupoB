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

    #print(arr) # seguimiento
    arr = sorted(arr, reverse= True) # se le asigna dado que  sorted genera un nuevo array, ordenado de mayor a menor
    #print(arr) # seguimiento
    cant = 0 # cantidad de riegadores usados
    length = 0 # la longitud de los que se regara ,tiene que ser mayor a l, para que de esta forma sepamos que se rego todo
    #print("tamaño ", len(arr))

    while(length < l):# haremos esto mientras que length sea menor a l
        for i in range(len(arr)):
            if arr[i][0] <= length and arr[i][1] > length: 
                length = arr[i][1] # establecermos el nuevo valor de length
                cant += 1 #aumentaremos el valor de cant
                break # pasamos al siguient
        if(i == n): # al terminar el for terminaremos el ciclo while
            break

    if(length < l): # si el valor de length siguie siendo menoor a l despues del proceso anterior
        cant = -1 #esatablcersmo el valor de cant como -1

    print(cant) #imprimiremos el valor de cant


wateringGrass()
