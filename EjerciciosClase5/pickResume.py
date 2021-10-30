"""
@Alumno: Darwin Jesus Neira Carrasco
@Correo: dneirac@unsa.edu.pe
@Descripcion: Reduccion de una cadena a un valor unico, mediante
un proceso de separacion de sus elemetos

tiempo computacional
En cada ejecucion se va reduciendo a la mitad el tamaño del arreglo
por lo tanto esto sigue la estructura de los logarimos en este caso como
lo va diviendo entre 2 seria log base 2 de n debdio a que el while dura hasta que
la longitud de resume sea mayor a 1; O(log2(n))
"""
def pick_resume(resume):
    eliminate = "top"
    
    while(len(resume) > 1):
        if(eliminate == "top"): 
            resume = resume[( int(len(resume)/2 )):( len(resume))]
            eliminate = "bottom"

        elif(eliminate == "bottom"):
            resume = resume[0:( int( len(resume)/2 ))]
            eliminate = "top"

    return resume[0]


print(pick_resume([2,35,25,1,2]))
