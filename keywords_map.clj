(ns keywords-map)

(def lookup-maps
  [{:kw "__consuming"
    :def "An internal attribute used for parameters that consume their argument. This is part of Swift's ownership model for optimizing memory."
    :use "Primarily for internal compiler and standard library use; not typically used directly by application developers."}
   {:kw "__owned"
    :def "An internal attribute similar to `__consuming`, indicating that a parameter takes ownership of its argument."
    :use "Internal compiler and standard library use; rarely, if ever, used directly in application code."}
   {:kw "__setter_access"
    :def "An internal attribute related to controlling access to a setter."
    :use "Internal compiler use, especially in synthesized code or for specific access control mechanisms."}
   {:kw "__shared"
    :def "An internal attribute indicating that a parameter shares ownership of its argument, implying a non-consuming borrow."
    :use "Internal compiler and standard library use; not typically used by application developers."}
   {:kw "_backDeploy"
    :def "An attribute to mark a function or type as back-deployable, allowing it to be used on older OS versions than the one it was compiled with."
    :use "Apply to declarations (`@_backDeploy(before: OSVersion)`) when you want to make new API available on older OS versions by compiling a separate, older version of the code into your binary."}
   {:kw "_borrow"
    :def "An internal attribute related to borrowing values, often used in conjunction with move-only types or strict concurrency."
    :use "Primarily internal to the compiler and standard library for managing value lifetimes and ownership. Not for general use."}
   {:kw "_borrowing"
    :def "An internal attribute that signifies a parameter or binding is borrowing a value. It's related to Swift's ownership features, ensuring values are not implicitly copied."
    :use "Internal compiler use, especially with explicit ownership management and strict concurrency features. Not typically used directly."}
   {:kw "_BridgeObject"
    :def "An internal type used for bridging between Swift and Objective-C objects when specific ownership or reference counting semantics are required."
    :use "Internal Swift runtime; not intended for direct use."}
   {:kw "_Class"
    :def "An internal attribute or type used to represent a class type at the SIL (Swift Intermediate Language) level."
    :use "Internal compiler use; not directly exposed to Swift developers."}
   {:kw "_compilerInitialized"
    :def "An internal attribute for properties that are guaranteed to be initialized by the compiler."
    :use "Internal compiler use for specific optimizations and guarantees."}
   {:kw "_const"
    :def "An experimental attribute indicating that a function or property is 'constant' or 'pure', meaning it produces the same output for the same input and has no side effects."
    :use "Experimental feature; may be used on functions or properties where referential transparency is desired for compiler optimizations."}
   {:kw "_consuming"
    :def "An internal attribute indicating that a parameter consumes its argument, transferring ownership. This is a lower-level ownership control than the `consuming` keyword."
    :use "Internal compiler use for fine-grained ownership management."}
   {:kw "_documentation"
    :def "An attribute used internally by the Swift compiler for documentation generation purposes."
    :use "Internal compiler use; not directly exposed for user-level documentation."}
   {:kw "_dynamicReplacement"
    :def "An attribute used for providing an alternative implementation of a function, often for testing or patching purposes at runtime."
    :use "Advanced scenarios like testing or hot-patching; generally not for typical application development. Used with `@_dynamicReplacement(for: originalFunction())`."}
   {:kw "__effects"
    :def "An internal attribute used to describe the side effects of a function for optimization and concurrency analysis."
    :use "Internal compiler use."}
   {:kw "_forward"
    :def "An attribute or concept related to forwarding calls or properties, often in the context of `_dynamicReplacement` or other advanced dispatch mechanisms."
    :use "Internal compiler use for specialized dispatch and runtime behavior."}
   {:kw "_implements"
    :def "An attribute used on a function to explicitly state that it implements a requirement from a protocol or an inherited method, often for ABI stability or specific dispatching."
    :use "Advanced scenarios, typically for library authors or when dealing with ABI compatibility, e.g., `@_implements(Protocol.method)`."}
   {:kw "_linear"
    :def "An experimental attribute related to linear types, ensuring a value is used exactly once. Part of Swift's ongoing ownership evolution."
    :use "Experimental feature; not part of stable Swift. For advanced research and specific memory management patterns."}
   {:kw "_local"
    :def "An internal attribute used to mark a declaration as local to a certain scope or compilation unit for optimization purposes."
    :use "Internal compiler use; not a keyword for general programming."}
   {:kw "_modify"
    :def "An internal accessor that provides in-place mutation of a value, used in contexts like computed properties with `_read` and `_modify` accessors."
    :use "Internal to how Swift implements certain mutable access patterns; not directly written by developers as an accessor keyword. You'd typically use `get` and `set` or `didSet`/`willSet`."}
   {:kw "_move"
    :def "An experimental keyword or attribute for explicitly moving a value, transferring ownership without copying. Part of Swift's ownership manifesto."
    :use "Experimental feature; not part of stable Swift. For explicit ownership transfer with move-only types."}
   {:kw "_mutating"
    :def "An internal modifier that signifies a method modifies the instance it's called on. This is the underlying mechanism for the `mutating` keyword."
    :use "Internal compiler use; developers use the `mutating` keyword directly."}
   {:kw "_NativeClass"
    :def "An internal type or attribute related to Objective-C interoperability, specifically for types that are pure Swift classes but have Objective-C runtime characteristics."
    :use "Internal Swift runtime and Objective-C bridging; not for direct use."}
   {:kw "_NativeRefCountedObject"
    :def "An internal type or attribute for objects that are reference-counted directly by the Swift runtime, typically for internal data structures."
    :use "Internal Swift runtime; not for direct use."}
   {:kw "_noMetadata"
    :def "An internal attribute for types that do not require runtime metadata, often for performance optimizations."
    :use "Internal compiler optimization; not for general use."}
   {:kw "_opaqueReturnTypeOf"
    :def "An internal function or attribute used to represent the opaque return type of an `some Protocol` declaration at a lower level."
    :use "Internal compiler use for `some` opaque types; not for direct invocation."}
   {:kw "_originallyDefinedIn"
    :def "An attribute used by the compiler to track where a declaration was originally defined, which is important for module stability and ABI."
    :use "Internal compiler use, especially for library evolution. Not something you'd typically write."}
   {:kw "_PackageDescription"
    :def "A module or internal identifier related to the Swift Package Manager's manifest file."
    :use "Internal to SwiftPM; you import `PackageDescription` in `Package.swift`."}
   {:kw "_read"
    :def "An internal accessor for computed properties that provides direct read access to a stored value or computes one. Used in conjunction with `_modify` for optimized access."
    :use "Internal to how Swift implements optimized property access; not directly written by developers as an accessor keyword. You'd typically use `get`."}
   {:kw "_RefCountedObject"
    :def "An internal type or attribute for generic reference-counted objects within the Swift runtime."
    :use "Internal Swift runtime; not for direct use."}
   {:kw "specialized"
    :def "An attribute for internal compiler use, indicating that a function or type has been specialized for particular generic arguments to improve performance."
    :use "Internal compiler optimization. Not directly used by developers."}
   {:kw "_specialize"
    :def "An attribute that suggests to the compiler to generate specialized versions of a generic function or type for specific types, potentially improving performance."
    :use "Advanced optimization, used on generic declarations, e.g., `@_specialize(where T == Int)`."}
   {:kw "_spi_available"
    :def "An attribute that marks an API as available only for specific 'System Programming Interface' (SPI) clients, meaning it's not public API but can be used by certain modules."
    :use "Used by framework developers to expose APIs to other internal frameworks or specific system components without making them generally public. Example: `@_spi_available(MyInternalModule, introduced: 1.0)`."}
   {:kw "_Trivial"
    :def "An internal attribute for types that are 'trivial' in terms of memory management (e.g., no reference counting needed), allowing for certain optimizations."
    :use "Internal compiler use; not for direct use."}
   {:kw "_TrivialAtMost"
    :def "An internal attribute used to specify the maximum size for a type to be considered trivial for optimization purposes."
    :use "Internal compiler use; not for direct use."}
   {:kw "_TrivialStride"
    :def "An internal attribute related to the memory stride of trivial types."
    :use "Internal compiler use; not for direct use."}
   {:kw "_underlyingVersion"
    :def "An internal attribute used to track the underlying version of an API, often in the context of ABI stability and back deployment."
    :use "Internal compiler use for library evolution; not directly used by developers."}
   {:kw "_UnknownLayout"
    :def "An internal attribute for types whose memory layout is not known at compile time, typically for opaque types or when interacting with C types."
    :use "Internal compiler use; not for direct use."}
   {:kw "_version"
    :def "An internal attribute used to mark the version of a declaration, often for ABI compatibility or deprecation tracking."
    :use "Internal compiler use for library evolution; not directly used by developers."}
   {:kw "abi"
    :def "Refers to Application Binary Interface. Not a keyword itself, but a concept frequently discussed in the context of Swift's long-term stability goals, especially with library evolution."
    :use "Used in discussions and documentation about Swift's binary compatibility guarantees across different versions."}
   {:kw "accesses"
    :def "A compiler-internal concept related to how a property or function accesses memory, used for optimization and strict concurrency checking."
    :use "Primarily internal to the compiler's analysis; not a keyword you'd write directly."}
   {:kw "actor"
    :def "A keyword used to define an actor, a reference type that ensures mutable state is accessed in a mutually exclusive way, simplifying concurrent programming."
    :use "Declare an actor using `actor MyActor { ... }` to protect mutable state in concurrent environments."}
   {:kw "addressWithNativeOwner"
    :def "An internal function or concept related to obtaining the memory address of a value, along with its native owner for memory management."
    :use "Internal compiler use, especially when dealing with low-level memory access or interoperability with C/C++."}
   {:kw "addressWithOwner"
    :def "An internal function or concept related to obtaining the memory address of a value, along with its owner for memory management."
    :use "Internal compiler use, especially when dealing with low-level memory access or interoperability."}
   {:kw "any"
    :def "A keyword used to represent an existential type, meaning 'some type that conforms to this protocol(s)'. It allows for type erasure."
    :use "Used as `any ProtocolName` (e.g., `func process(_ item: any Equatable)`) to indicate that a value is of some type that conforms to the specified protocol, rather than a concrete type."}
   {:kw "Any"
    :def "A type alias for `any Protocol<...>` representing an instance of any type, including class, struct, enum, or other Swift types."
    :use "Used when you need to refer to an instance of *any* type, such as `func acceptsAny(_ value: Any)`. Consider using `any Protocol` for more specific type erasure if possible."}
   {:kw "as"
    :def "A keyword used for type casting, to check the type of an instance or to downcast it to a more specific type."
    :use "Used for conditional casting (`if let someView = view as? UIView`) or forced casting (`let myInt = someValue as! Int`). Also used with `as!` for forced downcasting and `as Any` for upcasting to the `Any` type."}
   {:kw "assignment"
    :def "Refers to the act of giving a value to a variable or constant. It's not a keyword itself but a fundamental operation."
    :use "Used in general programming terminology: `let x = 10` is an assignment."}
   {:kw "associatedtype"
    :def "A keyword used within a protocol definition to declare a placeholder name for a type that is used as part of the protocol."
    :use "Define a type requirement within a protocol: `protocol Container { associatedtype Item }`."}
   {:kw "associativity"
    :def "A keyword used in `precedencegroup` declarations to define how operators with the same precedence are grouped (left, right, or none)."
    :use "Specify operator associativity in custom precedence groups: `associativity left`."}
   {:kw "async"
    :def "A keyword used to mark a function or closure as asynchronous, meaning it can perform work without blocking the current thread and can use `await`."
    :use "Declare asynchronous functions: `func fetchData() async -> Data { ... }`. Also used with `async let` for concurrent binding."}
   {:kw "attached"
    :def "An attribute used with macros, indicating that a macro is 'attached' to a declaration and expands to additional declarations alongside it."
    :use "Used in macro definitions, e.g., `@attached(peer)`. Not used in general Swift code."}
   {:kw "autoclosure"
    :def "An attribute used on a parameter in a function declaration to automatically wrap an expression into a closure, deferring its evaluation."
    :use "Apply to function parameters: `func logIfTrue(_ condition: @autoclosure () -> Bool)`. This allows you to pass an expression directly instead of a closure literal."}
   {:kw "availability"
    :def "An attribute used to specify the platforms and versions on which a declaration is available, deprecated, or obsoleted."
    :use "Apply to declarations: `@available(iOS 13.0, macOS 10.15, *)`."}
   {:kw "available"
    :def "A keyword used within conditional compilation blocks to check the availability of APIs based on platform and version."
    :use "Used in `#if available(...)` blocks to conditionally compile code based on API availability."}
   {:kw "await"
    :def "A keyword used within an `async` function to pause execution until an asynchronous operation completes, allowing other code to run."
    :use "Call an `async` function: `let data = await fetchData()`."}
   {:kw "backDeployed"
    :def "An attribute used to mark a function or type as back-deployable, allowing it to be used on older OS versions than the one it was compiled with."
    :use "Similar to `_backDeploy`, used as `@backDeployed(before: OSVersion)`."}
   {:kw "before"
    :def "Used within attributes like `@available` or `backDeployed` to specify a version prior to which the declaration has a certain status (e.g., unavailable, back-deployed)."
    :use "Example: `@available(iOS, unavailable, introduced: 14.0, message: 'Use new API')` or `@backDeployed(before: iOS 15.0)`."}
   {:kw "block"
    :def "Refers to a block of code, often enclosed in curly braces `{}`. Not a keyword, but a fundamental concept."
    :use "Any group of statements, such as the body of a function, loop, or conditional statement."}
   {:kw "borrow"
    :def "A keyword (or attribute in some contexts) used to explicitly borrow a value, which is part of Swift's strict concurrency and ownership features. It allows temporary, shared access without transferring ownership."
    :use "Used with variable bindings for temporary, non-consuming access to a value. E.g., `let x = borrow y` (experimental feature)."}
   {:kw "borrowing"
    :def "A contextual keyword that marks a function parameter as borrowing its argument, ensuring the argument's lifetime is managed by the caller and not consumed by the function."
    :use "Used in function signatures for parameters that are implicitly borrowed: `func process(_ item: borrowing MyStruct)`. Particularly relevant for move-only types."}
   {:kw "break"
    :def "A control transfer statement that immediately terminates the execution of a loop (`for`, `while`, `repeat-while`) or a `switch` statement."
    :use "Exit a loop or `switch` statement prematurely: `break`."}
   {:kw "canImport"
    :def "A conditional compilation directive that checks if a module can be imported."
    :use "Used in `#if canImport(ModuleName)` to conditionally compile code based on the availability of a module."}
   {:kw ""
    :def "An empty keyword, likely a placeholder or an error in the input."
    :use "N/A - This is not a valid Swift keyword."}
   {:kw "catch"
    :def "A keyword used in `do-catch` statements to handle errors thrown by functions or methods."
    :use "Handle errors: `do { try someThrowingFunction() } catch { ... }`."}
   {:kw "class"
    :def "A keyword used to define a class, a reference type that supports inheritance and polymorphism."
    :use "Declare a class: `class MyClass { ... }`."}
   {:kw "compiler"
    :def "Refers to the Swift compiler. Not a keyword, but a term used in directives or attributes related to compiler behavior."
    :use "Used in conditional compilation directives like `#if compiler(>=5.0)` or in attributes like `@_compilerInitialized`."}
   {:kw "consume"
    :def "A keyword used to explicitly consume a value, transferring its ownership. This marks the end of a value's lifetime from the perspective of the current scope."
    :use "Used with variable bindings to explicitly consume a value, making it unavailable for further use after the `consume` call. E.g., `let x = consume y` (experimental feature)."}
   {:kw "copy"
    :def "A keyword used in property wrappers or accessors to specify that a copy of the wrapped value should be made when accessed."
    :use "Used in property wrappers for copy-on-read semantics: `@propertyWrapper struct MyWrapper { @copy var wrappedValue: Int }`."}
   {:kw "consuming"
    :def "A contextual keyword that marks a function parameter as consuming its argument, indicating that the function takes ownership of the value and is responsible for its lifetime."
    :use "Used in function signatures for parameters that consume their arguments: `func process(_ item: consuming MyStruct)`. Particularly relevant for move-only types to ensure proper resource management."}
   {:kw "continue"
    :def "A control transfer statement that immediately ends the current iteration of a loop (`for`, `while`, `repeat-while`) and begins the next iteration."
    :use "Skip to the next iteration of a loop: `continue`."}
   {:kw "convenience"
    :def "A modifier used with initializers within a class to denote an initializer that calls another initializer from the same class, ultimately delegating to a designated initializer."
    :use "Declare a convenience initializer: `convenience init(...) { self.init(...) }`."}
   {:kw "convention"
    :def "An attribute used with function types to specify the calling convention (e.g., Swift, C, block, thin)."
    :use "Specify calling convention for function pointers or closures: `var myFunc: @convention(c) (Int) -> Void`."}
   {:kw "default"
    :def "A keyword used in `switch` statements to provide a fallback case for any values not matched by other `case` statements."
    :use "Provide a default case in a `switch`: `default: // handle all other cases`."}
   {:kw "defer"
    :def "A keyword used to execute a block of code just before the current scope exits, regardless of how the exit occurs (e.g., return, throw, fall through)."
    :use "Ensure cleanup code runs: `defer { cleanUpResources() }`."}
   {:kw "deinit"
    :def "A keyword used to define a deinitializer, which is called automatically just before a class instance is deallocated."
    :use "Implement cleanup logic for class instances: `deinit { // perform cleanup }`."}
   {:kw "dependsOn"
    :def "An internal attribute used to declare dependencies between declarations, especially for compiler optimizations or module loading."
    :use "Internal compiler use; not a keyword for general use."}
   {:kw "deprecated"
    :def "Used within the `@available` attribute to mark a declaration as deprecated, indicating it should no longer be used and will be removed in future versions."
    :use "Mark an API as deprecated: `@available(*, deprecated, message: 'Use newAPI instead')`."}
   {:kw "derivative"
    :def "An attribute related to automatic differentiation, marking a function as having a derivative or defining its derivative."
    :use "Used in machine learning contexts with Swift for TensorFlow: `@derivative(of: f)`."}
   {:kw "didSet"
    :def "A property observer that is called immediately after a property's value has been set."
    :use "Execute code after a property's value changes: `var myProperty: Int { didSet { print(\"Value changed\") } }`."}
   {:kw "differentiable"
    :def "An attribute used to mark a function or type as differentiable, meaning its derivatives can be computed automatically."
    :use "Used in machine learning contexts with Swift for TensorFlow: `@differentiable`."}
   {:kw "distributed"
    :def "A keyword used to declare a distributed actor or distributed function, enabling communication between actors across different processes or machines."
    :use "Define distributed actors: `distributed actor MyDistributedActor { ... }`."}
   {:kw "do"
    :def "A keyword used in `do-catch` statements to define a block of code that can throw errors."
    :use "Mark a throwing context: `do { try someThrowingFunction() }`."}
   {:kw "dynamic"
    :def "A modifier that indicates a member (property, method, subscript) will be dispatched using Objective-C runtime dynamism, allowing for features like KVO and method swizzling."
    :use "Apply to class members that need Objective-C runtime behavior: `dynamic var myProperty: String`."}
   {:kw "each"
    :def "A keyword used in variadic generic programming to indicate a parameter pack or type pack that expands into multiple arguments or types."
    :use "Used in generic contexts for type or value parameter packs: `func printAll<each T>(_ items: repeat each T) {}` (experimental feature)."}
   {:kw "else"
    :def "A keyword used with `if` statements to define a block of code that executes when the `if` condition is false."
    :use "Provide an alternative execution path: `if condition { ... } else { ... }`."}
   {:kw "enum"
    :def "A keyword used to define an enumeration, a value type that defines a common type for a group of related values."
    :use "Declare an enumeration: `enum Direction { case north, south }`."}
   {:kw "escaping"
    :def "An attribute used on a closure parameter to indicate that the closure may outlive the function it's passed into, requiring explicit memory management."
    :use "Apply to closure parameters: `func takesEscaping(_ closure: @escaping () -> Void)`."}
   {:kw "exported"
    :def "An attribute used to mark a declaration as exported from a module, making it visible to other modules, often for specific linking or runtime purposes."
    :use "Used in advanced module-level configuration, often implicitly handled by access control."}
   {:kw "extension"
    :def "A keyword used to add new functionality to an existing class, structure, enumeration, or protocol type."
    :use "Extend existing types: `extension String { func capitalize() -> String { ... } }`."}
   {:kw "fallthrough"
    :def "A control transfer statement used within a `switch` case to allow execution to continue into the next `case` block."
    :use "Allow execution to flow to the next case in a `switch` statement: `case 1: print(\"One\"); fallthrough`."}
   {:kw "false"
    :def "A keyword representing the boolean literal value `false`."
    :use "Used for boolean expressions and assignments: `let isEnabled = false`."}
   {:kw "file"
    :def "Refers to the current source file. Used in access control (`fileprivate`) or for compiler diagnostics."
    :use "In access control: `fileprivate var myVar: Int`."}
   {:kw "fileprivate"
    :def "An access control level that restricts the use of an entity to its defining source file."
    :use "Apply to declarations to limit visibility: `fileprivate func helperFunction() { ... }`."}
   {:kw "final"
    :def "A modifier that prevents a class from being subclassed or an overridden member (method, property, subscript) from being overridden again."
    :use "Prevent inheritance or overriding: `final class MyClass { ... }` or `final func myMethod() { ... }`."}
   {:kw "for"
    :def "A keyword used to create a loop that iterates over a sequence (e.g., array, range)."
    :use "Iterate over collections: `for item in collection { ... }`."}
   {:kw "discard"
    :def "A keyword used to explicitly discard a value, often in combination with `_` to ignore a return value or an argument."
    :use "Explicitly ignore a return value or binding: `_ = someFunctionThatReturnsAValue()` or `let _ = someOptional`."}
   {:kw "forward"
    :def "A concept related to forwarding calls or references. Not a keyword itself but can appear in internal attributes or discussions of dispatch."
    :use "Internal to compiler mechanisms, e.g., how `_dynamicReplacement` works."}
   {:kw "func"
    :def "A keyword used to declare a function, which is a named, self-contained block of code that performs a specific task."
    :use "Define functions: `func sayHello() { print(\"Hello\") }`."}
   {:kw "freestanding"
    :def "An attribute used with macros, indicating that a macro can be called independently without being attached to a specific declaration."
    :use "Used in macro definitions, e.g., `@freestanding(expression)`. Not used in general Swift code."}
   {:kw "get"
    :def "An accessor used within a computed property, subscript, or getter-only property to define the code that retrieves the property's value."
    :use "Define a getter: `var myProperty: Int { get { return 10 } }`."}
   {:kw "guard"
    :def "A statement that requires a condition to be true in order to continue execution. If the condition is false, the `else` block is executed, which must exit the current scope."
    :use "Early exit for conditions: `guard let value = optional else { return }`."}
   {:kw "higherThan"
    :def "Used in `precedencegroup` declarations to specify that the current precedence group has higher precedence than another specified group."
    :use "Define operator precedence: `precedencegroup MyPrecedenceGroup { higherThan: OtherPrecedenceGroup }`."}
   {:kw "if"
    :def "A control flow statement that executes a block of code only if a specified condition is true."
    :use "Conditional execution: `if condition { ... }`."}
   {:kw "import"
    :def "A keyword used to make the declarations from an external module available in the current source file."
    :use "Bring external modules into scope: `import Foundation`."}
   {:kw "in"
    :def "A keyword with multiple uses: 1. To separate parameters from the body of a closure expression. 2. To define the sequence to iterate over in a `for-in` loop. 3. In `case let` or `for case let` patterns."
    :use "Closure expressions: `{ (param) in print(param) }`. For-in loops: `for item in collection`."}
   {:kw "indirect"
    :def "A modifier used with `enum` cases or `enum` declarations themselves to indicate that the case (or the entire enum) should be stored indirectly in memory, allowing for recursive enumerations."
    :use "Enable recursive enums: `enum Tree { case node(indirect Tree, indirect Tree) }` or `indirect enum Tree { ... }`."}
   {:kw "infix"
    :def "A keyword used to define a custom infix operator, which appears between its two operands."
    :use "Declare custom infix operators: `infix operator +-: AdditionPrecedence`."}
   {:kw "init"
    :def "A keyword used to define an initializer, which is responsible for preparing an instance of a class, structure, or enumeration for use."
    :use "Define initializers: `init(name: String) { self.name = name }`."}
   {:kw "initializes"
    :def "An attribute used internally by the compiler to track which properties are initialized by a given initializer or function."
    :use "Internal compiler use; not a keyword for direct use."}
   {:kw "inout"
    :def "A keyword used on a function parameter to indicate that the parameter can be modified inside the function, and those modifications will persist after the function returns."
    :use "Pass arguments by reference: `func swap(_ a: inout Int, _ b: inout Int)`."}
   {:kw "internal"
    :def "An access control level that restricts the use of an entity to its defining module."
    :use "Default access level within a module: `internal class MyClass { ... }`."}
   {:kw "introduced"
    :def "Used within the `@available` attribute to specify the version on which a declaration was introduced on a particular platform."
    :use "Specify API introduction version: `@available(iOS 14.0, *)`."}
   {:kw "is"
    :def "A keyword used for type checking, to check if an instance is of a certain type."
    :use "Check type: `if value is String { ... }`."}
   {:kw "isolated"
    :def "A contextual keyword that specifies whether an actor's state is isolated to that actor (default) or if a function or property can safely access isolated state from another actor without an `await`."
    :use "Used on actor properties or methods: `nonisolated var name: String` to mark non-isolated state; also for global actor isolation."}
   {:kw "kind"
    :def "Used in attribute arguments, typically for macro attributes, to specify the kind of macro."
    :use "Within macro attributes: `@freestanding(expression)` where `expression` is the kind."}
   {:kw "lazy"
    :def "A modifier used with stored properties of a class or structure to indicate that the property's initial value is not calculated until the first time it is accessed."
    :use "Defer property initialization: `lazy var expensiveProperty: SomeType = calculateValue()`."}
   {:kw "left"
    :def "Used in `precedencegroup` declarations to specify left-associativity for an operator, meaning operators with the same precedence are grouped from left to right."
    :use "Define operator associativity: `associativity left`."}
   {:kw "let"
    :def "A keyword used to declare a constant, whose value cannot be changed after it is initialized."
    :use "Declare constants: `let pi = 3.14159`."}
   {:kw "line"
    :def "A literal expression that expands to the current line number in the source file."
    :use "For debugging or logging: `print(\"Error on line: \\(#line)\")`."}
   {:kw "linear"
    :def "An experimental concept related to linear types, ensuring a value is used exactly once. Part of Swift's ongoing ownership evolution."
    :use "Experimental feature; not part of stable Swift. For advanced research and specific memory management patterns."}
   {:kw "lowerThan"
    :def "Used in `precedencegroup` declarations to specify that the current precedence group has lower precedence than another specified group."
    :use "Define operator precedence: `precedencegroup MyPrecedenceGroup { lowerThan: OtherPrecedenceGroup }`."}
   {:kw "macro"
    :def "A keyword used to define a Swift macro, which allows you to extend the Swift compiler with custom code generation."
    :use "Define new macros: `macro myMacro(...) = #externalMacro(...)`."}
   {:kw "message"
    :def "Used within the `@available` attribute to provide a custom message when a declaration is deprecated or unavailable."
    :use "Provide deprecation message: `@available(*, deprecated, message: \"This function is no longer supported.\")`."}
   {:kw "metadata"
    :def "Refers to runtime information about types. Not a keyword, but a concept frequently discussed in the context of Swift's runtime."
    :use "Internal to the Swift runtime for dynamic behavior and type introspection."}
   {:kw "modify"
    :def "An accessor used in computed properties or subscripts to provide an in-place mutation capability, often used with `yield`."
    :use "Define an in-place mutator for computed properties: `var value: Int { _read { yield _storage } _modify { yield &_storage } }` (advanced usage)."}
   {:kw "module"
    :def "Refers to a self-contained unit of code distribution. Not a keyword itself, but used in directives and concepts."
    :use "In conditional compilation: `#if canImport(ModuleName)`."}
   {:kw "mutableAddressWithNativeOwner"
    :def "An internal function or concept related to obtaining a mutable memory address of a value, along with its native owner for memory management."
    :use "Internal compiler use for low-level memory access and mutation."}
   {:kw "mutableAddressWithOwner"
    :def "An internal function or concept related to obtaining a mutable memory address of a value, along with its owner for memory management."
    :use "Internal compiler use for low-level memory access and mutation."}
   {:kw "mutating"
    :def "A modifier used with methods or accessors of value types (structs, enums) to indicate that the method or accessor can modify the instance itself or its properties."
    :use "Define methods that modify value type instances: `mutating func increment() { count += 1 }`."}
   {:kw "nil"
    :def "A special value that indicates the absence of a value for an optional type."
    :use "Assign to optionals: `var optionalString: String? = nil`. Check for absence of value: `if myOptional == nil { ... }`."}
   {:kw "noasync"
    :def "An attribute used to indicate that a function or closure is not asynchronous, preventing it from being awaited."
    :use "Used internally or for specific API contracts where asynchronicity is not allowed."}
   {:kw "noDerivative"
    :def "An attribute related to automatic differentiation, marking a function or parameter as not having a derivative, or excluding it from differentiation."
    :use "Used in machine learning contexts with Swift for TensorFlow: `@noDerivative`."}
   {:kw "noescape"
    :def "A deprecated attribute for closure parameters, meaning the closure does not outlive the function call. Replaced by default non-escaping behavior."
    :use "Deprecated. Closures are non-escaping by default; use `@escaping` if needed."}
   {:kw "none"
    :def "Used in `precedencegroup` declarations to specify no associativity for an operator, meaning it cannot be chained with itself."
    :use "Define operator associativity: `associativity none`."}
   {:kw "nonisolated"
    :def "A contextual keyword that specifies that an actor's method or property does not access the actor's isolated state and can be called from outside the actor without awaiting."
    :use "Mark actor members that don't need actor isolation: `nonisolated let id: UUID` or `nonisolated func printId()`."}
   {:kw "nonmutating"
    :def "A modifier used with methods or accessors of value types to explicitly state that the method or accessor does not modify the instance or its properties, even if it could conceptually."
    :use "Define methods on value types that don't modify the instance: `nonmutating func describe() { print(self.name) }` (less common as this is the default for methods without `mutating`)."}
   {:kw "nonsending"
    :def "An internal attribute related to Swift's ownership model, indicating that a value is not 'sent' (i.e., its ownership is not transferred) through a particular operation."
    :use "Internal compiler use; not directly used by developers."}
   {:kw "objc"
    :def "An attribute used to expose Swift declarations to the Objective-C runtime, making them callable from Objective-C code."
    :use "Expose Swift code to Objective-C: `@objc class MyClass: NSObject { @objc func myMethod() { ... } }`."}
   {:kw "obsoleted"
    :def "Used within the `@available` attribute to mark a declaration as obsoleted, meaning it has been removed and is no longer available on a particular platform or version."
    :use "Mark an API as removed: `@available(*, obsoleted: 1.0, message: \"This API has been removed.\")`."}
   {:kw "of"
    :def "Used in various contexts to specify the type or category of something, e.g., `type(of:)`."
    :use "Get the dynamic type of an instance: `type(of: myInstance)`."}
   {:kw "open"
    :def "An access control level for classes and class members that allows them to be subclassed and overridden both within the defining module and within any module that imports the defining module."
    :use "Most permissive access for classes: `open class OpenClass { open func method() {} }`."}
   {:kw "operator"
    :def "A keyword used to declare a custom operator symbol."
    :use "Declare custom operators: `operator +++`."}
   {:kw "optional"
    :def "An attribute used with protocol requirements (methods, properties) to indicate that conforming types are not required to implement them. Only available for `@objc` protocols."
    :use "Make protocol requirements optional: `@objc protocol MyDelegate { @objc optional func didSomething() }`."}
   {:kw "override"
    :def "A modifier used with methods, properties, and subscripts in a subclass to indicate that they provide their own implementation of a member inherited from a superclass."
    :use "Override inherited members: `override func viewDidLoad() { super.viewDidLoad() }`."}
   {:kw "package"
    :def "An access control level that makes an entity accessible to any type within the same package, but not outside of it. This is a level between `internal` and `public`."
    :use "Declare package-private entities: `package func packageFunction() { ... }`."}
   {:kw "postfix"
    :def "A keyword used to define a custom postfix operator, which appears after its single operand."
    :use "Declare custom postfix operators: `postfix operator ++`."}
   {:kw "precedencegroup"
    :def "A keyword used to define a custom precedence group for operators, determining their order of evaluation in an expression."
    :use "Define custom precedence for operators: `precedencegroup MyPrecedenceGroup { ... }`."}
   {:kw "preconcurrency"
    :def "An attribute used on imports or declarations to indicate that the code was written before Swift's strict concurrency checking was fully enforced, allowing for some leniency."
    :use "Apply to imports or modules to opt out of certain strict concurrency warnings temporarily: `@preconcurrency import MyLegacyModule`."}
   {:kw "prefix"
    :def "A keyword used to define a custom prefix operator, which appears before its single operand."
    :use "Declare custom prefix operators: `prefix operator --`."}
   {:kw "private"
    :def "An access control level that restricts the use of an entity to its defining declaration and to extensions of that declaration that are in the same file."
    :use "Limit visibility: `private var secretValue: String`."}
   {:kw "Protocol"
    :def "The type representing a protocol itself, used when referring to a protocol as a type (e.g., `P.self` for a protocol `P`)."
    :use "When you need to refer to the protocol type itself: `func takesProtocolType(p: Protocol)`."}
   {:kw "protocol"
    :def "A keyword used to define a protocol, which is a blueprint of methods, properties, and other requirements that can be adopted by classes, structures, or enumerations."
    :use "Declare a protocol: `protocol MyProtocol { func doSomething() }`."}
   {:kw "public"
    :def "An access control level that allows an entity to be used by code in any source file from its defining module and from any other module that imports the defining module."
    :use "Make entities accessible externally: `public class MyAPI { public func doSomething() {} }`."}
   {:kw "read"
    :def "An accessor used in computed properties or subscripts to provide direct read access to an underlying value, often used with `yield`."
    :use "Define a getter for advanced property accessors: `var value: Int { _read { yield _storage } }` (advanced usage)."}
   {:kw "reasync"
    :def "A contextual keyword used with `rethrows` to indicate that a function or closure is conditionally `async` based on whether its closure parameters are `async`."
    :use "Declare conditionally asynchronous functions: `func process<T>(_ block: () async throws -> T) reasync rethrows -> T`."}
   {:kw "renamed"
    :def "Used within the `@available` attribute to specify that a declaration has been renamed, providing a hint for migration."
    :use "Indicate API renaming: `@available(*, unavailable, renamed: \"newFunction\")`."}
   {:kw "repeat"
    :def "A keyword used to create a `repeat-while` loop, which executes its code block at least once before checking its condition."
    :use "Loop with at least one iteration: `repeat { ... } while condition`."}
   {:kw "required"
    :def "A modifier used with initializers in a class to ensure that every subclass of that class must implement that initializer."
    :use "Force subclass implementation of an initializer: `required init(coder: NSCoder) { ... }`."}
   {:kw "rethrows"
    :def "A contextual keyword used with functions to indicate that the function will only throw an error if one of its closure parameters throws an error."
    :use "Declare conditionally throwing functions: `func map<T>(_ transform: (Element) throws -> T) rethrows -> [T]`."}
   {:kw "retroactive"
    :def "An attribute used on protocol conformances in extensions to indicate that the conformance was added later (retroactively) and affects how the type interacts with the protocol."
    :use "Mark retroactive protocol conformances: `extension MyType: MyProtocol (retroactive) { ... }` (advanced usage for library evolution)."}
   {:kw "return"
    :def "A control transfer statement that immediately ends the execution of a function or method and returns a value (if any) to the caller."
    :use "Exit a function and optionally return a value: `return result`."}
   {:kw "reverse"
    :def "Not a standalone keyword. Used as a method on collections (e.g., `array.reversed()`) to get a reversed view."
    :use "Reverse a collection: `let reversedArray = myArray.reversed()`."}
   {:kw "right"
    :def "Used in `precedencegroup` declarations to specify right-associativity for an operator, meaning operators with the same precedence are grouped from right to left."
    :use "Define operator associativity: `associativity right`."}
   {:kw "safe"
    :def "Not a standalone keyword in general Swift. Often used in discussions about memory safety or in names of specific safe APIs."
    :use "Conceptually: 'safe code' or 'memory safe operations'."}
   {:kw "scoped"
    :def "An internal attribute or concept related to declarations whose visibility or lifetime is limited to a specific scope."
    :use "Internal compiler use; not directly used by developers."}
   {:kw "self"
    :def "Refers to the instance of the type (class, struct, enum) in which it is used. Can be used to access properties or methods of the current instance, or to disambiguate between a property and a parameter with the same name."
    :use "Access current instance members: `self.property = value`. Disambiguation: `init(name: String) { self.name = name }`."}
   {:kw "sending"
    :def "A contextual keyword that signifies a parameter or binding is 'sending' a value, meaning its ownership is transferred or consumed. This is part of Swift's explicit ownership features."
    :use "Used with variable bindings to explicitly transfer ownership of a value. E.g., `let x = sending y` (experimental feature)."}
   {:kw "Self"
    :def "Refers to the *type* of the current instance in a protocol or class context. In a protocol, it refers to the concrete type that conforms to the protocol. In a class, it refers to the exact class type of the current instance."
    :use "In protocols: `static func factory() -> Self`. In classes: `let typeOfInstance = type(of: self)`."}
   {:kw "Sendable"
    :def "A marker protocol that indicates a type can be safely shared across different concurrency domains (e.g., between actors or tasks) without requiring synchronization."
    :use "Conform types to `Sendable` if they are immutable or provide their own synchronization: `struct MyData: Sendable { ... }`."}
   {:kw "set"
    :def "An accessor used within a computed property or subscript to define the code that sets the property's value."
    :use "Define a setter: `var myProperty: Int { get { return _value } set { _value = newValue } }`."}
   {:kw "some"
    :def "A keyword used to declare an *opaque type*, meaning a function or property returns a specific type that conforms to a given protocol, but the exact concrete type is not exposed to the caller."
    :use "Declare opaque return types: `func makeView() -> some View { ... }`."}
   {:kw "spi"
    :def "Short for 'System Programming Interface'. Not a keyword, but a term used in attributes like `_spi_available` to denote APIs intended for specific system-level clients rather than public use."
    :use "Discussing internal framework APIs or in attributes like `@_spi_available`."}
   {:kw "spiModule"
    :def "An attribute used in conjunction with `_spi_available` to specify the module for which an SPI is available."
    :use "Specify the module for SPI availability: `@_spi_available(MyInternalModule, introduced: 1.0)`."}
   {:kw "static"
    :def "A modifier used with properties and methods belonging to the type itself, rather than to any instance of that type. Also used to define type properties and type methods in structs, enums, and classes."
    :use "Declare type-level members: `static var shared: MyClass = MyClass()`."}
   {:kw "struct"
    :def "A keyword used to define a structure, a value type that encapsulates related data and functionality."
    :use "Declare a structure: `struct Point { var x: Int, y: Int }`."}
   {:kw "subscript"
    :def "A keyword used to define a subscript, which provides direct access to elements of a collection, list, or sequence by index or key."
    :use "Enable array-like access for custom types: `subscript(index: Int) -> Element { get { ... } set { ... } }`."}
   {:kw "super"
    :def "Refers to the superclass of a class instance. Used to access overridden methods, properties, or initializers of the superclass."
    :use "Call superclass implementations: `super.viewDidLoad()`, `super.init()`."}
   {:kw "swift"
    :def "Refers to the Swift programming language. Not a keyword, but used in conditional compilation directives."
    :use "Conditional compilation: `#if swift(>=5.0)`."}
   {:kw "switch"
    :def "A control flow statement that considers a value and compares it against several possible matching patterns."
    :use "Pattern matching for values: `switch value { case 1: ... default: ... }`."}
   {:kw "target"
    :def "Not a standalone keyword. Used in conditional compilation directives to specify a build target."
    :use "Conditional compilation: `#if targetEnvironment(simulator)`."}
   {:kw "then"
    :def "Used internally by the compiler in some conditional expressions or control flow constructs. Not a direct keyword for user code."
    :use "Internal compiler use, especially in Swift Intermediate Language (SIL)."}
   {:kw "throw"
    :def "A keyword used to throw an error, indicating that an unexpected problem has occurred."
    :use "Propagate errors: `throw MyError.invalidInput`."}
   {:kw "throws"
    :def "A keyword used in a function or method declaration to indicate that the function can throw an error."
    :use "Mark throwing functions: `func canFail() throws -> Data { ... }`."}
   {:kw "transpose"
    :def "An attribute related to automatic differentiation, specifically for transposing functions (e.g., for backpropagation in machine learning)."
    :use "Used in machine learning contexts with Swift for TensorFlow: `@transpose(of: f)`."}
   {:kw "true"
    :def "A keyword representing the boolean literal value `true`."
    :use "Used for boolean expressions and assignments: `let isActive = true`."}
   {:kw "try"
    :def "A keyword used to call a throwing function. It comes in three forms: `try` (propagate error), `try?` (convert error to optional), and `try!` (force unwrap error)."
    :use "Call throwing functions: `try someThrowingFunction()`, `let result = try? someThrowingFunction()`, `let result = try! someThrowingFunction()`."}
   {:kw "Type"
    :def "The metatype type for a given type `T`, denoted `T.Type`. Used to refer to the type itself as a value."
    :use "Refer to a type as a value: `let intType: Int.Type = Int.self`. Used in generics: `func createInstance<T>(_ type: T.Type) -> T`."}
   {:kw "typealias"
    :def "A keyword used to define an alias (an alternative name) for an existing type."
    :use "Create type aliases for clarity or brevity: `typealias AudioSample = UInt16`."}
   {:kw "unavailable"
    :def "Used within the `@available` attribute to mark a declaration as unavailable on a particular platform or version."
    :use "Mark an API as unavailable: `@available(macOS, unavailable)`."}
   {:kw "unchecked"
    :def "An attribute used with enum cases that are raw representable, allowing for unchecked conversion from a raw value, bypassing validation. This can be unsafe."
    :use "Used in specific contexts for performance where validation is guaranteed elsewhere: `@unchecked enum MyEnum: Int { ... }`."}
   {:kw "unowned"
    :def "A keyword used to define an unowned reference to an instance. An unowned reference does not keep a strong hold on the instance it refers to and is used when the other instance has the same or a longer lifetime."
    :use "Break strong reference cycles when both objects will always have a value: `unowned let delegate: MyDelegate`."}
   {:kw "unsafe"
    :def "A keyword that often precedes operations or types that involve direct memory manipulation or bypass Swift's safety checks, indicating potential for undefined behavior."
    :use "Used with pointers and raw memory: `unsafeBitCast`, `UnsafePointer`."}
   {:kw "unsafeAddress"
    :def "An internal function or concept related to obtaining an unsafe, raw memory address of a value."
    :use "Internal compiler use for very low-level memory operations."}
   {:kw "unsafeMutableAddress"
    :def "An internal function or concept related to obtaining an unsafe, mutable raw memory address of a value."
    :use "Internal compiler use for very low-level memory operations and mutation."}
   {:kw "using"
    :def "A contextual keyword that often appears in declarations that import specific symbols or provide aliases for them, or in advanced language features like parameter packs to indicate how a pack is 'used'."
    :use "Can appear in `import` declarations: `import class Foundation.URL` or in variadic generics, e.g., `repeat (each T).description`."}
   {:kw "var"
    :def "A keyword used to declare a variable, whose value can be changed after it is initialized."
    :use "Declare variables: `var counter = 0`."}
   {:kw "visibility"
    :def "Refers to access control (e.g., `public`, `private`). Not a keyword itself, but a concept."
    :use "Discussing the scope of declarations."}
   {:kw "weak"
    :def "A keyword used to define a weak reference to an instance. A weak reference does not keep a strong hold on the instance it refers to and is automatically set to `nil` when the instance is deallocated."
    :use "Break strong reference cycles when one object's lifetime is independent of the other: `weak var delegate: MyDelegate?`."}
   {:kw "where"
    :def "A keyword used to specify constraints on type parameters in generics, or to add additional conditions to `case` statements in `switch` blocks or `for-in` loops."
    :use "Generic constraints: `func process<T>(item: T) where T: Equatable`. Switch cases: `case let .some(value) where value > 0:`."}
   {:kw "while"
    :def "A control flow statement that repeatedly executes a block of code as long as a condition is true."
    :use "Loop as long as a condition holds: `while condition { ... }`."}
   {:kw "willSet"
    :def "A property observer that is called just before a property's value is about to be set."
    :use "Execute code before a property's value changes: `var myProperty: Int { willSet { print(\"Value about to change to \\(newValue)\") } }`."}
   {:kw "wrt"
    :def "Short for 'with respect to'. Used in contexts related to automatic differentiation to specify the variables with respect to which a derivative is computed."
    :use "Used in automatic differentiation contexts: `@derivative(of: f, wrt: .0)`."}
   {:kw "yield"
    :def "A keyword used within `read` and `modify` accessors of computed properties and subscripts to provide a value or an inout binding to the caller."
    :use "Provide value in custom accessors: `var value: Int { _read { yield _storage } }` (advanced usage)."}])
