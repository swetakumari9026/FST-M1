from timeit import repeat


user1 = input("What is your name ")
user2 = input("What is your name ")

while True:
    user1_answer = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
    user2_answer = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
    if user1_answer == user2_answer:
      print("Its a tie")
    elif user1_answer == "scissors":
        if user2_answer == "paper":
          print("Scissors win!")
        else:
          print("Rock Win")
    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print('paper win')
        else:
            print('Scissors win')
    else:
        print('Invalid input! You have not entered rock, paper or scissors, try again.')
        repeat = input("Do you want to play another round? Yes/No: ").lower()   
        if repeat == 'yes':
         continue
        else:
         print("You entered an invalid option. Exiting now.")
        raise SystemExit




