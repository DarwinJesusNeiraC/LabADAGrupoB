def findBorders(string):
    list = []
    leght = 0
    if len(string) % 2 == 0:
        leght = len(string)
    else:
        leght = len(string)-1

    for i in range(1, leght): 
        if string[:i] == string[-i:]:
            list.append(i)
    
    s = ""   
    for i in list:
        s += str(i) + " "
    return s 

#print(findBorders("abcababcab"))
#print(findBorders("aaaaaaaaaa"))
#print(findBorders("aaaaaaaaaa"))
        

