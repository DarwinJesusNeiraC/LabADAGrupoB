word  = input("Ingresa una palabra: ")
space = int(input("Ingresa el espaciado: "))

frame = "*" * ((len(word) + space * 2) + 3)
frame += "\n"
for i in range((2 * space) + 1):
    if(i == space):
        frame += "*"  
        frame += " " * space;  
        frame += word
        frame += " " * space;  
        frame += " *"  
        frame += "\n"
    else:
        frame += "*"
        frame += " " * (len(word) + space * 2)
        frame += " *"
        frame += "\n"

frame += "*" * ((len(word) + space * 2) + 3)
print(frame)
