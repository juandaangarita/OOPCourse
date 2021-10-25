from car import Car
from account import Account
from uberBlack import UberBlack

if __name__ == "__main__":

    car = Car("AMS234", Account("Andres Herrera","ASND123"))
    print(vars(car))
    print(vars(car.driver))

    uberBlack = UberBlack("PFF591",  Account("Pepe Arroyave","120897uht"), "Chevrolet", "Leather")
    print(vars(uberBlack))
    print(vars(uberBlack.driver))
