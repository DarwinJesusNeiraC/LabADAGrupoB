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
            if (2 * r) > w :
                distance = sqrt(r**2 - halfcuadratic) #distancia de rango de riego
                arr.append((p - distance, p + distance))
            if(estado == 0): # cuando se llegue a 0 aplicacremos el metodo de maximos
                #print(arr) # seguimiento
                #arr = sorted(arr, reverse= True) # se le asigna dado que  sorted genera un nuevo array, ordenado de mayor a menor
                print(maximo(sorted(arr),l,len(arr)))

def maximo (arr,l,size):
    #print(arr) # seguimiento
    cant = 0 # cantidad de riegadores usados
    length = 0 # la longitud de los que se regara ,tiene que ser mayor a l, para que de esta forma sepamos que se rego todo
    i = 0
    #size = len(arr)
    #print("tamaño ", len(arr))
    # se establecio esta forma de conteo  dado que con la anterior se tinia problemas en el tiempo
    while(True): # haremos esto mientras que length sea menor a l
        far = -1
        #for i in range(len(arr)):
        while(i < size and arr[i][0] <= length):
            #if arr[i][0] <= length and arr[i][1] > length: 
            far = max(far, arr[i][1])
            i += 1
        if far == -1:
            #cant = -1
            return -1
        cant += 1 #aumentaremos el valor de cant
        length = far # establecermos el nuevo valor de length
        if(length > l):
            return cant


wateringGrass()
