def str_revers(string):
    result=""
    index=len(string)

    while index >0:
        result+=string[index-1]
        index-=1
    return result
string=input("문자열을 입력하세요: ")
print(str_revers(string))