# class Triangle:
#     def print(self):
#         self.x=int(input("삼각형 밑변의 길이를 입력하세요 : "))
#         self.y=int(input("높이를 입력하세요 : "))
#         result=(self.x * self.y)/2
#         print("삼각형의 면적 : %.2f " %(result))
# triyangle1=Triangle()
# triyangle1.print()

class Triangle:
    def __init__(self,width,height):
        self.width=width
        self.height=height
    def area(self):
        return (self.width * self.height)/2

w=int(input("밑변:"))
h=int(input("높이:"))
t1=Triangle(w,h)
print("넓이:",t1.area())