'''
@Autor: Darwin Jesus Neira Carrasco
@Email: dneirac@unsa.edu.pe
@Descripcion: Mediante le siguiente programa ordena, mostrando la informacion en orden ascendente
'''
import queue

q = queue.PriorityQueue()
x = [[1,4,5],[1,3,4],[2,6]]

#mediante este este for agregamos los datos a la cola de prioridad
for i in range(len(x)):
    for y in range(len(x[i])):
        q.put(x[i][y])

for i in range(q.qsize()):
    print(q.get(), end=", ")

print()
