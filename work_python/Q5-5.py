numbers=[7,9,15,18,30,-3,7,12,-16,-12]
sum=0
i=0
count=[]
while i<len(numbers):
    if i%2==1:
        sum+=numbers[i]
        count.append(numbers[i])
    i+=1

print("짝수 번째 요소:",end="")
for i in range(len(count)):
    print(count[i],end=" ")
print("\n합계:", sum)