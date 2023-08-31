# from collections import deque

# def solution(scoville, K):
#     answer = 0
#     scoville.sort()
    
#     deq = deque(scoville)
#     food1 = deq.popleft()
#     while food1 <= K:
#         food2 = deq.popleft()
#         new_food = food1+(food2*2)
#         if new_food
#         deq.append(new_food)
#         deque(sorted(deq))
#         answer += 1
    
#     return answer

### 4개 런타임 에러
import heapq

def solution(scoville, K):
    answer = 0
    heap = []
    
    for i in scoville:
        heapq.heappush(heap, i)
        
    while heap[0] < K :
        # food1 = heapq.heappop(heap)
        # food2 = heapq.heappop(heap)
        # new_food = food1+(food2*2)
        # heapq.heappush(heap, new_food)
        # answer += 1
        try:
            heapq.heappush(heap, heapq.heappop(heap) + heapq.heappop(heap) * 2)
        except IndexError:
            return -1
        answer += 1
        
    return answer