with open("new_file3.txt","r",encoding="utf-8") as f: #with -- as f:
    for line in f: #들여쓰기 
        temp = line.replace("\n","")
        print(temp)
print("파일 읽기 완료!")

f.close()