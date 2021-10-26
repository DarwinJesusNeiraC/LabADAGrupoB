def find_neddle(needle, haystack):
    needle_index = 0
    haystack_index = 0
    found_needle = False

    while(haystack_index < len(haystack)):
        if(needle[needle_index] == haystack[haystack_index]):
            found_needle = True
            while(needle_index < len(needle)):
                if(needle[needle_index] != haystack[haystack_index + needle_index]):
                    found_needle = False
                break
            needle_index+=1
        else:
            needle_index = 0
            haystack_index+=1
    return found_needle


print(find_neddle("fgh", "abcdefghi"))
print(find_neddle("rrr", "abcdefghi"))




