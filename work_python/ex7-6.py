def cir_area():
    result=r*r*3.14
    return result
def cir_length():
    result=2*r*3.14
    return result

# r=10
r= int(input("반지름을 입력하세요:"))
area = cir_area()
# area = cir_area(r) # 오류 : 정의에 매개변수가 없다! 위에도 r을 넣어줘야 한다
length=cir_length()
print("원의면적:%.1f,원주의 길이:%.1f"%(area,length))