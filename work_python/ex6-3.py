member={"name":"황예린","age":22,"email":"yerin@hanmail.net"}
print(member)

score=dict([("국어",80),("영어",90),("수학",100)]) #리스트와 튜플 형태가 딕셔너리가 되었다!
print(score) #리스트,튜플을 사용해서 딕셔너리를 생성
print(score["국어"]) #키를 이용해 값을 가져온다! (key:value)
print(score["영어"]) 
print(score["수학"]) 

score["음악"]=70 #딕셔너리에 없는 키와 value입력 시 추가! 
print(score) 

score["수학"]=77 #있는 키는 값을 변경 
print(score) 