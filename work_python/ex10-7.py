import csv

file_name="weather.csv"
f=open(file_name,"r",encoding="utf-8")
lines=csv.reader(f) #csv.reader() : csv 파일 전체를 읽어옴

for line in lines:
    print(line)

f.close()