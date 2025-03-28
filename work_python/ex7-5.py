# def func(n): #리턴값 없을때 none
def func():
    # x=n+5
    # return x
    global x #글로벌 선언하면 전역변수가 된다
    x=100
    print(x)

# a=func(10)
# print(a)
# b=func(10)
# print(b)
# print(x) #지역변수 x는 함수 내에서만 사용 가능하다
x=200
print(x) 
func()
print(x) 