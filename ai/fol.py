class Vehicle:
    def __init__(self, name, bike, fuel, tyres, storage, economical):
        self.name = name
        self.bike = bike
        self.fuel = fuel
        self.tyres = tyres
        self.storage = storage
        self.economical = economical

    def check_if_mountain_bike(self,object):
        if(object.bike==True and object.fuel=="good" and object.tyres=="good"):
            print(f"{object.name} is a mountain bike \n")
            return True
        else:
            print(f"{object.name} is not a mountain bike \n")
            return False

    def check_if_best_bike(self,object):
        if(object.check_if_mountain_bike(object)):
            if(object.storage=="good" and object.economical=="yes"):
                print(f"----> {object.name} is the best bike for the trip \n")
            else:
                print(f"{object.name} is not the best bike for the trip \n")

def main():
    re_himalayan = Vehicle('Royal Enfield Himalayan',True, 'good','good','good','yes')
    triumph_tiger = Vehicle('Triumph Tiger', True, 'good','good','bad','no')
    jawa_bike = Vehicle('Jawa Bike', True, 'bad', 'good', 'bad','yes')
    mah_scor = Vehicle('Mahindra Scorpio',False,'good','good','good','no')
    check_list = [re_himalayan, triumph_tiger, jawa_bike, mah_scor]
    for i in check_list:
        i.check_if_best_bike(i)

main()