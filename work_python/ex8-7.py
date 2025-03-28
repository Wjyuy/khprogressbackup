class Person:
    def __init__(self,name):
        self.name=name
    def show_name(self):
        print(self.name)
        
class Student(Person): #Person클래스(부모) 상속받는 Student클래스(자식)
    pass

# x=Student() #오류:파라미터 없음
x=Student("홍길동")
x.show_name()