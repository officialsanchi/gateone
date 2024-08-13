from datetime import datetime, timedelta

print("CHECK YOUR MENSTRUAL CYCLE")

name = input("What is your name :")
age = input ("how old are you : ")


first_day_input = input("Enter the first day of your period (YYYY-MM-DD): ")
first_day = datetime.strptime(first_day_input, "%Y-%m-%d").date()
next_period = first_day + timedelta(days=25)
length_of_flow = first_day + timedelta(days=4 - 1)
safe_period1 = length_of_flow + timedelta(days=3)
ovulation = safe_period1 + timedelta(days=3)
safe_period2 = ovulation + timedelta(days=4)

print("Your next period is expected on: ", next_period)
print("Your bleeding date should be within: ", first_day, " to ", length_of_flow)
print("**************************************************************************")
print("Your safe period for sexual intercourse is within: ", length_of_flow + timedelta(days=1), " to ", safe_period1)
print("######################################################################################################")
print("Your ovulation date is: ", ovulation)
print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||")
print("Your second safe period is within: ", ovulation + timedelta(days=1), " to ", safe_period2)