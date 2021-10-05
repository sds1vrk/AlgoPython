from itertools import permutations

a=[2,3,4]

# 숫자 -> str로 변경, permutation은 문자만 가능
map_a=list(map(str,a))
# print(map_a)

# 순열 만들기 (순서 보장)
# 2,3,4 // 23,24,34 // 32, 34, 43  // 234

# join은 리스트를 문자열로 만들어줌

answer=[]
for i in range(1,len(a)+1):
    print("per",list(permutations(map_a,i)))

    k=list(map(''.join,permutations(map_a,i)))
    print(k)
    answer.extend(k)

print("answer",answer)