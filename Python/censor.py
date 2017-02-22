def censor(text, word):
    array = text.split()
    print array
    
    for i in range(0, len(array)):
        if (array[i] == word):
            array[i] = "*" * len(word)
    
    return " ".join(array)
            

print censor("this hack is wack hack", "hack")