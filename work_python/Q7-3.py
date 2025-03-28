def count(eng,sub):
    countnum=0
    for i in range(len(eng)):
        if eng[i]==sub:
            countnum+=1
    return countnum
eng=input("영어 문장을 입력하세요 : ")
sub=input("알파벳 하나를 입력하세요 : ")
print(eng,"에 포함된 ",sub,"의 개수는 ",count(eng,sub),"개 이다")