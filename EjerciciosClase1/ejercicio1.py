#hacer uso del shell
import functools
x = input("Ingresar la cantidad de numeros: ")
numbers = []
for i in range(int(x)):
    numbers.append(int(input("Ingrese numero: ")))

print("resultado: ", functools.reduce(lambda a,x : a + x, numbers))