fruits= {
     "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15,
     'mango':50
}
key_to_check = input("What are you looking for? ").lower()


if key_to_check in fruits:
    print('available',key_to_check , fruits[key_to_check])
else:
    print('Not available')   