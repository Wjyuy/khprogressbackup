import math

print("sin(2): ",math.sin(2))
print("cos(2): ",math.cos(2))
print("tan(2): ",math.tan(2))
print("ceil(12.3): ",math.ceil(12.3)) #올림:13
print("floor(12.3): ",math.floor(12.3))  #내림:12
print("round(12.3): ",round(12.3))  #반올림:12

print(math.fsum([1,2,3,4,5])) #리스트 합계
print(math.fsum([1.7,2,3.5,4,5])) #실수,정수 다 가능
print(math.fsum((10,20,30,40,50))) #튜플 합계

print("log(75.3): ",math.log(75.3)) #log
print("pow(5,2): ",math.pow(5,2)) #5**2(5의 제곱->25)
print("sqrt(25): ",math.sqrt(25)) #루트 -> 5 