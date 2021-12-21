
'''
@Autor: Darwin Jesus Neira Carrasco
@Email: dneirac@unsa.edu.pe
@Description: Agrupar aquellas palabras que tengan el mismo anaggrama
'''

def groupAnagrams(strs):
    # el metodo sorted ordena y devuelve una cadena,
    # mediante join agrupomos la palabras en una cadena vacia
    diccionarioWord = {}; # diccionario
    for i in strs:
        sortWord =  "".join(sorted(i))
        if sortWord not in diccionarioWord: # si no estan en el diccionario
            diccionarioWord[sortWord] = [i] #creamos la variable
        else:
            diccionarioWord[sortWord].append(i) # si la existe la variable agegamos elementos

    #lista a devolver
    listadeLista = []
    for i in diccionarioWord.values(): #para cada values en diccionario
        listadeLista.append(i) #lo metemos en la listadeLista

    return listadeLista #retorno de la lista de lista


#CASOS DE PRUEBA
#los resutlados del a ejercuion fueron los mismos
'''
print(groupAnagrams("eat"))
print(groupAnagrams("tea"))
print(groupAnagrams("ate"))
'''
#strs = ["eat","tea","tan","ate","nat","bat"]
strs = [""]
#strs = ["a"]
print(groupAnagrams(strs))


