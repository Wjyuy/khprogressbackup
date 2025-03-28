def sum(args):
    sum=0
    for i in range(len(args)):
        sum+=args[i]
    return sum

tup1=(10,20,30,40,50)
print("튜플의 합계 : ",sum(tup1))
