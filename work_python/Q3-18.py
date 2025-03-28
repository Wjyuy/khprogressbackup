startnum=int(input("시작 수는? "))
endnum=int(input("끝 수는? "))
num=int(input("정수를 입력하세요 : "))
result="없다"
if startnum<=num<=endnum:
    result="있다"
print("%d은(는) %d~%d 사이에 %s"%(num,startnum,endnum,result))