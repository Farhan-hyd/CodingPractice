import os

input_file = open("file.txt",'r')

macro_start_flag = 0
macro_name_flag = 0

mdt = dict()
mnt = dict()
ala = dict()

macro_name = ""
mdt_index = 0
mnt_index= 0
ala_index = 0
macro_def = []
macro_args = []
call_count = 0

for line in input_file:
    if(len(line.split())>0): 
        line = line.replace("\n","") 
        if line.split()[0] == 'MACRO': 
           macro_name_flag= 0 
           macro_start_flag =1 
           pass 
        elif line.split()[0] == 'MEND': 
           mdt_index = + mdt_index 
           macro_line = (mdt_index,line) 
           macro_def.append(macro_line) 
           mdt_entry = { 
                macro_name: macro_def 
           } 
           mdt.update(mdt_entry) 
           macro_def = [] 
           macro_args =[] 
           macro_start_flag = 0 
        else: 
           if macro_start_flag !=0: 
                if macro_name_flag ==0: 
                    macro_name = line.split()[0] 
                    mdt_ent = { 
                       macro_name: None 
                    } 
                    mdt.update(mdt_ent) 
                    macro_name_flag =1 
                mdt_index += 1 
                for code in line.split(): 
                   if '&' in code: 
                       if code not in [arg[0] for arg in macro_args]: 
                            arg_sub = '#'+str(len(macro_args)+1) 
                            macro_args.append((code,arg_sub)) 
                       else: 
                            for args in macro_args: 
                                if args[0] == code: 
                                   arg_sub = args[1] 
                       line = line.replace(code,arg_sub) 
                macro_line = (mdt_index,line) 
                macro_def.append(macro_line) 
           else: 
                macro_ala = [] 
                macro_call = line.split()[0] 
                if macro_call in list(mdt.keys()): 
                    call_count += 1 
                    arguments = line.split()[1:] 
                    for arg in arguments: 
                       arg = arg.upper() 
                       if len(arg) < 8: 
                            additional_b = 8 - len(arg) 
                            for b in range(additional_b): 
                                arg += 'b' 
                                macro_ala.append(arg) 
                            ala_entry = { 
                                macro_call + '_' +str(call_count): macro_ala 
                            } 
                            ala.update(ala_entry) 
 
for entry in mdt: 
    mnt_index += 1 
    mnt_entry = { 
        entry : (mnt_index,mdt[entry][0][0]) 
    } 
    mnt.update(mnt_entry) 
 
ala_final = ala.copy() 
for calls in ala: 
    macro_ala = [] 
    macro_call = calls.split('_')[0] 
    given = ala[calls] 
    for line in mdt[macro_call]: 
        if macro_call not in line[1] and 'MEND' not in line[1]: 
           for code in line[1].split(): 
                if '#' in code: 
                    index = int(code.replace('#',''))-1 
macro_ala.append(given[index]) 
next_call = line[1].split()[0] 
call_count +=1 
next_call += '_'+str(call_count) 
ala_entry = { 
    next_call: macro_ala 
} 
ala_final.update(ala_entry) 
print("\nMDT") 
print("Index \t Contents") 
for entry in mdt: 
    for lines in mdt[entry]: 
        print(lines[0],'\t',lines[1]) 
 
print("\nMNT") 
print("Index \t Argument") 
for entry in mnt: 
    print(mnt[entry][0], '\t', entry, '\t\t', mnt[entry][1]) 
 
print("ALA") 
print("Index \t Argument") 
for entry in ala_final: 
    for arg in ala_final[entry]: 
        ala_index += 1 
        print(ala_index,'\t', arg) 
