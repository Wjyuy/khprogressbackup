month=int(input("월을 숫자로 입력하세요 : "))
if 3<=month<=5:
    print("%d월은 봄입니다."%month)
elif 6<=month<=8:
    print("%d월은 여름입니다."%month)
elif 9<=month<=11:
    print("%d월은 가을입니다."%month)
else:
    print("%d월은 겨울입니다."%month)