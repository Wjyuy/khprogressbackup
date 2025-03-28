file_names=["file1.py","file2.txt","file3.pptx","file4.doc"]

for file_name in file_names:
    arr=file_name.split(".")
    # print(arr)
    print(file_name," => 파일명:",arr[0],", 확장자:",arr[1])
# i=0
# e=0
# while e<len(file_names):
#     list2 = file_names[i].split(".")
#     e+=1
# print(list2)
# while i<len(list2):
#     list1 = file_names[i].split(".")
#     i+=1