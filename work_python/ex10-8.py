import json

#파이썬의 딕셔너리를 ->json데이터 형식으로 바꾼다
member={"id":"swhong",
 "name":"홍성우",
 "age":23,
 "history":[
     {"date":"2021-03-15","route":"mobile"},
     {"date":"2020-06-23","route":"pc"}
 ]
}

#dumps: member 딕셔너리를 json 으로 인코딩
#ensure_ascii=False =>아스키 형태로 저장하지 마라!
#indent=4 =4칸 들여쓰기(탭키 들여쓰기)
json_string=json.dumps(member,ensure_ascii=False,indent=4)
print(json_string)

