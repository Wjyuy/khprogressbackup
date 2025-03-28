def kmtomile(km):
    num=km*0.621371
    return num

num=int(input("킬로미터를 입력하세요 : "))

print("%d 킬로미터는 %.2f 마일이다"%(num,kmtomile(num)))