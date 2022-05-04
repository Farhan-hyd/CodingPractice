#fol genration from statements
def first_order_logic(sentence):
    sentence = sentence.replace("not", "~")
    sentence = sentence.replace("and", "&")
    sentence = sentence.replace("or", "|")
    sentence = sentence.replace("xor", "^")
    sentence = sentence.replace("implies", "->")
    sentence = sentence.replace("iff", "<->")
    sentence = sentence.replace("forall", "A")
    sentence = sentence.replace("exists", "E")
    
    return sentence

print(first_order_logic("not p and q"))
