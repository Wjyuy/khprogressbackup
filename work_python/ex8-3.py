class Members:
    def __init__(self):
        pass #동작없이 다음 실행 (디폴트)
    def set_info(self,name):
        self.name=name #self.name :객체의 속성
        # print(name) #얘는 홍지수가 출력되지만

    def show_info(self):
        # print("이름:",name) #메소드가 바뀌니까 name 인식 못한다
        print("이름:",self.name) #self.name 객체까지 해줘야 인식이 된다

member1=Members() #객체생성
member1.set_info("홍지수")
member1.show_info()

member2=Members() #객체생성
member2.set_info("안지영")
member2.show_info()