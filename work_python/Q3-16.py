num1=int(input("첫 번째 숫자를 입력하세요 : "))
num2=int(input("두 번째 숫자를 입력하세요 : "))
app=input("원하는 연산은?\n+,-,*,/중 하나를 선택하세요 :")
if app=="+":
    result=num1+num2
    print("%d %s %d = %d"%(num1,app,num2,result))
elif app=="-":
    result=num1-num2
    print("%d %s %d = %d"%(num1,app,num2,result))
elif app=="*":
    result=num1*num2
    print("%d %s %d = %d"%(num1,app,num2,result))
elif app=="/":
    result=num1/num2
    print("%d %s %d = %.2f"%(num1,app,num2,result))
else:
    print("선택 오류!")