print("기능 선택\n1. 더하기\n2. 빼기\n3. 곱하기\n4. 나누기\n")

put=input("계산기 기능을 선택하세요(1/2/3/4): ")
num1=int(input("첫 번째 숫자를 입력하세요: "))
num2=int(input("두 번째 숫자를 입력하세요: "))
if put=='1':
    result=num1+num2
    print("%d + %d = %d"%(num1,num2,result))
elif put=='2':
    result=num1-num2
    print("%d - %d = %d"%(num1,num2,result))
elif put=='3':
    result=num1*num2
    print("%d * %d = %d"%(num1,num2,result))
elif put=='4':
    result=num1/num2
    print("%d / %d = %.2f"%(num1,num2,result))
else:
    print("잘못 입력 하셨습니다! ")