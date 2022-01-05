def pFactors(n):
    from math import sqrt
    pFact, limit, check, num = [], int(sqrt(n)) + 1, 2, n
    if n == 1: return [1]
    for check in range(2, limit):
        while num % check == 0:
            pFact.append(check)
            num /= check
    if num > 1:
        pFact.append(num)
    return pFact

print(pFactors(10000))