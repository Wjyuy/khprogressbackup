phone1_list1=["010-3654-2637","010-3984-5377","010-3554-0973"]
print(phone1_list1)

phone1_list2=[]
for number in phone1_list1:
    # print(number)
    x=number.replace("-","")
    phone1_list2.append(x)
print(phone1_list2)