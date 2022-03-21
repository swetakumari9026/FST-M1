def sum(num):
    count =0
    for x in num:
        count = count+x
    return count

numList = [3,9,10,2]

result = sum(numList)

	
print("The sum of all the elements is: " + str(result))
