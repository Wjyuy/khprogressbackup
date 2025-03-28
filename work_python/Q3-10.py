num1=int(input("필기시험 점수는? "))
num2=int(input("실기시험 점수는? "))
str="불합격"
if num1>=80 and num2>=80:
    str="합격"
print("- 필기시험 점수 : ",num1)
print("- 실기시험 점수 : ",num2)
print("- 판정 : ",str)