sum=0

# for i in range(100,201,5):
#     sum += i
#     print(i) 
# print("5의 배수의 합계: %d"%sum) 

for i in range(100,201):
    if i%5 ==0:
        sum += i
print("5의 배수의 합계: %d"%sum) 