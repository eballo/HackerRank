if __name__ == '__main__':
    m = int(input())
    m_arr = set(map(int, input().split()))
    n = int(input())
    n_arr = set(map(int, input().split()))

    set1 = (m_arr.difference(n_arr))
    set2 = (n_arr.difference(m_arr))

    result = sorted(set1.union(set2))
    
    for x in result:
        print(x)
