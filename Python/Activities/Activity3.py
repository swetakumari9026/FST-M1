from traceback import print_tb


player1 = input("enter your name player 1")
player2 = input("enter your name player 2")
user1_input = input(player1 + "do you want to choose rock, paper or scissors? ").lower()
user2_input = input(player2 + "do you want to choose rock, paper or scissors? ").lower()

if user1_input==user2_input:
  print("this is a tie")
elif user1_input=="rock":
    if user2_input=="scissors":
      print("Rock win ")
    else:
      print("Paper win") 
elif user1_input=="scissors":
    if user2_input =='rock':
      print("Scissor Wins")
    else:
      print('Rock Wins')

elif user1_input=='paper':
    if user2_input=='rock':
        print('Paper win')
    else:
         print("Scissors wins")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")            
