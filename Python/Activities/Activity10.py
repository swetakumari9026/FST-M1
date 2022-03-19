list_of_number = []
num = int(input('enter the size: '))
for i in range(num):
 array_of_number = int(input("enter number: "))
 list_of_number.append(array_of_number)


for item in list_of_number:
    if(item%5==0):
     print("number divisble by 5 is: " , item)
 

