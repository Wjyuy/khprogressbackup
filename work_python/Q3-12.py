num=int(input("양의 정수를 입력하세요 : "))
if num%3==0 and num%4==0:
    print("%d은(는) 3의 배수이면서 4의 배수이다."%num)
elif num%3==0:
    print("%d은(는) 3의 배수이다."%num)
elif num%4==0:
    print("%d은(는) 4의 배수이다."%num)
else:
    print("%d은(는) 3의 배수도 4의 배수도 아니다."%num)