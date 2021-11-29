class profile():
    def __init__(self, name, age, money):
        self.__name = name
        self.__age = age
        self.money = money

    def get_name(self):
        return self.__name

    def get_age(self):
        return self.__age


class bank(profile):
    def __init__(self, name, age, money, account):
        super().__init__(name, age, money)
        self.__account = account

    def get_money(self):
        return self.money

    def get_account(self):
        return self.__account

    def deposit(self, money):
        self.money += money
        print("Deposit Successful")
        print(f"Young account balance is {self.money}")

    def withdraw(self, money):
        if self.money >= money:
            self.money -= money
            print("Withdraw Successful")
            print(f"Young account balance is {self.money}")
        else:
            print("Withdraw Failed")
            print(f"Young account balance is {self.money}")


andi = bank("Andi", 20, 100000, "123456789")
ali = bank("Ali", 21, 100000, "987654321")

print(andi.get_name())
ali.withdraw(50000)
