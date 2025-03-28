def func(food): #매개변수를 리스트로 받아서 처리가능
    food.append("딸기")
    food.append("수박")
    # for x in food:
    #     print(x)

# func(["사과","오렌지","바나나"])
fruits=["사과","오렌지","바나나"]
# func(fruits)

print(fruits) #여긴 딸기 없음
func(fruits) #딸기추가
print(fruits) #추가된 딸기 출력 (함수에서 append반영되어서 출력 )