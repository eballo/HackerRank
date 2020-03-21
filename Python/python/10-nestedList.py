if __name__ == '__main__':
    nested_list = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        nested_list.append([name, score])

    # Get the lowest grade
    size = (len(nested_list))
    scores = set([nested_list[x][1] for x in range(size)])
    #print(scores)
    scores = list(scores)
    scores.sort()
    #print(scores)
    lowest_score = scores[1]

    #print(size)
    students = list([nested_list[x][0] for x in range(size) if nested_list[x][1] == lowest_score])
    students.sort()
    #print(students)

    for result in students:
        print(result)
