# cook your dish here

A, B, X, Y = map(int, input().split())

points_Messi = A * 2 + B
points_Ronaldo = X * 2 + Y

if points_Messi > points_Ronaldo:
    print("Messi")
elif points_Messi < points_Ronaldo:
    print("Ronaldo")
else:
    print("Equal")