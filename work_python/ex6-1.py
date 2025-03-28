animals=("토끼","거북이","사자","여우")
print(animals)

# 오류 발생: TypeError: 'tuple' object does not support item assignment
# animals[2]="호랑이" #튜플에서 값 변경 불가! 오류 발생
# print(animals)

numbers=tuple(range(10))
# print(numbers)
n=tuple(range(10,21))
print(n)

print("n[0]=",n[0])
print("n[2:5]=",n[2:5])
print("n[2:]=",n[2:])
print("n[:5]=",n[:5])
print("n[-2]=",n[-2])
# ::-1 -> 뒤에서부터 역순으로 출력
print("n[::-1]=",n[::-1])
