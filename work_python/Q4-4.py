sum=0
i=1

while i<=100 :
    if i%2==1:
        sum+=i
        print("%4d"%sum,end=" ")
    if i%20==0:
        print("")
    i+=1