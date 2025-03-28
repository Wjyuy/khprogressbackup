def add(a,b):
    result=a+b
    print(a,"+",b,"=",result)
    return result
def min(a,b):
    result=a-b
    print(a,"-",b,"=",result)
    return result
def nanu(a,b):
    result=a/b
    print(a,"/",b,"=",result)
    return result
def mux(a,b):
    result=a*b
    print(a,"*",b,"=",result)
    return result

print("- 선택 옵션")
print("1.더하기")
print("2.빼기")
print("3.곱하기")
print("4.나누기")
num=int(input("원하는 연산을 선택하세요(1/2/3/4)"))
num1=int(input("첫 번째 숫자를 입력하세요 : "))
num2=int(input("두 번째 숫자를 입력하세요 : "))
if num==1:
    result=add(num1,num2)
if num==2:
    result=min(num1,num2)
if num==3:
    result=nanu(num1,num2)
if num==4:
    result=mux(num1,num2)