def str_revers(string):
    index=len(string)
    for i in range(index):
        x=string.replace(" ","-")

    # i=0
    # while index >0:
    #     result=string[i]
    #     if string[i]==" ":
    #         result[i]="-"
    #     index-=1
    #     i+=1
    return x
string=input("문자열을 입력하세요: ")
print(str_revers(string))