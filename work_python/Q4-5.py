str=input("문장을 입력해 주세요:")
str=str.replace(" ","-")
i=0
j=len(str)-1
while i<=(len(str)-1):
    print(str[j],end="")
    i+=1
    j-=1