'''
@Autor: Darwin Jesus Neira Carrasco
@Email: dneirac@unsa.edu.pe
@Descripcion:
'''
import sys
from  math import sqrt
def wateringGrass():
    estado = 0 # mediante esta variable podresmo identificar si estamos en un numero agragamiento de datos
    for y in sys.stdin:
        if(estado == 0):
            n , l , w = map(int,y.split())# se cambio input por 'y' dado que lo se lee es toda la linea
            arr = []
            estado = n #lo estableceremos como n
            halfcuadratic = (w/2)**2 #area cuadrada de la mitad de la altura 
        else:
            estado -= 1# cada que se lee uno de los datos se disminuira en 1
            p , r = map(int, y.split())# se cambio input por 'y' dado que lo se lee es toda la linea
            if (2 * r) > w:
                distance = sqrt(r**2 - halfcuadratic) #distancia de rango de riego
                arr.append((p - distance, p + distance))
            if(estado == 0):# cuando se llegue a 0 aplicacremos el metodo de maximos
                #print(arr) # seguimiento
                #arr = sorted(arr, reverse= True) # se le asigna dado que  sorted genera un nuevo array, ordenado de mayor a menor
                print(maximo(sorted(arr, reverse= True),l))

def maximo(arr,l):
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

        if(i == len(arr)): # al terminar el for terminaremos el ciclo while
            break

    if(length < l): # si el valor de length siguie siendo menoor a l despues del proceso anterior
        cant = -1 #esatablcersmo el valor de cant como -1

    return cant

wateringGrass()
