"""
@Alumno: Darwin Jesus Neira Carrasco
@Correo: dneirac@unsa.edu.pe
@Descripcion: Busqueda de un patron en una cadena más grande, tiene un tiempo de O(m*n)

"""
def find_neddle(needle, haystack):
    needle_index = 0
    haystack_index = 0
    found_needle = False

    while(haystack_index < len(haystack)): # O(m*n)
        if(needle[needle_index] == haystack[haystack_index]): # max(3,m) = O(m) 
            found_needle = True
            while(needle_index < len(needle)): #max(m,3)  = O(m)
                if(needle[needle_index] != haystack[haystack_index + needle_index]): # O(2)
                    found_needle = False# O(1)
                break
            needle_index+=1
        else: # O(2)
            needle_index = 0
            haystack_index+=1
    return found_needle


print(find_neddle("fgh", "abcdefghi"))
print(find_neddle("rrr", "abcdefghi"))




