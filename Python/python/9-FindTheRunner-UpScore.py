if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    sortedSet = sorted(set(arr))
    #print(sortedSet)
    print(sortedSet[-2])
