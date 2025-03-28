class Cat:
    #속성이 3개이다
    kor_name="로키" #속성
    eng_name="rocky" 
    age=2 

    #소리 기능 (메소드)
    def sound(self):
        print("야옹~")

    def speed(self):
        print("엄청 빠르다!")

mycat=Cat() #mycat 객체 생성 
print("한글 이름:",mycat.kor_name) #객체의 속성으로 출력
print("영어 이름:",mycat.eng_name) 
print("나이:",mycat.age) 
mycat.sound() #객체의 메소드로 출력
mycat.speed() 