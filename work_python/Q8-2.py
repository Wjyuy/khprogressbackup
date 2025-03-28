class Sadari:
    def __init__(self,upwidth,downwidth,height):
        self.upwid=upwidth
        self.downwid=downwidth
        self.height=height
    def area(self):
        return (self.upwid+self.downwid)/2*self.height
dw=int(input("사다리꼴 밑변의 길이를 입력하세요 :"))
uw=int(input("윗변의 길이를 입력하세요 :"))
h=int(input("높이를 입력하세요 :"))

s1=Sadari(uw,dw,h)
print("사다리꼴의 면적 : %.2f"%(s1.area())) #메소드니까 뒤에 괄호를 꼭 넣자 