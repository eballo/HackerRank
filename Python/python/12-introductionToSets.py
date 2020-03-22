def average(array):
    # your code goes here
    distinct_heights = set(array)
    #print(distinct_heights)
    size = len(distinct_heights)
    return (sum(distinct_heights)/size)
if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)
