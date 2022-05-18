global = 100
overrideA = false
overrideB = false
overrideC = false

function function_a(test_a, test_b, test_c)
    print("hello world")
    global = test_a(1000)

    if test_b == nil then
        test_c()
    end
end

local rootLevelLocalVar = true

function function_b() --comment
    local test = 1 --[[multi line

               comment
    --]]
    local rootLevelLocalVar
    rootLevelLocalVar = false
    overrideC = rootLevelLocalVar == false

    local function_a
    function_a = function() overrideA = true end
    function_a()

    return test
end

function_a(function(x) return x end, nil, function() overrideB = true end)

print("global", global == 1000)
print("function_a", function_a ~= nil)
print("overrideA", overrideA)
print("overrideB", overrideB)
print("overrideC", overrideC)