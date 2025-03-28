scores=[]

while True:
    score =int(input("성적을 입력하세요(종료:-1):")) #문자와 숫자 비교하면 무한루프

    if score==-1:
        break
    else:
        scores.append(score)
print(scores)
