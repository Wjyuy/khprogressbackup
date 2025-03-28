car={"brand":"현대","model":"아반떼","start":1990,"year":2021}
print(car)

x=car.pop("start") #pop: key에 해당되는 value 잘라내서 변수에 넣기
print(x)

print(car)

car.clear() #딕셔너리 키,값 전부 삭제 
print(car)