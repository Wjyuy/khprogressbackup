# str=input("숫자를 입력하세요 : ")
# count=0
# for i in range(len(str)):
#     if int(str[i])%2==1:
#         count+=1
# print("홀수의 개수 : %d개 "%count)      
str=input("숫자를 입력하세요 : ")
count=0
for i in str:
    i=int(i)
    if i%2==1:
        count+=1
print("홀수의 개수 : %d개 "%count)      