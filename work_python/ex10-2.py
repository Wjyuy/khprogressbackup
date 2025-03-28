f=open("new_file3.txt","r",encoding="utf-8")
lines=f.readlines()
#readlines : 전체 내용을 읽어 옴

for line in lines:
    temp = line.replace("\n","")
    print(temp)
print("파일 읽기 완료!")

f.close()