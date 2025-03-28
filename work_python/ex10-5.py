import os

# if os.path.exists("scores3.txt"): #현재 경로에 파일이 존재하는가
#     os.remove("scores3.txt") #있으면 삭제해라
if os.path.exists("scores2.txt"): 
    os.remove("scores2.txt") 
else:
    print("파일이 존재하지 않습니다!")
    #파일을 1시간에 한번씩 저장되게 하고, 일주일에 한번 지우게끔 만드는 식으로 응용 가능하다