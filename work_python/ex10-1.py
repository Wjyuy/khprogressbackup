#utf-8 :세계표준 문자셋 (ex>ms949,euc-kr,iso 9000번대)
# f=open("new_file.txt","w",encoding="utf-8")
# f=open("new_file2.txt","w",encoding="utf-8")
# f=open("new_file3.txt","w",encoding="utf-8")
f=open("new_file3.txt","a",encoding="utf-8") #a모드 : 기존 파일에 내용을 추가 (add)
names=["손영민","황현준"]

for name in names:
    f.write(name+"\n") # \n : 줄바꿈

# f.write("테스트!~")
print("파일 쓰기 완료!")

f.close()