import random
# simple game that flips a coin


def gamble() :
    # This function does the actual coin flipping
    
    coin = (random.randint(0,1))
    bet = input("it's time to flip a coin, heads or tails? \n")
    bet= bet.lower()
    while bet not in ["heads", "tails", "h", "t"]:
        bet = input ("input heads or tails only please \n")
        bet= bet.lower()

    coin_state = "heads"
    if coin == 0:
        coin_state = "tails"
        
    if bet in ["heads", "h"]:
        bet = "heads"
    elif bet in ["tails", "t"]:
        bet = "tails"
        
    if bet == coin_state:
        print ("good choice, you got it!")
    else:
        print ("too bad, it was " + coin_state)

def gamblerun(verification):
    # This function verifies user input and if you want to play again.
    # Accepts 'yes', 'y', 'no', and 'n'
    if verification in ["yes", "y"]:
        gamble()
        verify = input("\nWant to play again?\n")
        verify = verify.lower()
        if verify in ["no", "n"]:
            print ("Thanks for playing!")
        else:
            gamblerun(verify)
        
    elif verification in ["no", "n"]:
        print ("Thanks for playing!")
    else:
        verify = input("A yes or no will suffice\n")
        gamblerun(verify)

# Here is where the program starts 
print("Want to play a game?")
verify = input()
verify = verify.lower()
if verify not in ["no", "n"]:   
    gamblerun(verify)
else:
    print("Too bad, Goodbye")


        
