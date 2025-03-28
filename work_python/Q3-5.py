a=int(input("첫 번째 정수는? "))
b=int(input("두 번째 정수는? "))
c=int(input("세 번째 정수는? "))

# if a>b and a>c:
#     print("%d, %d, %d 중에서 가장 큰 수는 %d 입니다."%(a,b,c,a))
# if b>a and b>c:
#     print("%d, %d, %d 중에서 가장 큰 수는 %d 입니다."%(a,b,c,b))
# if c>a and c>b:
    # print("%d, %d, %d 중에서 가장 큰 수는 %d 입니다."%(a,b,c,c))
if a>b and a>c:
    largest=a
elif b>a and b>c:
    largest=b  
else:
    largest=c
print("%d, %d, %d 중에서 가장 큰 수는 %d 입니다."%(a,b,c,largest))