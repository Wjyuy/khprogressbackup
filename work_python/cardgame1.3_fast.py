#파일 안열릴때 꿀팁::
#cardgame.py 우클릭>연결 프로그램>Python한번 실행해서 튕구신 다음
#cardgame.py 더블클릭해서 Python 프롬프트로 실행되면 안 튕깁니다!
#공유폴더라서 연결프로그램을 이용해서 열면 파일을 못 읽어오는 것 같아요ㅠㅅㅠ

#v.1.3업데이트: 닉네임 설정 후 1게임시작2게임설명 숫자 체크 안하고 엔터키 눌러도 적용되게 수정 했습니다!
#(엔터키 누를 시 자동으로 난이도는 노말모드로 설정됩니다)
#카드선택에서 문자 넣으셔도 안튕기게 수정 했습니다! 근데 처음 인풋에는 문자 넣으시면 튕겨용ㅎㅎ,..


import random
import time
import os
num=0
data=[]

# txt파일을 읽어오고 최고점수와 최고점수를 기록한 사람의 이름을 가져오는 함수 
def readfile():
    f=open("scores_Wjy.txt","r",encoding="utf-8")
    # 현재 플레이어의 이름을 입력받음
    playername="guest"   
    playername=input("이름을 입력해 주세요!\n영어,숫자만 사용가능 : ")
    try:
        # if playername!="":
        lines=f.readlines()
        best=0
        best_name=""
        for line in lines:
            data=line.split()
            if int(best)<int(data[1]):
                # 최고점수를 best에 저장 
                best=data[1]
                # 최고점수를 기록한 사람의 이름을  best_name에 저장
                best_name=data[0]
        for line in lines:
            data=line.split()
            f.close()
            if playername==data[0]:
                return [data,best,best_name]
        # 현재 플레이어의 이름,점수,최고점수와 최고점수 이름을 리스트에 담아 리턴
        data=[[playername,0,0],best,best_name]
    except:
        print("잘못된 입력!")
    return data

# txt 파일에 이번 플레이 결과 로그를 남기는 함수
def writefile(data): 
    with open("scores_Wjy.txt",'a') as f:
        # data[0][0]은 현재 플레이어의 이름
        f.write("\n"+data[0][0]+" ")
        # data[0][1]은 현재 플레이어의 승리점수값(You win)
        f.write(str(data[0][1])+" ")
        # data[0][2]은 현재 플레이어의 패배점수값(Com win)
        f.write(str(data[0][2]))

# 최고점수 화면출력 함수
def Playerbestprint(data):
    print("***명예의 전당***")
    # data[2]는 최고점수를 가진 사람의 이름값, data[1]은 최고점수값
    print(data[2],"님이",data[1],"번 승리 기록으로 1등입니다 !!!!")
    print("*****************")

