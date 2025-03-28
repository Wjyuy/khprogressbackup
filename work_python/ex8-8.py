class Person:
    def __init__(self,name):
        self.name=name
    def show_name(self):
        print(self.name)
    def show_age(self):
        print(self.age)
        
class Student(Person): #Person클래스(부모) 상속받는 Student클래스(자식)
    # def __init__(self, name):
    def __init__(self,name,age):
        super().__init__(name) #부모 클래스의 생성자 호출
        self.age=age

# x=Student("홍길동") #오류 : 나이가 없다 
x=Student("홍길동",20)
x.show_name()
x.show_age()