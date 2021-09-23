def fibonacci_numbers(nums):
    x, y = 0, 1
    for _ in range(nums):
        x, y = y, x+y
        yield x


def square(nums):
    for num in nums:
        yield num**2

print(sum(square(fibonacci_numbers(10))))


def make_multiplier_of(n):
    def multiplier(x):
        return x * n
    return multiplier
nums=make_multiplier_of(10)
print(nums(10))    
