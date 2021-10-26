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
