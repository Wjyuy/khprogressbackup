user_id=input("아이디는? ")
if user_id=="admin":
    print("콘텐츠 이용이 가능합니다!")
else:
    user_level=int(input("회원 레벨은?(1~9) "))
    if 1<=user_level<=3:
        print("콘텐츠 이용이 가능합니다!")
    else:
        print("콘텐츠를 이용할 수 없습니다!")
