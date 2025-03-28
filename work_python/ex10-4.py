f=open("scores.txt","r",encoding="utf-8")
lines=f.readlines()

for line in lines:
    data=line.split()
    i=0
    sum=0
    
    while i<len(data):
        if i==0:
            print(data[i],end=" : ")
        else:
            sum+=int(data[i])
        i+=1
    avg=sum/(len(data)-1)
    # print(avg)
    print("%.1f점"%avg)

print("파일 읽기 완료!~")
f.close()