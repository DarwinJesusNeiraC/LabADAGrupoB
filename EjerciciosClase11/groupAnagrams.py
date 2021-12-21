
def groupAnagrams(strs):
    # el metodo sorted ordena y devuelve una cadena,
    # mediante join agrupomos la palabras en una cadena vacia
    return "".join(sorted(strs))


#los resutlados del a ejercuion fueron los mismos
print(groupAnagrams("eat"))
print(groupAnagrams("tea"))
print(groupAnagrams("ate"))


