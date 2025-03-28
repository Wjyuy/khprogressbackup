data=[10,20,30,40,50,60,70,80]
print(data)

# x=data.pop() #pop()파라미터 없는 경우 : 마지막 숫자가 잘라서 x에 들어간다 
x=data.pop(2) #pop(2) : 2번 인덱스에 해당하는 애를 잘라서 x에 넣는다
print(x)
print(data)
x=data.pop(3) 
print(x)
print(data)