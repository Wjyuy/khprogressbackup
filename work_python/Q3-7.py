a1=input("영문 대문자 또는 소문자 하나를 입력하세요 : ")
A=a1.upper()
if A=="A" or A=="E" or A=="I" or A=="O" or A=="U":
    print("%s 은(는) 모음이다."%a1)
else:
    print("%s 은(는) 자음이다."%a1)