def is_valid_IP(strng):
    #Split input into list - split at '.'
    list = []
    list = strng.split('.')
    
    #check if list-length is 4
    if len(list) is not 4:
        return False
        
    #check every value in list and return false if false value occurs
    for s in list:
        #not digit
        if not s.isdigit():
            return False
        #check if value is 0
        if int(s) == 0:
            continue
        #check if value is > 255 or < 0 or has leading-zero
        if int(s) > 255 or int(s) < 0 or s.startswith("0"):
            print("Num or leading 0 or not digit")
            return False
    return True
