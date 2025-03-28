phone=input("하이픈(-)이 포함된 11자리의 휴대폰 번호는? ")
phone2=phone[0:3]+phone[4:8]+phone[9:]
print("- 입력된 휴대폰 번호: ",phone)
# print("- 하이픈 삭제된 휴대폰 번호: ",phone.replace("-",""))
print("- 하이픈 삭제된 휴대폰 번호: ",phone2)