def average(*args):
    print(args) #(85,96,87) 여러개의 값은 튜플 형태로 출력 된다! 
    num_args=len(args)
    sum=0
    for i in range(num_args):
        sum+=args[i]
    # print(sum)
    avg=sum/num_args
    print("%d과목평균: %.1f"%(num_args,avg))

average(85,96,87)
average(77,93,85,97,72)