# user와 com을 생성하는 클래스 
class Table:
    # 총 10번의 턴
    turn=10
    # 클래스를 만들면 점수,이름,사용가능한 카드 리스트를 1-10까지 생성
    def __init__(self,name):
        self.score=0
        self.name=name
        self.card=[1,2,3,4,5,6,7,8,9,10]
    # 컴퓨터가 사용 가능한 카드를 리스트로 출력하는 함수
    def print(self):
        print(self.name,"가 사용가능한 카드:",self.card)
    # 유저가 사용하지 않은 카드들을 화면으로 출력해서 이번턴에 사용할 카드를 선택받는 함수
    def userchoice(self):
        # 유저가 선택한 카드를 처음엔 0으로 초기화
        uc=0
        # input을 1-10까지가 아닐때 무한반복
        while uc<=0 or uc>10:
            print("1부터 10까지의 카드 중 무엇을 내겠습니까?")
            print("사용하지 않은 카드\n")
            # 현재 유저의 남은 카드 리스트 길이를 조건으로 받아 카드 수를 출력함(10장 남았으면 10장,
            # 9장 남았으면 9장 출력됨. 리스트의 인덱스를 카드 넘버로 받음)
            if len(self.card)==10:
                print("┌--┐┌--┐┌--┐┌--┐┌--┐\n│%2d││%2d││%2d││%2d││%2d│\n└--┘└--┘└--┘└--┘└--┘\n"%(self.card[0],self.card[1],self.card[2],self.card[3],self.card[4]),end="")
                print("┌--┐┌--┐┌--┐┌--┐┌--┐\n│%2d││%2d││%2d││%2d││%2d│\n└--┘└--┘└--┘└--┘└--┘\n"%(self.card[5],self.card[6],self.card[7],self.card[8],self.card[9]),end="")
            elif len(self.card)==9:
                print("┌--┐┌--┐┌--┐┌--┐┌--┐\n│%2d││%2d││%2d││%2d││%2d│\n└--┘└--┘└--┘└--┘└--┘\n"%(self.card[0],self.card[1],self.card[2],self.card[3],self.card[4]),end="")
                print("┌--┐┌--┐┌--┐┌--┐\n│%2d││%2d││%2d││%2d│\n└--┘└--┘└--┘└--┘\n"%(self.card[5],self.card[6],self.card[7],self.card[8]),end="")
            elif len(self.card)==8:
                print("┌--┐┌--┐┌--┐┌--┐┌--┐\n│%2d││%2d││%2d││%2d││%2d│\n└--┘└--┘└--┘└--┘└--┘\n"%(self.card[0],self.card[1],self.card[2],self.card[3],self.card[4]),end="")
                print("┌--┐┌--┐┌--┐\n│%2d││%2d││%2d│\n└--┘└--┘└--┘\n"%(self.card[5],self.card[6],self.card[7]),end="")
            elif len(self.card)==7:
                print("┌--┐┌--┐┌--┐┌--┐┌--┐\n│%2d││%2d││%2d││%2d││%2d│\n└--┘└--┘└--┘└--┘└--┘\n"%(self.card[0],self.card[1],self.card[2],self.card[3],self.card[4]),end="")
                print("┌--┐┌--┐\n│%2d││%2d│\n└--┘└--┘\n"%(self.card[5],self.card[6]),end="")
            elif len(self.card)==6:
                print("┌--┐┌--┐┌--┐┌--┐┌--┐\n│%2d││%2d││%2d││%2d││%2d│\n└--┘└--┘└--┘└--┘└--┘\n"%(self.card[0],self.card[1],self.card[2],self.card[3],self.card[4]),end="")
                print("┌--┐\n│%2d│\n└--┘\n"%(self.card[5]),end="")
            elif len(self.card)==5:
                print("┌--┐┌--┐┌--┐┌--┐┌--┐\n│%2d││%2d││%2d││%2d││%2d│\n└--┘└--┘└--┘└--┘└--┘\n"%(self.card[0],self.card[1],self.card[2],self.card[3],self.card[4]),end="")
            elif len(self.card)==4:
                print("┌--┐┌--┐┌--┐┌--┐\n│%2d││%2d││%2d││%2d│\n└--┘└--┘└--┘└--┘\n"%(self.card[0],self.card[1],self.card[2],self.card[3]),end="")
            elif len(self.card)==3:
                print("┌--┐┌--┐┌--┐\n│%2d││%2d││%2d│\n└--┘└--┘└--┘\n"%(self.card[0],self.card[1],self.card[2]),end="")
            elif len(self.card)==2:
                print("┌--┐┌--┐\n│%2d││%2d│\n└--┘└--┘\n"%(self.card[0],self.card[1]),end="")
            elif len(self.card)==1:
                print("┌--┐\n│%2d│\n└--┘\n"%(self.card[0]),end="")
            # 카드가 출력되면 input을 받는다
            try:
                uc=int(input("\n***당신의 선택 : "))
                if uc in self.card:
                    self.card.remove(uc)
            except:
                print("잘못된 입력!")
            # 사용가능한 카드 리스트에서 input받은 숫자가 있다면 리스트에서 그 value를 삭제
            # 하고 유저가 선택한 값을 리턴
            return uc
        
    # 컴퓨터가 랜덤한 값을 컴퓨터가 사용가능한 카드리스트에서 랜덤으로 고르는 함수
    def comchoice(self):
        waittime=random.randint(1,3)
        print("컴퓨터가 카드를 고르고 있습니다")
        # 게임같이 보이기위한 딜레이
        # for i in range(0,waittime):
        #     print(".")
        #     time.sleep(1)
        print("컴퓨터가 카드를 정했습니다!")
        time.sleep(1)
        # 컴퓨터가 사용가능한 카드 리스트에서 숫자 하나를 랜덤으로 결정
        cc=random.choice(self.card)
        # 어차피 1-10중 하나이므로 사용가능한 리스트에서 그 숫자를 삭제
        self.card.remove(cc)
        # 컴퓨터가 사용한 카드 값을 리턴
        return cc 
    
    # 유저의 카드와 컴퓨터의 카드를 비교하여 점수를 카운팅하는 함수
    def dual(self,num,cum):
        # 화면을 한번 초기화
        printscreen()
        # 유저가 낸 카드는 앞면, 컴퓨터의 카드는 뒷면으로 출력
        print("You  Com\n┌--┐ ┏┳┳┓\n│%2d│ ┣╋╋┫\n└--┘ ┗┻┻┛\n"%(num),end="")
        # 2초 후 화면을 초기화 한 다움
        time.sleep(1)
        printscreen()
        # 컴퓨터의 카드를 앞면으로 출력한다
        print("You  Com\n┌--┐ ┌--┐\n│%2d│ │%2d│\n└--┘ └--┘\n"%(num,cum),end="")
        # time.sleep(2)

        # 점수 카운팅
        # 유저의 카드 숫자가 높은경우 
        if num>cum:
            print("You Win!")
            # 턴을 1 감소시키고
            Table.turn-=1
            # 유저의 점수를 1증가
            user.score+=1
        # 컴퓨터의 카드 숫자가 높은경우
        if num<cum:
            print("Com Win!")
            # 컴퓨터의 점수를 1증가
            com.score+=1
            Table.turn-=1
        # 카드 숫자가 똑같은경우
        if num==cum:
            print("비겼어요!")
            # 턴만 1 감소
            Table.turn-=1
        print("")
        # 결과를 볼 수 있는 시간을 2초동안 출력함
        for i in range(0,1):
            print("%d초 후 넘어갑니다."%(1-i))
            time.sleep(1)

