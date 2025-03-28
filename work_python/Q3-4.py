num=int(input("주민번호 뒷자리 첫 번째 숫자를 입력해 주세요 : "))
# if num%2==0:
#     print("여성입니다!")
# else:
#     print("남성입니다!")
if num==1 or num==3:
    print("남성입니다!")
if num==2 or num==4:
    print("여성입니다!")
else:
    print("잘못 입력하셨습니다!")   