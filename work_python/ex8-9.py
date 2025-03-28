class Person:
    def __init__(self,name):
        self.name=name
    def show_name(self):
        print(self.name) 

class Student(Person): 
    def show_name(self):
        print("환영합니다!") #부모의 메소드를 자식이 상속받아서 재정의
        print(self.name+"님 반갑습니다") #@@ 메소드 오버 라이딩 @@#

x=Student("홍길동") 
x.show_name() #자식의 메소드를 호출