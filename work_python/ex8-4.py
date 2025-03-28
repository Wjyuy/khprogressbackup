class Members:
    def __init__(self,name,age):
        # pass #동작없이 다음 실행 (디폴트)
        self.name=name
        self.age=age
    def show_info(self):
        print("이름:",self.name) 
        print("나이:",self.age) 

# member1=Members() #TypeError: Members.__init__() missing 
# 2 required positional arguments: 'name' and 'age'
member1=Members("황선영",18) #객체를 생성하면서 생성자 호출 => 
#def __init(self,name,age): 매개변수 안맞으면 오류
member1.show_info()

member2=Members("최종화",32) 
member2.show_info()
