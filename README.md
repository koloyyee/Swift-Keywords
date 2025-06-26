# Swift Keywords
**Disclaimer**: Swift is a trademark of Apple Inc. This is an unofficial documentation project created for educational purposes.
All Swift language keywords, syntax, and related concepts are the intellectual property of Apple Inc. This project is not affiliated with, endorsed by, or sponsored by Apple Inc.

**Copyright Notice**: Swift and the Swift logo are trademarks of Apple Inc.

---

## Motivation
Swift got over 200 keywords now, here is a table lookup for the keywords, definitions and where to use.

**AI Disclaimer**:
The definitions and where to use were researched with Gemini; if you find it inaccurate, please create an issue.

---

## Keywords Table of Content
[__consuming](#__consuming)
, [__owned](#__owned)
, [__setter_access](#__setter_access)
, [__shared](#__shared)
, [_backDeploy](#_backDeploy)
, [_borrow](#_borrow)
, [_borrowing](#_borrowing)
, [_BridgeObject](#_BridgeObject)
, [_Class](#_Class)
, [_compilerInitialized](#_compilerInitialized)
, [_const](#_const)
, [_consuming](#_consuming)
, [_documentation](#_documentation)
, [_dynamicReplacement](#_dynamicReplacement)
, [_effects](#_effects)
, [_forward](#_forward)
, [_implements](#_implements)
, [_linear](#_linear)
, [_local](#_local)
, [_modify](#_modify)
, [_move](#_move)
, [_mutating](#_mutating)
, [_NativeClass](#_NativeClass)
, [_NativeRefCountedObject](#_NativeRefCountedObject)
, [_noMetadata](#_noMetadata)
, [_opaqueReturnTypeOf](#_opaqueReturnTypeOf)
, [_originallyDefinedIn](#_originallyDefinedIn)
, [_PackageDescription](#_PackageDescription)
, [_read](#_read)
, [_RefCountedObject](#_RefCountedObject)
, [specialized](#specialized)
, [_specialize](#_specialize)
, [_spi_available](#_spi_available)
, [_Trivial](#_Trivial)
, [_TrivialAtMost](#_TrivialAtMost)
, [_TrivialStride](#_TrivialStride)
, [_underlyingVersion](#_underlyingVersion)
, [_UnknownLayout](#_UnknownLayout)
, [_version](#_version)
, [abi](#abi)
, [accesses](#accesses)
, [actor](#actor)
, [addressWithNativeOwner](#addressWithNativeOwner)
, [addressWithOwner](#addressWithOwner)
, [any](#any)
, [Any](#Any)
, [as](#as)
, [assignment](#assignment)
, [associatedtype](#associatedtype)
, [associativity](#associativity)
, [async](#async)
, [attached](#attached)
, [autoclosure](#autoclosure)
, [availability](#availability)
, [available](#available)
, [await](#await)
, [backDeployed](#backDeployed)
, [before](#before)
, [block](#block)
, [borrow](#borrow)
, [borrowing](#borrowing)
, [break](#break)
, [canImport](#canImport)
, [](#)
, [catch](#catch)
, [class](#class)
, [compiler](#compiler)
, [consume](#consume)
, [copy](#copy)
, [consuming](#consuming)
, [continue](#continue)
, [convenience](#convenience)
, [convention](#convention)
, [default](#default)
, [defer](#defer)
, [deinit](#deinit)
, [dependsOn](#dependsOn)
, [deprecated](#deprecated)
, [derivative](#derivative)
, [didSet](#didSet)
, [differentiable](#differentiable)
, [distributed](#distributed)
, [do](#do)
, [dynamic](#dynamic)
, [each](#each)
, [else](#else)
, [enum](#enum)
, [escaping](#escaping)
, [exported](#exported)
, [extension](#extension)
, [fallthrough](#fallthrough)
, [false](#false)
, [file](#file)
, [fileprivate](#fileprivate)
, [final](#final)
, [for](#for)
, [discard](#discard)
, [forward](#forward)
, [func](#func)
, [freestanding](#freestanding)
, [get](#get)
, [guard](#guard)
, [higherThan](#higherThan)
, [if](#if)
, [import](#import)
, [in](#in)
, [indirect](#indirect)
, [infix](#infix)
, [init](#init)
, [initializes](#initializes)
, [inout](#inout)
, [internal](#internal)
, [introduced](#introduced)
, [is](#is)
, [isolated](#isolated)
, [kind](#kind)
, [lazy](#lazy)
, [left](#left)
, [let](#let)
, [line](#line)
, [linear](#linear)
, [lowerThan](#lowerThan)
, [macro](#macro)
, [message](#message)
, [metadata](#metadata)
, [modify](#modify)
, [module](#module)
, [mutableAddressWithNativeOwner](#mutableAddressWithNativeOwner)
, [mutableAddressWithOwner](#mutableAddressWithOwner)
, [mutating](#mutating)
, [nil](#nil)
, [noasync](#noasync)
, [noDerivative](#noDerivative)
, [noescape](#noescape)
, [none](#none)
, [nonisolated](#nonisolated)
, [nonmutating](#nonmutating)
, [nonsending](#nonsending)
, [objc](#objc)
, [obsoleted](#obsoleted)
, [of](#of)
, [open](#open)
, [operator](#operator)
, [optional](#optional)
, [override](#override)
, [package](#package)
, [postfix](#postfix)
, [precedencegroup](#precedencegroup)
, [preconcurrency](#preconcurrency)
, [prefix](#prefix)
, [private](#private)
, [Protocol](#Protocol)
, [protocol](#protocol)
, [public](#public)
, [read](#read)
, [reasync](#reasync)
, [renamed](#renamed)
, [repeat](#repeat)
, [required](#required)
, [rethrows](#rethrows)
, [retroactive](#retroactive)
, [return](#return)
, [reverse](#reverse)
, [right](#right)
, [safe](#safe)
, [scoped](#scoped)
, [self](#self)
, [sending](#sending)
, [Self](#Self)
, [Sendable](#Sendable)
, [set](#set)
, [some](#some)
, [spi](#spi)
, [spiModule](#spiModule)
, [static](#static)
, [struct](#struct)
, [subscript](#subscript)
, [super](#super)
, [swift](#swift)
, [switch](#switch)
, [target](#target)
, [then](#then)
, [throw](#throw)
, [throws](#throws)
, [transpose](#transpose)
, [true](#true)
, [try](#try)
, [Type](#Type)
, [typealias](#typealias)
, [unavailable](#unavailable)
, [unchecked](#unchecked)
, [unowned](#unowned)
, [unsafe](#unsafe)
, [unsafeAddress](#unsafeAddress)
, [unsafeMutableAddress](#unsafeMutableAddress)
, [using](#using)
, [var](#var)
, [visibility](#visibility)
, [weak](#weak)
, [where](#where)
, [while](#while)
, [willSet](#willSet)
, [wrt](#wrt)
, [yield](#yield)
## Look Up Table
| Keyword | Definition | Where to use? |
|----------|----------|----------|
|<p id='__consuming'>__consuming<p>|An internal attribute used for parameters that consume their argument. This is part of Swift's ownership model for optimizing memory.	|Primarily for internal compiler and standard library use; not typically used directly by application developers.	|
|<p id='__owned'>__owned<p>|An internal attribute similar to `__consuming`, indicating that a parameter takes ownership of its argument.	|Internal compiler and standard library use; rarely, if ever, used directly in application code.	|
|<p id='__setter_access'>__setter_access<p>|An internal attribute related to controlling access to a setter.	|Internal compiler use, especially in synthesized code or for specific access control mechanisms.	|
|<p id='__shared'>__shared<p>|An internal attribute indicating that a parameter shares ownership of its argument, implying a non-consuming borrow.	|Internal compiler and standard library use; not typically used by application developers.	|
|<p id='_backDeploy'>_backDeploy<p>|An attribute to mark a function or type as back-deployable, allowing it to be used on older OS versions than the one it was compiled with.	|Apply to declarations (`@_backDeploy(before: OSVersion)`) when you want to make new API available on older OS versions by compiling a separate, older version of the code into your binary.	|
|<p id='_borrow'>_borrow<p>|An internal attribute related to borrowing values, often used in conjunction with move-only types or strict concurrency.	|Primarily internal to the compiler and standard library for managing value lifetimes and ownership. Not for general use.	|
|<p id='_borrowing'>_borrowing<p>|An internal attribute that signifies a parameter or binding is borrowing a value. It's related to Swift's ownership features, ensuring values are not implicitly copied.	|Internal compiler use, especially with explicit ownership management and strict concurrency features. Not typically used directly.	|
|<p id='_BridgeObject'>_BridgeObject<p>|An internal type used for bridging between Swift and Objective-C objects when specific ownership or reference counting semantics are required.	|Internal Swift runtime; not intended for direct use.	|
|<p id='_Class'>_Class<p>|An internal attribute or type used to represent a class type at the SIL (Swift Intermediate Language) level.	|Internal compiler use; not directly exposed to Swift developers.	|
|<p id='_compilerInitialized'>_compilerInitialized<p>|An internal attribute for properties that are guaranteed to be initialized by the compiler.	|Internal compiler use for specific optimizations and guarantees.	|
|<p id='_const'>_const<p>|An experimental attribute indicating that a function or property is 'constant' or 'pure', meaning it produces the same output for the same input and has no side effects.	|Experimental feature; may be used on functions or properties where referential transparency is desired for compiler optimizations.	|
|<p id='_consuming'>_consuming<p>|An internal attribute indicating that a parameter consumes its argument, transferring ownership. This is a lower-level ownership control than the `consuming` keyword.	|Internal compiler use for fine-grained ownership management.	|
|<p id='_documentation'>_documentation<p>|An attribute used internally by the Swift compiler for documentation generation purposes.	|Internal compiler use; not directly exposed for user-level documentation.	|
|<p id='_dynamicReplacement'>_dynamicReplacement<p>|An attribute used for providing an alternative implementation of a function, often for testing or patching purposes at runtime.	|Advanced scenarios like testing or hot-patching; generally not for typical application development. Used with `@_dynamicReplacement(for: originalFunction())`.	|
|<p id='__effects'>__effects<p>|An internal attribute used to describe the side effects of a function for optimization and concurrency analysis.	|Internal compiler use.	|
|<p id='_forward'>_forward<p>|An attribute or concept related to forwarding calls or properties, often in the context of `_dynamicReplacement` or other advanced dispatch mechanisms.	|Internal compiler use for specialized dispatch and runtime behavior.	|
|<p id='_implements'>_implements<p>|An attribute used on a function to explicitly state that it implements a requirement from a protocol or an inherited method, often for ABI stability or specific dispatching.	|Advanced scenarios, typically for library authors or when dealing with ABI compatibility, e.g., `@_implements(Protocol.method)`.	|
|<p id='_linear'>_linear<p>|An experimental attribute related to linear types, ensuring a value is used exactly once. Part of Swift's ongoing ownership evolution.	|Experimental feature; not part of stable Swift. For advanced research and specific memory management patterns.	|
|<p id='_local'>_local<p>|An internal attribute used to mark a declaration as local to a certain scope or compilation unit for optimization purposes.	|Internal compiler use; not a keyword for general programming.	|
|<p id='_modify'>_modify<p>|An internal accessor that provides in-place mutation of a value, used in contexts like computed properties with `_read` and `_modify` accessors.	|Internal to how Swift implements certain mutable access patterns; not directly written by developers as an accessor keyword. You'd typically use `get` and `set` or `didSet`/`willSet`.	|
|<p id='_move'>_move<p>|An experimental keyword or attribute for explicitly moving a value, transferring ownership without copying. Part of Swift's ownership manifesto.	|Experimental feature; not part of stable Swift. For explicit ownership transfer with move-only types.	|
|<p id='_mutating'>_mutating<p>|An internal modifier that signifies a method modifies the instance it's called on. This is the underlying mechanism for the `mutating` keyword.	|Internal compiler use; developers use the `mutating` keyword directly.	|
|<p id='_NativeClass'>_NativeClass<p>|An internal type or attribute related to Objective-C interoperability, specifically for types that are pure Swift classes but have Objective-C runtime characteristics.	|Internal Swift runtime and Objective-C bridging; not for direct use.	|
|<p id='_NativeRefCountedObject'>_NativeRefCountedObject<p>|An internal type or attribute for objects that are reference-counted directly by the Swift runtime, typically for internal data structures.	|Internal Swift runtime; not for direct use.	|
|<p id='_noMetadata'>_noMetadata<p>|An internal attribute for types that do not require runtime metadata, often for performance optimizations.	|Internal compiler optimization; not for general use.	|
|<p id='_opaqueReturnTypeOf'>_opaqueReturnTypeOf<p>|An internal function or attribute used to represent the opaque return type of an `some Protocol` declaration at a lower level.	|Internal compiler use for `some` opaque types; not for direct invocation.	|
|<p id='_originallyDefinedIn'>_originallyDefinedIn<p>|An attribute used by the compiler to track where a declaration was originally defined, which is important for module stability and ABI.	|Internal compiler use, especially for library evolution. Not something you'd typically write.	|
|<p id='_PackageDescription'>_PackageDescription<p>|A module or internal identifier related to the Swift Package Manager's manifest file.	|Internal to SwiftPM; you import `PackageDescription` in `Package.swift`.	|
|<p id='_read'>_read<p>|An internal accessor for computed properties that provides direct read access to a stored value or computes one. Used in conjunction with `_modify` for optimized access.	|Internal to how Swift implements optimized property access; not directly written by developers as an accessor keyword. You'd typically use `get`.	|
|<p id='_RefCountedObject'>_RefCountedObject<p>|An internal type or attribute for generic reference-counted objects within the Swift runtime.	|Internal Swift runtime; not for direct use.	|
|<p id='specialized'>specialized<p>|An attribute for internal compiler use, indicating that a function or type has been specialized for particular generic arguments to improve performance.	|Internal compiler optimization. Not directly used by developers.	|
|<p id='_specialize'>_specialize<p>|An attribute that suggests to the compiler to generate specialized versions of a generic function or type for specific types, potentially improving performance.	|Advanced optimization, used on generic declarations, e.g., `@_specialize(where T == Int)`.	|
|<p id='_spi_available'>_spi_available<p>|An attribute that marks an API as available only for specific 'System Programming Interface' (SPI) clients, meaning it's not public API but can be used by certain modules.	|Used by framework developers to expose APIs to other internal frameworks or specific system components without making them generally public. Example: `@_spi_available(MyInternalModule, introduced: 1.0)`.	|
|<p id='_Trivial'>_Trivial<p>|An internal attribute for types that are 'trivial' in terms of memory management (e.g., no reference counting needed), allowing for certain optimizations.	|Internal compiler use; not for direct use.	|
|<p id='_TrivialAtMost'>_TrivialAtMost<p>|An internal attribute used to specify the maximum size for a type to be considered trivial for optimization purposes.	|Internal compiler use; not for direct use.	|
|<p id='_TrivialStride'>_TrivialStride<p>|An internal attribute related to the memory stride of trivial types.	|Internal compiler use; not for direct use.	|
|<p id='_underlyingVersion'>_underlyingVersion<p>|An internal attribute used to track the underlying version of an API, often in the context of ABI stability and back deployment.	|Internal compiler use for library evolution; not directly used by developers.	|
|<p id='_UnknownLayout'>_UnknownLayout<p>|An internal attribute for types whose memory layout is not known at compile time, typically for opaque types or when interacting with C types.	|Internal compiler use; not for direct use.	|
|<p id='_version'>_version<p>|An internal attribute used to mark the version of a declaration, often for ABI compatibility or deprecation tracking.	|Internal compiler use for library evolution; not directly used by developers.	|
|<p id='abi'>abi<p>|Refers to Application Binary Interface. Not a keyword itself, but a concept frequently discussed in the context of Swift's long-term stability goals, especially with library evolution.	|Used in discussions and documentation about Swift's binary compatibility guarantees across different versions.	|
|<p id='accesses'>accesses<p>|A compiler-internal concept related to how a property or function accesses memory, used for optimization and strict concurrency checking.	|Primarily internal to the compiler's analysis; not a keyword you'd write directly.	|
|<p id='actor'>actor<p>|A keyword used to define an actor, a reference type that ensures mutable state is accessed in a mutually exclusive way, simplifying concurrent programming.	|Declare an actor using `actor MyActor { ... }` to protect mutable state in concurrent environments.	|
|<p id='addressWithNativeOwner'>addressWithNativeOwner<p>|An internal function or concept related to obtaining the memory address of a value, along with its native owner for memory management.	|Internal compiler use, especially when dealing with low-level memory access or interoperability with C/C++.	|
|<p id='addressWithOwner'>addressWithOwner<p>|An internal function or concept related to obtaining the memory address of a value, along with its owner for memory management.	|Internal compiler use, especially when dealing with low-level memory access or interoperability.	|
|<p id='any'>any<p>|A keyword used to represent an existential type, meaning 'some type that conforms to this protocol(s)'. It allows for type erasure.	|Used as `any ProtocolName` (e.g., `func process(_ item: any Equatable)`) to indicate that a value is of some type that conforms to the specified protocol, rather than a concrete type.	|
|<p id='Any'>Any<p>|A type alias for `any Protocol<...>` representing an instance of any type, including class, struct, enum, or other Swift types.	|Used when you need to refer to an instance of *any* type, such as `func acceptsAny(_ value: Any)`. Consider using `any Protocol` for more specific type erasure if possible.	|
|<p id='as'>as<p>|A keyword used for type casting, to check the type of an instance or to downcast it to a more specific type.	|Used for conditional casting (`if let someView = view as? UIView`) or forced casting (`let myInt = someValue as! Int`). Also used with `as!` for forced downcasting and `as Any` for upcasting to the `Any` type.	|
|<p id='assignment'>assignment<p>|Refers to the act of giving a value to a variable or constant. It's not a keyword itself but a fundamental operation.	|Used in general programming terminology: `let x = 10` is an assignment.	|
|<p id='associatedtype'>associatedtype<p>|A keyword used within a protocol definition to declare a placeholder name for a type that is used as part of the protocol.	|Define a type requirement within a protocol: `protocol Container { associatedtype Item }`.	|
|<p id='associativity'>associativity<p>|A keyword used in `precedencegroup` declarations to define how operators with the same precedence are grouped (left, right, or none).	|Specify operator associativity in custom precedence groups: `associativity left`.	|
|<p id='async'>async<p>|A keyword used to mark a function or closure as asynchronous, meaning it can perform work without blocking the current thread and can use `await`.	|Declare asynchronous functions: `func fetchData() async -> Data { ... }`. Also used with `async let` for concurrent binding.	|
|<p id='attached'>attached<p>|An attribute used with macros, indicating that a macro is 'attached' to a declaration and expands to additional declarations alongside it.	|Used in macro definitions, e.g., `@attached(peer)`. Not used in general Swift code.	|
|<p id='autoclosure'>autoclosure<p>|An attribute used on a parameter in a function declaration to automatically wrap an expression into a closure, deferring its evaluation.	|Apply to function parameters: `func logIfTrue(_ condition: @autoclosure () -> Bool)`. This allows you to pass an expression directly instead of a closure literal.	|
|<p id='availability'>availability<p>|An attribute used to specify the platforms and versions on which a declaration is available, deprecated, or obsoleted.	|Apply to declarations: `@available(iOS 13.0, macOS 10.15, *)`.	|
|<p id='available'>available<p>|A keyword used within conditional compilation blocks to check the availability of APIs based on platform and version.	|Used in `#if available(...)` blocks to conditionally compile code based on API availability.	|
|<p id='await'>await<p>|A keyword used within an `async` function to pause execution until an asynchronous operation completes, allowing other code to run.	|Call an `async` function: `let data = await fetchData()`.	|
|<p id='backDeployed'>backDeployed<p>|An attribute used to mark a function or type as back-deployable, allowing it to be used on older OS versions than the one it was compiled with.	|Similar to `_backDeploy`, used as `@backDeployed(before: OSVersion)`.	|
|<p id='before'>before<p>|Used within attributes like `@available` or `backDeployed` to specify a version prior to which the declaration has a certain status (e.g., unavailable, back-deployed).	|Example: `@available(iOS, unavailable, introduced: 14.0, message: 'Use new API')` or `@backDeployed(before: iOS 15.0)`.	|
|<p id='block'>block<p>|Refers to a block of code, often enclosed in curly braces `{}`. Not a keyword, but a fundamental concept.	|Any group of statements, such as the body of a function, loop, or conditional statement.	|
|<p id='borrow'>borrow<p>|A keyword (or attribute in some contexts) used to explicitly borrow a value, which is part of Swift's strict concurrency and ownership features. It allows temporary, shared access without transferring ownership.	|Used with variable bindings for temporary, non-consuming access to a value. E.g., `let x = borrow y` (experimental feature).	|
|<p id='borrowing'>borrowing<p>|A contextual keyword that marks a function parameter as borrowing its argument, ensuring the argument's lifetime is managed by the caller and not consumed by the function.	|Used in function signatures for parameters that are implicitly borrowed: `func process(_ item: borrowing MyStruct)`. Particularly relevant for move-only types.	|
|<p id='break'>break<p>|A control transfer statement that immediately terminates the execution of a loop (`for`, `while`, `repeat-while`) or a `switch` statement.	|Exit a loop or `switch` statement prematurely: `break`.	|
|<p id='canImport'>canImport<p>|A conditional compilation directive that checks if a module can be imported.	|Used in `#if canImport(ModuleName)` to conditionally compile code based on the availability of a module.	|
|<p id=''><p>|An empty keyword, likely a placeholder or an error in the input.	|N/A - This is not a valid Swift keyword.	|
|<p id='catch'>catch<p>|A keyword used in `do-catch` statements to handle errors thrown by functions or methods.	|Handle errors: `do { try someThrowingFunction() } catch { ... }`.	|
|<p id='class'>class<p>|A keyword used to define a class, a reference type that supports inheritance and polymorphism.	|Declare a class: `class MyClass { ... }`.	|
|<p id='compiler'>compiler<p>|Refers to the Swift compiler. Not a keyword, but a term used in directives or attributes related to compiler behavior.	|Used in conditional compilation directives like `#if compiler(>=5.0)` or in attributes like `@_compilerInitialized`.	|
|<p id='consume'>consume<p>|A keyword used to explicitly consume a value, transferring its ownership. This marks the end of a value's lifetime from the perspective of the current scope.	|Used with variable bindings to explicitly consume a value, making it unavailable for further use after the `consume` call. E.g., `let x = consume y` (experimental feature).	|
|<p id='copy'>copy<p>|A keyword used in property wrappers or accessors to specify that a copy of the wrapped value should be made when accessed.	|Used in property wrappers for copy-on-read semantics: `@propertyWrapper struct MyWrapper { @copy var wrappedValue: Int }`.	|
|<p id='consuming'>consuming<p>|A contextual keyword that marks a function parameter as consuming its argument, indicating that the function takes ownership of the value and is responsible for its lifetime.	|Used in function signatures for parameters that consume their arguments: `func process(_ item: consuming MyStruct)`. Particularly relevant for move-only types to ensure proper resource management.	|
|<p id='continue'>continue<p>|A control transfer statement that immediately ends the current iteration of a loop (`for`, `while`, `repeat-while`) and begins the next iteration.	|Skip to the next iteration of a loop: `continue`.	|
|<p id='convenience'>convenience<p>|A modifier used with initializers within a class to denote an initializer that calls another initializer from the same class, ultimately delegating to a designated initializer.	|Declare a convenience initializer: `convenience init(...) { self.init(...) }`.	|
|<p id='convention'>convention<p>|An attribute used with function types to specify the calling convention (e.g., Swift, C, block, thin).	|Specify calling convention for function pointers or closures: `var myFunc: @convention(c) (Int) -> Void`.	|
|<p id='default'>default<p>|A keyword used in `switch` statements to provide a fallback case for any values not matched by other `case` statements.	|Provide a default case in a `switch`: `default: // handle all other cases`.	|
|<p id='defer'>defer<p>|A keyword used to execute a block of code just before the current scope exits, regardless of how the exit occurs (e.g., return, throw, fall through).	|Ensure cleanup code runs: `defer { cleanUpResources() }`.	|
|<p id='deinit'>deinit<p>|A keyword used to define a deinitializer, which is called automatically just before a class instance is deallocated.	|Implement cleanup logic for class instances: `deinit { // perform cleanup }`.	|
|<p id='dependsOn'>dependsOn<p>|An internal attribute used to declare dependencies between declarations, especially for compiler optimizations or module loading.	|Internal compiler use; not a keyword for general use.	|
|<p id='deprecated'>deprecated<p>|Used within the `@available` attribute to mark a declaration as deprecated, indicating it should no longer be used and will be removed in future versions.	|Mark an API as deprecated: `@available(*, deprecated, message: 'Use newAPI instead')`.	|
|<p id='derivative'>derivative<p>|An attribute related to automatic differentiation, marking a function as having a derivative or defining its derivative.	|Used in machine learning contexts with Swift for TensorFlow: `@derivative(of: f)`.	|
|<p id='didSet'>didSet<p>|A property observer that is called immediately after a property's value has been set.	|Execute code after a property's value changes: `var myProperty: Int { didSet { print("Value changed") } }`.	|
|<p id='differentiable'>differentiable<p>|An attribute used to mark a function or type as differentiable, meaning its derivatives can be computed automatically.	|Used in machine learning contexts with Swift for TensorFlow: `@differentiable`.	|
|<p id='distributed'>distributed<p>|A keyword used to declare a distributed actor or distributed function, enabling communication between actors across different processes or machines.	|Define distributed actors: `distributed actor MyDistributedActor { ... }`.	|
|<p id='do'>do<p>|A keyword used in `do-catch` statements to define a block of code that can throw errors.	|Mark a throwing context: `do { try someThrowingFunction() }`.	|
|<p id='dynamic'>dynamic<p>|A modifier that indicates a member (property, method, subscript) will be dispatched using Objective-C runtime dynamism, allowing for features like KVO and method swizzling.	|Apply to class members that need Objective-C runtime behavior: `dynamic var myProperty: String`.	|
|<p id='each'>each<p>|A keyword used in variadic generic programming to indicate a parameter pack or type pack that expands into multiple arguments or types.	|Used in generic contexts for type or value parameter packs: `func printAll<each T>(_ items: repeat each T) {}` (experimental feature).	|
|<p id='else'>else<p>|A keyword used with `if` statements to define a block of code that executes when the `if` condition is false.	|Provide an alternative execution path: `if condition { ... } else { ... }`.	|
|<p id='enum'>enum<p>|A keyword used to define an enumeration, a value type that defines a common type for a group of related values.	|Declare an enumeration: `enum Direction { case north, south }`.	|
|<p id='escaping'>escaping<p>|An attribute used on a closure parameter to indicate that the closure may outlive the function it's passed into, requiring explicit memory management.	|Apply to closure parameters: `func takesEscaping(_ closure: @escaping () -> Void)`.	|
|<p id='exported'>exported<p>|An attribute used to mark a declaration as exported from a module, making it visible to other modules, often for specific linking or runtime purposes.	|Used in advanced module-level configuration, often implicitly handled by access control.	|
|<p id='extension'>extension<p>|A keyword used to add new functionality to an existing class, structure, enumeration, or protocol type.	|Extend existing types: `extension String { func capitalize() -> String { ... } }`.	|
|<p id='fallthrough'>fallthrough<p>|A control transfer statement used within a `switch` case to allow execution to continue into the next `case` block.	|Allow execution to flow to the next case in a `switch` statement: `case 1: print("One"); fallthrough`.	|
|<p id='false'>false<p>|A keyword representing the boolean literal value `false`.	|Used for boolean expressions and assignments: `let isEnabled = false`.	|
|<p id='file'>file<p>|Refers to the current source file. Used in access control (`fileprivate`) or for compiler diagnostics.	|In access control: `fileprivate var myVar: Int`.	|
|<p id='fileprivate'>fileprivate<p>|An access control level that restricts the use of an entity to its defining source file.	|Apply to declarations to limit visibility: `fileprivate func helperFunction() { ... }`.	|
|<p id='final'>final<p>|A modifier that prevents a class from being subclassed or an overridden member (method, property, subscript) from being overridden again.	|Prevent inheritance or overriding: `final class MyClass { ... }` or `final func myMethod() { ... }`.	|
|<p id='for'>for<p>|A keyword used to create a loop that iterates over a sequence (e.g., array, range).	|Iterate over collections: `for item in collection { ... }`.	|
|<p id='discard'>discard<p>|A keyword used to explicitly discard a value, often in combination with `_` to ignore a return value or an argument.	|Explicitly ignore a return value or binding: `_ = someFunctionThatReturnsAValue()` or `let _ = someOptional`.	|
|<p id='forward'>forward<p>|A concept related to forwarding calls or references. Not a keyword itself but can appear in internal attributes or discussions of dispatch.	|Internal to compiler mechanisms, e.g., how `_dynamicReplacement` works.	|
|<p id='func'>func<p>|A keyword used to declare a function, which is a named, self-contained block of code that performs a specific task.	|Define functions: `func sayHello() { print("Hello") }`.	|
|<p id='freestanding'>freestanding<p>|An attribute used with macros, indicating that a macro can be called independently without being attached to a specific declaration.	|Used in macro definitions, e.g., `@freestanding(expression)`. Not used in general Swift code.	|
|<p id='get'>get<p>|An accessor used within a computed property, subscript, or getter-only property to define the code that retrieves the property's value.	|Define a getter: `var myProperty: Int { get { return 10 } }`.	|
|<p id='guard'>guard<p>|A statement that requires a condition to be true in order to continue execution. If the condition is false, the `else` block is executed, which must exit the current scope.	|Early exit for conditions: `guard let value = optional else { return }`.	|
|<p id='higherThan'>higherThan<p>|Used in `precedencegroup` declarations to specify that the current precedence group has higher precedence than another specified group.	|Define operator precedence: `precedencegroup MyPrecedenceGroup { higherThan: OtherPrecedenceGroup }`.	|
|<p id='if'>if<p>|A control flow statement that executes a block of code only if a specified condition is true.	|Conditional execution: `if condition { ... }`.	|
|<p id='import'>import<p>|A keyword used to make the declarations from an external module available in the current source file.	|Bring external modules into scope: `import Foundation`.	|
|<p id='in'>in<p>|A keyword with multiple uses: 1. To separate parameters from the body of a closure expression. 2. To define the sequence to iterate over in a `for-in` loop. 3. In `case let` or `for case let` patterns.	|Closure expressions: `{ (param) in print(param) }`. For-in loops: `for item in collection`.	|
|<p id='indirect'>indirect<p>|A modifier used with `enum` cases or `enum` declarations themselves to indicate that the case (or the entire enum) should be stored indirectly in memory, allowing for recursive enumerations.	|Enable recursive enums: `enum Tree { case node(indirect Tree, indirect Tree) }` or `indirect enum Tree { ... }`.	|
|<p id='infix'>infix<p>|A keyword used to define a custom infix operator, which appears between its two operands.	|Declare custom infix operators: `infix operator +-: AdditionPrecedence`.	|
|<p id='init'>init<p>|A keyword used to define an initializer, which is responsible for preparing an instance of a class, structure, or enumeration for use.	|Define initializers: `init(name: String) { self.name = name }`.	|
|<p id='initializes'>initializes<p>|An attribute used internally by the compiler to track which properties are initialized by a given initializer or function.	|Internal compiler use; not a keyword for direct use.	|
|<p id='inout'>inout<p>|A keyword used on a function parameter to indicate that the parameter can be modified inside the function, and those modifications will persist after the function returns.	|Pass arguments by reference: `func swap(_ a: inout Int, _ b: inout Int)`.	|
|<p id='internal'>internal<p>|An access control level that restricts the use of an entity to its defining module.	|Default access level within a module: `internal class MyClass { ... }`.	|
|<p id='introduced'>introduced<p>|Used within the `@available` attribute to specify the version on which a declaration was introduced on a particular platform.	|Specify API introduction version: `@available(iOS 14.0, *)`.	|
|<p id='is'>is<p>|A keyword used for type checking, to check if an instance is of a certain type.	|Check type: `if value is String { ... }`.	|
|<p id='isolated'>isolated<p>|A contextual keyword that specifies whether an actor's state is isolated to that actor (default) or if a function or property can safely access isolated state from another actor without an `await`.	|Used on actor properties or methods: `nonisolated var name: String` to mark non-isolated state; also for global actor isolation.	|
|<p id='kind'>kind<p>|Used in attribute arguments, typically for macro attributes, to specify the kind of macro.	|Within macro attributes: `@freestanding(expression)` where `expression` is the kind.	|
|<p id='lazy'>lazy<p>|A modifier used with stored properties of a class or structure to indicate that the property's initial value is not calculated until the first time it is accessed.	|Defer property initialization: `lazy var expensiveProperty: SomeType = calculateValue()`.	|
|<p id='left'>left<p>|Used in `precedencegroup` declarations to specify left-associativity for an operator, meaning operators with the same precedence are grouped from left to right.	|Define operator associativity: `associativity left`.	|
|<p id='let'>let<p>|A keyword used to declare a constant, whose value cannot be changed after it is initialized.	|Declare constants: `let pi = 3.14159`.	|
|<p id='line'>line<p>|A literal expression that expands to the current line number in the source file.	|For debugging or logging: `print("Error on line: \(#line)")`.	|
|<p id='linear'>linear<p>|An experimental concept related to linear types, ensuring a value is used exactly once. Part of Swift's ongoing ownership evolution.	|Experimental feature; not part of stable Swift. For advanced research and specific memory management patterns.	|
|<p id='lowerThan'>lowerThan<p>|Used in `precedencegroup` declarations to specify that the current precedence group has lower precedence than another specified group.	|Define operator precedence: `precedencegroup MyPrecedenceGroup { lowerThan: OtherPrecedenceGroup }`.	|
|<p id='macro'>macro<p>|A keyword used to define a Swift macro, which allows you to extend the Swift compiler with custom code generation.	|Define new macros: `macro myMacro(...) = #externalMacro(...)`.	|
|<p id='message'>message<p>|Used within the `@available` attribute to provide a custom message when a declaration is deprecated or unavailable.	|Provide deprecation message: `@available(*, deprecated, message: "This function is no longer supported.")`.	|
|<p id='metadata'>metadata<p>|Refers to runtime information about types. Not a keyword, but a concept frequently discussed in the context of Swift's runtime.	|Internal to the Swift runtime for dynamic behavior and type introspection.	|
|<p id='modify'>modify<p>|An accessor used in computed properties or subscripts to provide an in-place mutation capability, often used with `yield`.	|Define an in-place mutator for computed properties: `var value: Int { _read { yield _storage } _modify { yield &_storage } }` (advanced usage).	|
|<p id='module'>module<p>|Refers to a self-contained unit of code distribution. Not a keyword itself, but used in directives and concepts.	|In conditional compilation: `#if canImport(ModuleName)`.	|
|<p id='mutableAddressWithNativeOwner'>mutableAddressWithNativeOwner<p>|An internal function or concept related to obtaining a mutable memory address of a value, along with its native owner for memory management.	|Internal compiler use for low-level memory access and mutation.	|
|<p id='mutableAddressWithOwner'>mutableAddressWithOwner<p>|An internal function or concept related to obtaining a mutable memory address of a value, along with its owner for memory management.	|Internal compiler use for low-level memory access and mutation.	|
|<p id='mutating'>mutating<p>|A modifier used with methods or accessors of value types (structs, enums) to indicate that the method or accessor can modify the instance itself or its properties.	|Define methods that modify value type instances: `mutating func increment() { count += 1 }`.	|
|<p id='nil'>nil<p>|A special value that indicates the absence of a value for an optional type.	|Assign to optionals: `var optionalString: String? = nil`. Check for absence of value: `if myOptional == nil { ... }`.	|
|<p id='noasync'>noasync<p>|An attribute used to indicate that a function or closure is not asynchronous, preventing it from being awaited.	|Used internally or for specific API contracts where asynchronicity is not allowed.	|
|<p id='noDerivative'>noDerivative<p>|An attribute related to automatic differentiation, marking a function or parameter as not having a derivative, or excluding it from differentiation.	|Used in machine learning contexts with Swift for TensorFlow: `@noDerivative`.	|
|<p id='noescape'>noescape<p>|A deprecated attribute for closure parameters, meaning the closure does not outlive the function call. Replaced by default non-escaping behavior.	|Deprecated. Closures are non-escaping by default; use `@escaping` if needed.	|
|<p id='none'>none<p>|Used in `precedencegroup` declarations to specify no associativity for an operator, meaning it cannot be chained with itself.	|Define operator associativity: `associativity none`.	|
|<p id='nonisolated'>nonisolated<p>|A contextual keyword that specifies that an actor's method or property does not access the actor's isolated state and can be called from outside the actor without awaiting.	|Mark actor members that don't need actor isolation: `nonisolated let id: UUID` or `nonisolated func printId()`.	|
|<p id='nonmutating'>nonmutating<p>|A modifier used with methods or accessors of value types to explicitly state that the method or accessor does not modify the instance or its properties, even if it could conceptually.	|Define methods on value types that don't modify the instance: `nonmutating func describe() { print(self.name) }` (less common as this is the default for methods without `mutating`).	|
|<p id='nonsending'>nonsending<p>|An internal attribute related to Swift's ownership model, indicating that a value is not 'sent' (i.e., its ownership is not transferred) through a particular operation.	|Internal compiler use; not directly used by developers.	|
|<p id='objc'>objc<p>|An attribute used to expose Swift declarations to the Objective-C runtime, making them callable from Objective-C code.	|Expose Swift code to Objective-C: `@objc class MyClass: NSObject { @objc func myMethod() { ... } }`.	|
|<p id='obsoleted'>obsoleted<p>|Used within the `@available` attribute to mark a declaration as obsoleted, meaning it has been removed and is no longer available on a particular platform or version.	|Mark an API as removed: `@available(*, obsoleted: 1.0, message: "This API has been removed.")`.	|
|<p id='of'>of<p>|Used in various contexts to specify the type or category of something, e.g., `type(of:)`.	|Get the dynamic type of an instance: `type(of: myInstance)`.	|
|<p id='open'>open<p>|An access control level for classes and class members that allows them to be subclassed and overridden both within the defining module and within any module that imports the defining module.	|Most permissive access for classes: `open class OpenClass { open func method() {} }`.	|
|<p id='operator'>operator<p>|A keyword used to declare a custom operator symbol.	|Declare custom operators: `operator +++`.	|
|<p id='optional'>optional<p>|An attribute used with protocol requirements (methods, properties) to indicate that conforming types are not required to implement them. Only available for `@objc` protocols.	|Make protocol requirements optional: `@objc protocol MyDelegate { @objc optional func didSomething() }`.	|
|<p id='override'>override<p>|A modifier used with methods, properties, and subscripts in a subclass to indicate that they provide their own implementation of a member inherited from a superclass.	|Override inherited members: `override func viewDidLoad() { super.viewDidLoad() }`.	|
|<p id='package'>package<p>|An access control level that makes an entity accessible to any type within the same package, but not outside of it. This is a level between `internal` and `public`.	|Declare package-private entities: `package func packageFunction() { ... }`.	|
|<p id='postfix'>postfix<p>|A keyword used to define a custom postfix operator, which appears after its single operand.	|Declare custom postfix operators: `postfix operator ++`.	|
|<p id='precedencegroup'>precedencegroup<p>|A keyword used to define a custom precedence group for operators, determining their order of evaluation in an expression.	|Define custom precedence for operators: `precedencegroup MyPrecedenceGroup { ... }`.	|
|<p id='preconcurrency'>preconcurrency<p>|An attribute used on imports or declarations to indicate that the code was written before Swift's strict concurrency checking was fully enforced, allowing for some leniency.	|Apply to imports or modules to opt out of certain strict concurrency warnings temporarily: `@preconcurrency import MyLegacyModule`.	|
|<p id='prefix'>prefix<p>|A keyword used to define a custom prefix operator, which appears before its single operand.	|Declare custom prefix operators: `prefix operator --`.	|
|<p id='private'>private<p>|An access control level that restricts the use of an entity to its defining declaration and to extensions of that declaration that are in the same file.	|Limit visibility: `private var secretValue: String`.	|
|<p id='Protocol'>Protocol<p>|The type representing a protocol itself, used when referring to a protocol as a type (e.g., `P.self` for a protocol `P`).	|When you need to refer to the protocol type itself: `func takesProtocolType(p: Protocol)`.	|
|<p id='protocol'>protocol<p>|A keyword used to define a protocol, which is a blueprint of methods, properties, and other requirements that can be adopted by classes, structures, or enumerations.	|Declare a protocol: `protocol MyProtocol { func doSomething() }`.	|
|<p id='public'>public<p>|An access control level that allows an entity to be used by code in any source file from its defining module and from any other module that imports the defining module.	|Make entities accessible externally: `public class MyAPI { public func doSomething() {} }`.	|
|<p id='read'>read<p>|An accessor used in computed properties or subscripts to provide direct read access to an underlying value, often used with `yield`.	|Define a getter for advanced property accessors: `var value: Int { _read { yield _storage } }` (advanced usage).	|
|<p id='reasync'>reasync<p>|A contextual keyword used with `rethrows` to indicate that a function or closure is conditionally `async` based on whether its closure parameters are `async`.	|Declare conditionally asynchronous functions: `func process<T>(_ block: () async throws -> T) reasync rethrows -> T`.	|
|<p id='renamed'>renamed<p>|Used within the `@available` attribute to specify that a declaration has been renamed, providing a hint for migration.	|Indicate API renaming: `@available(*, unavailable, renamed: "newFunction")`.	|
|<p id='repeat'>repeat<p>|A keyword used to create a `repeat-while` loop, which executes its code block at least once before checking its condition.	|Loop with at least one iteration: `repeat { ... } while condition`.	|
|<p id='required'>required<p>|A modifier used with initializers in a class to ensure that every subclass of that class must implement that initializer.	|Force subclass implementation of an initializer: `required init(coder: NSCoder) { ... }`.	|
|<p id='rethrows'>rethrows<p>|A contextual keyword used with functions to indicate that the function will only throw an error if one of its closure parameters throws an error.	|Declare conditionally throwing functions: `func map<T>(_ transform: (Element) throws -> T) rethrows -> [T]`.	|
|<p id='retroactive'>retroactive<p>|An attribute used on protocol conformances in extensions to indicate that the conformance was added later (retroactively) and affects how the type interacts with the protocol.	|Mark retroactive protocol conformances: `extension MyType: MyProtocol (retroactive) { ... }` (advanced usage for library evolution).	|
|<p id='return'>return<p>|A control transfer statement that immediately ends the execution of a function or method and returns a value (if any) to the caller.	|Exit a function and optionally return a value: `return result`.	|
|<p id='reverse'>reverse<p>|Not a standalone keyword. Used as a method on collections (e.g., `array.reversed()`) to get a reversed view.	|Reverse a collection: `let reversedArray = myArray.reversed()`.	|
|<p id='right'>right<p>|Used in `precedencegroup` declarations to specify right-associativity for an operator, meaning operators with the same precedence are grouped from right to left.	|Define operator associativity: `associativity right`.	|
|<p id='safe'>safe<p>|Not a standalone keyword in general Swift. Often used in discussions about memory safety or in names of specific safe APIs.	|Conceptually: 'safe code' or 'memory safe operations'.	|
|<p id='scoped'>scoped<p>|An internal attribute or concept related to declarations whose visibility or lifetime is limited to a specific scope.	|Internal compiler use; not directly used by developers.	|
|<p id='self'>self<p>|Refers to the instance of the type (class, struct, enum) in which it is used. Can be used to access properties or methods of the current instance, or to disambiguate between a property and a parameter with the same name.	|Access current instance members: `self.property = value`. Disambiguation: `init(name: String) { self.name = name }`.	|
|<p id='sending'>sending<p>|A contextual keyword that signifies a parameter or binding is 'sending' a value, meaning its ownership is transferred or consumed. This is part of Swift's explicit ownership features.	|Used with variable bindings to explicitly transfer ownership of a value. E.g., `let x = sending y` (experimental feature).	|
|<p id='Self'>Self<p>|Refers to the *type* of the current instance in a protocol or class context. In a protocol, it refers to the concrete type that conforms to the protocol. In a class, it refers to the exact class type of the current instance.	|In protocols: `static func factory() -> Self`. In classes: `let typeOfInstance = type(of: self)`.	|
|<p id='Sendable'>Sendable<p>|A marker protocol that indicates a type can be safely shared across different concurrency domains (e.g., between actors or tasks) without requiring synchronization.	|Conform types to `Sendable` if they are immutable or provide their own synchronization: `struct MyData: Sendable { ... }`.	|
|<p id='set'>set<p>|An accessor used within a computed property or subscript to define the code that sets the property's value.	|Define a setter: `var myProperty: Int { get { return _value } set { _value = newValue } }`.	|
|<p id='some'>some<p>|A keyword used to declare an *opaque type*, meaning a function or property returns a specific type that conforms to a given protocol, but the exact concrete type is not exposed to the caller.	|Declare opaque return types: `func makeView() -> some View { ... }`.	|
|<p id='spi'>spi<p>|Short for 'System Programming Interface'. Not a keyword, but a term used in attributes like `_spi_available` to denote APIs intended for specific system-level clients rather than public use.	|Discussing internal framework APIs or in attributes like `@_spi_available`.	|
|<p id='spiModule'>spiModule<p>|An attribute used in conjunction with `_spi_available` to specify the module for which an SPI is available.	|Specify the module for SPI availability: `@_spi_available(MyInternalModule, introduced: 1.0)`.	|
|<p id='static'>static<p>|A modifier used with properties and methods belonging to the type itself, rather than to any instance of that type. Also used to define type properties and type methods in structs, enums, and classes.	|Declare type-level members: `static var shared: MyClass = MyClass()`.	|
|<p id='struct'>struct<p>|A keyword used to define a structure, a value type that encapsulates related data and functionality.	|Declare a structure: `struct Point { var x: Int, y: Int }`.	|
|<p id='subscript'>subscript<p>|A keyword used to define a subscript, which provides direct access to elements of a collection, list, or sequence by index or key.	|Enable array-like access for custom types: `subscript(index: Int) -> Element { get { ... } set { ... } }`.	|
|<p id='super'>super<p>|Refers to the superclass of a class instance. Used to access overridden methods, properties, or initializers of the superclass.	|Call superclass implementations: `super.viewDidLoad()`, `super.init()`.	|
|<p id='swift'>swift<p>|Refers to the Swift programming language. Not a keyword, but used in conditional compilation directives.	|Conditional compilation: `#if swift(>=5.0)`.	|
|<p id='switch'>switch<p>|A control flow statement that considers a value and compares it against several possible matching patterns.	|Pattern matching for values: `switch value { case 1: ... default: ... }`.	|
|<p id='target'>target<p>|Not a standalone keyword. Used in conditional compilation directives to specify a build target.	|Conditional compilation: `#if targetEnvironment(simulator)`.	|
|<p id='then'>then<p>|Used internally by the compiler in some conditional expressions or control flow constructs. Not a direct keyword for user code.	|Internal compiler use, especially in Swift Intermediate Language (SIL).	|
|<p id='throw'>throw<p>|A keyword used to throw an error, indicating that an unexpected problem has occurred.	|Propagate errors: `throw MyError.invalidInput`.	|
|<p id='throws'>throws<p>|A keyword used in a function or method declaration to indicate that the function can throw an error.	|Mark throwing functions: `func canFail() throws -> Data { ... }`.	|
|<p id='transpose'>transpose<p>|An attribute related to automatic differentiation, specifically for transposing functions (e.g., for backpropagation in machine learning).	|Used in machine learning contexts with Swift for TensorFlow: `@transpose(of: f)`.	|
|<p id='true'>true<p>|A keyword representing the boolean literal value `true`.	|Used for boolean expressions and assignments: `let isActive = true`.	|
|<p id='try'>try<p>|A keyword used to call a throwing function. It comes in three forms: `try` (propagate error), `try?` (convert error to optional), and `try!` (force unwrap error).	|Call throwing functions: `try someThrowingFunction()`, `let result = try? someThrowingFunction()`, `let result = try! someThrowingFunction()`.	|
|<p id='Type'>Type<p>|The metatype type for a given type `T`, denoted `T.Type`. Used to refer to the type itself as a value.	|Refer to a type as a value: `let intType: Int.Type = Int.self`. Used in generics: `func createInstance<T>(_ type: T.Type) -> T`.	|
|<p id='typealias'>typealias<p>|A keyword used to define an alias (an alternative name) for an existing type.	|Create type aliases for clarity or brevity: `typealias AudioSample = UInt16`.	|
|<p id='unavailable'>unavailable<p>|Used within the `@available` attribute to mark a declaration as unavailable on a particular platform or version.	|Mark an API as unavailable: `@available(macOS, unavailable)`.	|
|<p id='unchecked'>unchecked<p>|An attribute used with enum cases that are raw representable, allowing for unchecked conversion from a raw value, bypassing validation. This can be unsafe.	|Used in specific contexts for performance where validation is guaranteed elsewhere: `@unchecked enum MyEnum: Int { ... }`.	|
|<p id='unowned'>unowned<p>|A keyword used to define an unowned reference to an instance. An unowned reference does not keep a strong hold on the instance it refers to and is used when the other instance has the same or a longer lifetime.	|Break strong reference cycles when both objects will always have a value: `unowned let delegate: MyDelegate`.	|
|<p id='unsafe'>unsafe<p>|A keyword that often precedes operations or types that involve direct memory manipulation or bypass Swift's safety checks, indicating potential for undefined behavior.	|Used with pointers and raw memory: `unsafeBitCast`, `UnsafePointer`.	|
|<p id='unsafeAddress'>unsafeAddress<p>|An internal function or concept related to obtaining an unsafe, raw memory address of a value.	|Internal compiler use for very low-level memory operations.	|
|<p id='unsafeMutableAddress'>unsafeMutableAddress<p>|An internal function or concept related to obtaining an unsafe, mutable raw memory address of a value.	|Internal compiler use for very low-level memory operations and mutation.	|
|<p id='using'>using<p>|A contextual keyword that often appears in declarations that import specific symbols or provide aliases for them, or in advanced language features like parameter packs to indicate how a pack is 'used'.	|Can appear in `import` declarations: `import class Foundation.URL` or in variadic generics, e.g., `repeat (each T).description`.	|
|<p id='var'>var<p>|A keyword used to declare a variable, whose value can be changed after it is initialized.	|Declare variables: `var counter = 0`.	|
|<p id='visibility'>visibility<p>|Refers to access control (e.g., `public`, `private`). Not a keyword itself, but a concept.	|Discussing the scope of declarations.	|
|<p id='weak'>weak<p>|A keyword used to define a weak reference to an instance. A weak reference does not keep a strong hold on the instance it refers to and is automatically set to `nil` when the instance is deallocated.	|Break strong reference cycles when one object's lifetime is independent of the other: `weak var delegate: MyDelegate?`.	|
|<p id='where'>where<p>|A keyword used to specify constraints on type parameters in generics, or to add additional conditions to `case` statements in `switch` blocks or `for-in` loops.	|Generic constraints: `func process<T>(item: T) where T: Equatable`. Switch cases: `case let .some(value) where value > 0:`.	|
|<p id='while'>while<p>|A control flow statement that repeatedly executes a block of code as long as a condition is true.	|Loop as long as a condition holds: `while condition { ... }`.	|
|<p id='willSet'>willSet<p>|A property observer that is called just before a property's value is about to be set.	|Execute code before a property's value changes: `var myProperty: Int { willSet { print("Value about to change to \(newValue)") } }`.	|
|<p id='wrt'>wrt<p>|Short for 'with respect to'. Used in contexts related to automatic differentiation to specify the variables with respect to which a derivative is computed.	|Used in automatic differentiation contexts: `@derivative(of: f, wrt: .0)`.	|
|<p id='yield'>yield<p>|A keyword used within `read` and `modify` accessors of computed properties and subscripts to provide a value or an inout binding to the caller.	|Provide value in custom accessors: `var value: Int { _read { yield _storage } }` (advanced usage).	|


## Contributing

Want to help improve the Swift keywords documentation? We'd love your contributions!

### How to Update Keyword Definitions

1. **Edit the keywords map**: Open `keywords_map.clj` and update the definitions
2. **Format**: Each keyword has three fields:
   - `:kw` - The keyword name (don't change this)
   - `:def` - Add a clear, concise definition
   - `:use` - Describe where/how it's used (e.g., "class, struct, func")

3. **Example**:
   ```clojure
   {:kw "public", :def "Access level that allows entities to be used outside their module", :use "class, struct, func, var"}
   ```

4. **Regenerate**: To generate file you need to have [babashka](https://github.com/babashka/babashka#installation) installed, to generate the latest README, 
run the build script `bb gen.clj` to update the README

### Guidelines

- Keep definitions concise but informative
- Include practical usage examples
- Follow Swift's official terminology
- Test your changes before submitting

Thank you for contributing! 🙏
