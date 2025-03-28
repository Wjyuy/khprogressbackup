name= input("당신의 이름은?")
birth=int(input("당신의 태어난 해는?")) 

age=2025-birth #오류: 문자열과 문자열의 셈 불가
print("%s님의 나이는 %s세 입니다." %(name,age)) #오류: not str 