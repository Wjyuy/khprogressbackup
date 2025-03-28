class Student:
    # pet=[] #클래스 속성(ex> 한 집에 john,sally 같이 살면 펫도 같이 다닌다)
    def __init__(self):
        self.pet=[] #pet:객체 속성(['고양이'], ['이구아나'] 분리)
    def push_pet(self,x):
        self.pet.append(x)

john=Student()
john.push_pet("고양이")
print(john.pet)

sally=Student()
sally.push_pet("이구아나")
# print(sally.pet) #['고양이', '이구아나'] 클래스 속성이므로 공유!
print(sally.pet) #['이구아나'] 객체 속성이므로 공유되지 않음!