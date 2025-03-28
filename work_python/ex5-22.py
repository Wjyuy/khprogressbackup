hello="have a nice day"
print(hello)

list1= hello.split(" ")
print(list1)
print(type(list1),list1) #<class 'list'> 리스트 타입이다!

for i in range(0,len(list1)):
    print("list1[%d] : %s"%(i,list1[i])) #리스트 길이만큼 리스트 원소의 값 출력