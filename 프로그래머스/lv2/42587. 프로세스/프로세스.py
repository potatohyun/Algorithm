def solution(priorities, location):
    answer = 0
    queue = []
    n = len(priorities)
    i = 0
    while location not in queue:
        check = max(priorities)
        if priorities[i % n] == check:
            queue.append(i % n)
            priorities[i % n] = 0
            answer += 1
        i += 1
            
    return answer