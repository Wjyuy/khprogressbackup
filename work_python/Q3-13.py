num=input("숫자를 입력하세요 : ")
if int(num)>=100:
    num2=int(num[2])
    if(num2%2==0):
        print("%d은(는) 짝수이다."%num2)
    else:
        print("%d은(는) 홀수이다."%num2)
else:
    print("숫자를 세자리 이상으로 입력하세요.")