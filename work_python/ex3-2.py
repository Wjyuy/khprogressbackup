x= int(input("정수를 입력하세요 : "))

if x%2==0:
    print("짝수이다!")
    # else #오류:SyntaxError: invalid syntax ->else가 들여쓰기 되었음음
else: #shift+tab 하면 들여쓰기 풀어져용
    print("홀수이다!")