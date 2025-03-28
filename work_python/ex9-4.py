import time

seconds=time.time()
#1739245472.292389
print(seconds) #그리니치 천문대 기준 1970년 1월1일0시0분0초 부터 경과된 시간(ms)

tm=time.gmtime()
print(tm) 

# tm2=time.localtime(1739245472.292389) #숫자 넣으면 그 시간대가 계속 고정됨!
tm2=time.localtime() #이거는 실시간
print("년 :",tm2.tm_year) 
print("월 :",tm2.tm_mon) 
print("일 :",tm2.tm_mday) 
print("시 :",tm2.tm_hour) 
print("분 :",tm2.tm_min) 
print("초 :",tm2.tm_sec) 