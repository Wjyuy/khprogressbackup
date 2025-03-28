num1000=int(input("수를 입력하세요 : "))
if num1000>999:
    print("오류! %d 은(는) 범위(0~999)이외의 숫자이다."%num1000)
elif num1000>99:
    print("%d 은(는) 세 자리 숫자이다."%num1000)
elif num1000>9:
    print("%d 은(는) 두 자리 숫자이다."%num1000)
else:
    print("%d 은(는) 한 자리 숫자이다."%num1000)