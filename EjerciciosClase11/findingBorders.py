def findBorders():
    string = input()
    s = ""   
    leght = len(string)
    if len(string) % 2 != 0:
        leght -= 1

    for i in range(1, leght): 
        if string[:i] == string[-i:]:
            s += str(i) + " "
    
    print(s)

#print(findBorders("abcababcab"))
#print(findBorders("aaaaaaaaaa"))
findBorders()
        

