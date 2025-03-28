def divide(a,b):
    try:
        c=a/b
    except ZeroDivisionError: #분모가 0일때 처리
        print("0 나누기 오류가 발생함!")
    else:
        print(c)
# divide(30,10) #3
divide(30,0) #오류 메세지 출력