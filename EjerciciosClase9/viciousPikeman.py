''''
@Autor: Darwin Jesus Neira Carrasco
@Email: dneirac@unsa.edu.pe
@Descripcion: un pickman tiene que solver la maxima cantidad de ejercicios en menos o igual tiempo del
que le dan en cada entrega del ejercicio se le agregara una penalizacion
'''
def viciousPikeman():
    #ingreso de datos
    N,T = map(int,input().split())
    A,B,C,t0 = map(int,input().split())

    t = [t0] #estalecemos el primer valro de la lista t
    for i in range(1,N):
        t.append(((A*t[-1]+B) % C) + 1)
    
    # sorted ordnea el arreglo
    # como pikeman escoge el problema que más les convenga, pondremos la cantidad de los tiempos
    t = sorted(t)
    
    exercise = 0 #cantidad de ejercicios hechos
    tp = 0 #tiempo de penalizacion por ejercicio
    p = 0 #tiempo donde almancerameos el tiempo total de penalizacion

    for i in range(len(t)):
        if tp + t[i] <= T:
            tp += t[i]
            p = (p + tp) % 1000000007
            exercise+=1
        else:
            break

    print(exercise," ",p)


viciousPikeman()