user=Table("user")
com=Table("com")
data=readfile()

# 화면 위쪽의 카드게임 UI를 출력하는 함수
# 최고점수, 현재 진행중인 게임의 스코어, 남은 턴을 출력
def printscreen():
    os.system('cls')
    print("="*50)
    print("카드 게임")
    # 최고점수 출력하는 함수 호출
    Playerbestprint(data)
    print("현재 스코어 YOU:%d COM:%d"%(user.score,com.score))
    print("남은 턴 : ",Table.turn)
    print("="*50)
    print("")

# 게임 시작 화면을 출력하는 함수
def printstart():
    print("="*20)
    print("")
    print("***카드 게임***")
    print("")
    print("1. 게임 시작")
    print("")
    print("2. 게임 방법")
    print("")
    print("="*20)
    num=input("***선택 : ")
    time.sleep(0.5)
    if num== '':
        num=1
        return num
    # 게임방법 선택 시
    if num=="2":
        os.system('cls')
        print("="*20)
        print("")
        print("***게임 방법***")
        print("")
        print("컴퓨터와 1부터 10까지의 카드를 가지고 10번의 대결을 펼칩니다!")
        print("")
        print("서로 한장의 카드를 선택하여, 더 높은 카드를 낸 쪽이 승리합니다!")
        print("")
        print("한번 사용한 카드는 다시 사용할 수 없습니다!")
        print("")
        print("Normal mode: 컴퓨터가 무슨 카드를 사용하였는지 볼 수 없습니다.")
        print("Easy mode: 컴퓨터가 무슨 카드를 사용하였는지 볼 수 있습니다.")
        print("")
        # 문자 문제는 try: except: 쓰면 해결 가능할 것으로 보임
        print("!!!!!!!!!!!!!!!!!!!!!문자를 쓰시면 튕깁니다!!!!!!!!!!!!!!!!!!!!!")
        print("!!!!!!!!!!!!!!!!!!!너무 빨리 입력해도 튕깁니다!!!!!!!!!!!!!!!!!!")
        print("")
        print("="*20)
        print("")
        os.system("pause")
    # 난이도 선택
    print("")
    print("1. Normal mode: 컴퓨터가 무슨 카드를 사용하였는지 볼 수 없습니다.")
    print("2. Easy mode: 컴퓨터가 무슨 카드를 사용하였는지 볼 수 있습니다.")
    print("")
    num=print("난이도를 선택하세요! (1/2)")
    num=int(input("***선택 : "))
    # 난이도 값 리턴
    return num

#여기서부터 게임시작
# 난이도 값을 num에 저장
num=printstart()
# Table클래스의 turn이 0이 될 때 까지 실행 
while Table.turn!=0:
    printscreen()
    # 처음실행인경우 turn=10이고 len(user.card)=10으로 while문 실행
    # user.userchoice 메소드에서 마지막에 user.card가 
    # 사용가능한 카드 리스트에서 input받은 숫자가 있다면 리스트에서 그 value를 삭제!
    # 제대로된 숫자를 선택했다면(사용하지 않은 카드 리스트의 숫자를 선택한 경우)
    # while문을 탈출할 수 있게 됨

    # 만약 인풋이 1-10이 아니면 리스트의 값이 삭제되지 않음=>turn=10 len(user.card)=10이므로
    # while문이 다시 반복됨!
    while Table.turn==len(user.card):
        # 난이도==2(이지모드를 선택)했을 경우 유저가 선택하기 전 컴퓨터의 카드리스트를 보여줌
        if num==2:
            com.print()
        uc=user.userchoice()
        printscreen()
    # while문 탈출한 경우 컴퓨터가 카드를 선택하는 메소드 호출
    cc=com.comchoice()
    # 두 카드 숫자를 비교하고 점수를 카운트하는 메소드 호출출
    user.dual(uc,cc)
# turn==0이 되어 while문 탈출
printscreen()
# 결과출력
# 유저점수>컴퓨터점수일때 
if user.score>com.score:
    print("\n게임이 종료되었습니다.")
    print("\n당신의 승리입니다!!!")
    # 유저가 승리한 점수와 컴퓨터가 승리한 점수를 data리스트에 저장
    data[0][1]=user.score
    data[0][2]=com.score
    # txt파일에 data리스트 로그를 추가하는 메소드 호출
    writefile(data)
    print("아무 키를 누르면 종료됩니다.")
    os.system("pause")
if user.score<com.score:
    print("\n게임이 종료되었습니다.")
    print("\n당신은 패배하였습니다..")
    data[0][1]=user.score
    data[0][2]=com.score
    writefile(data)
    print("아무 키를 누르면 종료됩니다.")
    os.system("pause")
if user.score==com.score:
    print("\n게임이 종료되었습니다.")
    print("\n비겼습니다!")
    data[0][1]=user.score
    data[0][2]=com.score
    writefile(data)
    print("아무 키를 누르면 종료됩니다.")
    os.system("pause")