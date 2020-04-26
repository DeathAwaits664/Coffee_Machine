package machine

import java.util.*

class CoffeeMachine {
    var money = 550
    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var currentState: Actions = Actions.CHOOSINGACTION
    fun handleInput(input: String) {
        when (currentState) {
            Actions.CHOOSINGACTION -> {
                when (input) {
                    "buy" -> {
                        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                        this.currentState = Actions.CHOOSINGCOFFEE
                    }
                    "fill" -> {
                        println("Write how many ml of water do you want to add:")
                        this.currentState = Actions.FILLWATER
                    }
                    "take" -> {
                        println("I gave you $$money")
                        money = 0
                    }
                    "remaining" -> {
                        print("The coffee machine has:\n" +
                                "$water of water\n" +
                                "$milk of milk\n" +
                                "$beans of coffee beans\n" +
                                "$cups of disposable cups\n" +
                                "$money of money\n")
                        print("Write action (buy, fill, take, remaining, exit):")
                    }
                }
            }
            Actions.CHOOSINGCOFFEE -> {
                when (input) {
                    "1" -> {
                        when {
                            water <= 250 -> {
                                println("Sorry, not enough water!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }

                            beans <= 16 -> {
                                println("Sorry, not enough beans!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }
                            cups <= 1 -> {
                                println("Sorry, not enough cups!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }

                            else -> {
                                water -= 250
                                beans -= 16
                                money += 4
                                cups -= 1
                                println("I have enough resources, making you a coffee!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }
                        }
                    }
                    "2" -> {
                        when {
                            water <= 350 -> {
                                println("Sorry, not enough water!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }
                            beans <= 20 -> {
                                println("Sorry, not enough beans!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }
                            cups <= 1 -> {
                                println("Sorry, not enough cups!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }
                            milk <= 75 -> {
                                println("Sorry, not enough milk!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }
                            else -> {
                                water -= 350
                                milk -= 75
                                beans -= 20
                                money += 7
                                cups -= 1
                                println("I have enough resources, making you a coffee!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }
                        }
                    }
                    "3" -> {
                        when {
                            water <= 200 -> {
                                println("Sorry, not enough water!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }
                            beans <= 12 -> {
                                println("Sorry, not enough beans!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }
                            cups <= 1 -> {
                                println("Sorry, not enough cups!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }
                            milk <= 100 -> {
                                println("Sorry, not enough milk!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }
                            else -> {
                                water -= 200
                                milk -= 100
                                beans -= 12
                                money += 6
                                cups -= 1
                                println("I have enough resources, making you a coffee!")
                                this.currentState = Actions.CHOOSINGACTION
                                print("Write action (buy, fill, take, remaining, exit):")
                            }
                        }
                    }
                    "back" -> {
                        this.currentState = Actions.CHOOSINGACTION
                        print("Write action (buy, fill, take, remaining, exit):")
                    }
                    else -> {
                    }
                }
            }
            Actions.FILLWATER -> {
                this.water += input.toInt()
                println("Write how many ml of milk do you want to add:")
                this.currentState = Actions.FILLMILK
            }
            Actions.FILLMILK -> {
                this.milk += input.toInt()
                println("Write how many grams of coffee beans do you want to add:")
                this.currentState = Actions.FILLBEANS
            }
            Actions.FILLBEANS -> {
                this.beans += input.toInt()
                println("Write how many disposable cups of coffee do you want to add:")
                this.currentState = Actions.FILLCUPS
            }
            Actions.FILLCUPS -> {
                this.cups += input.toInt()
                this.currentState = Actions.CHOOSINGACTION
                print("Write action (buy, fill, take, remaining, exit):")
            }


        }


    }

    enum class Actions {
        CHOOSINGACTION,
        CHOOSINGCOFFEE,
        FILLWATER,
        FILLMILK,
        FILLBEANS,
        FILLCUPS

    }
}
fun main() {
    val coffeeMachine = CoffeeMachine()
    val scanner = Scanner(System.`in`)
    print("Write action (buy, fill, take, remaining, exit):")
    do {
        var input = scanner.next()
        coffeeMachine.handleInput(input)
    } while (input != "exit")

}
