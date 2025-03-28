def sum_1(num):
    list1=[]
    for i in range(1,num+1):
        list1.append(i*i)
    return list1

num=int(input("n값을 입력하세요: "))
sumnum=sum_1(num)
print(sumnum)
