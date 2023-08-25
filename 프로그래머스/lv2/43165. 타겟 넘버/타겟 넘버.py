def solution(numbers, target):
    answer = 0
    total = 0
    
    def dfs(n,t,n_len):
        n += 1
        nonlocal answer
        if n >= n_len:
            if t == target:
                answer += 1
            else:
                return False
        else:
            # print('t : ',t,n, numbers[n])
            dfs(n,t+numbers[n],n_len)
            dfs(n,t-numbers[n],n_len)
        
    dfs(-1,total,len(numbers))
    
    return answer