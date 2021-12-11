'''
@Autor: Darwin Jesus Neira Carrasco
@Email: dneirac@unsa.edu.pe
@Descripcion:

'''

from  math import sqrt
def wateringGrass():
    n , l , w = map(int,input().split())
    arr = []
    halfcuadratic = (w/2)**2
    for i in range(n):
        p , r = map(int, input().split())
        if (2 * r) > w:
            distance = sqrt(r**2 - halfcuadratic)
            arr.append((p - distance, p + distance))

    print(arr)

wateringGrass()
