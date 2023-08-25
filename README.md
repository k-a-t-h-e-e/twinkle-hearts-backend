
```
resource_server
├─ .gitignore
├─ .mvn
│  └─ wrapper
│     ├─ maven-wrapper.jar
│     ├─ maven-wrapper.properties
│     └─ MavenWrapperDownloader.java
├─ Dockerfile
├─ Dockerfile.dev
├─ mvnw
├─ mvnw.cmd
└─ src
   ├─ main
   │  ├─ java
   │  │  └─ com
   │  │     └─ commerce
   │  │        └─ backend
   │  │           ├─ api
   │  │           │  ├─ ApiController.java
   │  │           │  ├─ CartController.java
   │  │           │  ├─ CategoryController.java
   │  │           │  ├─ ColorController.java
   │  │           │  ├─ DiscountController.java
   │  │           │  ├─ IndexController.java
   │  │           │  ├─ OrderController.java
   │  │           │  ├─ ProductController.java
   │  │           │  ├─ PublicApiController.java
   │  │           │  ├─ PublicUserController.java
   │  │           │  └─ UserController.java
   │  │           ├─ BackendApplication.java
   │  │           ├─ config
   │  │           │  ├─ CachingConfiguration.java
   │  │           │  ├─ Encoders.java
   │  │           │  ├─ SimpleCORSFilter.java
   │  │           │  └─ SwaggerConfiguration.java
   │  │           ├─ constants
   │  │           │  ├─ MailConstants.java
   │  │           │  ├─ SecurityConstants.java
   │  │           │  └─ SwaggerConstants.java
   │  │           ├─ converter
   │  │           │  ├─ cart
   │  │           │  │  └─ CartResponseConverter.java
   │  │           │  ├─ category
   │  │           │  │  └─ ProductCategoryResponseConverter.java
   │  │           │  ├─ color
   │  │           │  │  └─ ProductColorResponseConverter.java
   │  │           │  ├─ order
   │  │           │  │  └─ OrderResponseConverter.java
   │  │           │  ├─ product
   │  │           │  │  ├─ ProductDetailsResponseConverter.java
   │  │           │  │  ├─ ProductResponseConverter.java
   │  │           │  │  └─ ProductVariantResponseConverter.java
   │  │           │  └─ user
   │  │           │     └─ UserResponseConverter.java
   │  │           ├─ dao
   │  │           │  ├─ CartRepository.java
   │  │           │  ├─ ColorRepository.java
   │  │           │  ├─ DiscountRepository.java
   │  │           │  ├─ OrderRepository.java
   │  │           │  ├─ PasswordForgotTokenRepository.java
   │  │           │  ├─ ProductCategoryRepository.java
   │  │           │  ├─ ProductRepository.java
   │  │           │  ├─ ProductVariantRepository.java
   │  │           │  ├─ UserRepository.java
   │  │           │  └─ VerificationTokenRepository.java
   │  │           ├─ error
   │  │           │  ├─ ApiError.java
   │  │           │  ├─ exception
   │  │           │  │  ├─ InvalidArgumentException.java
   │  │           │  │  ├─ ResourceFetchException.java
   │  │           │  │  └─ ResourceNotFoundException.java
   │  │           │  └─ RestExceptionHandler.java
   │  │           ├─ listener
   │  │           │  ├─ PasswordForgotListener.java
   │  │           │  └─ RegistrationListener.java
   │  │           ├─ model
   │  │           │  ├─ dto
   │  │           │  │  ├─ CartItemDTO.java
   │  │           │  │  ├─ CategoryDTO.java
   │  │           │  │  ├─ ColorDTO.java
   │  │           │  │  ├─ DiscountDTO.java
   │  │           │  │  ├─ OrderDetailDTO.java
   │  │           │  │  ├─ ProductVariantDetailDTO.java
   │  │           │  │  └─ ProductVariantDTO.java
   │  │           │  ├─ entity
   │  │           │  │  ├─ Cart.java
   │  │           │  │  ├─ CartItem.java
   │  │           │  │  ├─ Color.java
   │  │           │  │  ├─ Discount.java
   │  │           │  │  ├─ Order.java
   │  │           │  │  ├─ OrderDetail.java
   │  │           │  │  ├─ PasswordForgotToken.java
   │  │           │  │  ├─ Product.java
   │  │           │  │  ├─ ProductCategory.java
   │  │           │  │  ├─ ProductVariant.java
   │  │           │  │  ├─ User.java
   │  │           │  │  └─ VerificationToken.java
   │  │           │  ├─ event
   │  │           │  │  ├─ OnPasswordForgotRequestEvent.java
   │  │           │  │  └─ OnRegistrationCompleteEvent.java
   │  │           │  ├─ request
   │  │           │  │  ├─ cart
   │  │           │  │  │  ├─ AddToCartRequest.java
   │  │           │  │  │  ├─ ConfirmCartRequest.java
   │  │           │  │  │  ├─ DecrementCartItemRequest.java
   │  │           │  │  │  ├─ IncrementCartItemRequest.java
   │  │           │  │  │  └─ RemoveFromCartRequest.java
   │  │           │  │  ├─ discount
   │  │           │  │  │  └─ ApplyDiscountRequest.java
   │  │           │  │  ├─ order
   │  │           │  │  │  └─ PostOrderRequest.java
   │  │           │  │  └─ user
   │  │           │  │     ├─ PasswordForgotConfirmRequest.java
   │  │           │  │     ├─ PasswordForgotRequest.java
   │  │           │  │     ├─ PasswordForgotValidateRequest.java
   │  │           │  │     ├─ PasswordResetRequest.java
   │  │           │  │     ├─ RegisterUserRequest.java
   │  │           │  │     ├─ UpdateUserAddressRequest.java
   │  │           │  │     ├─ UpdateUserRequest.java
   │  │           │  │     └─ ValidateEmailRequest.java
   │  │           │  ├─ response
   │  │           │  │  ├─ cart
   │  │           │  │  │  └─ CartResponse.java
   │  │           │  │  ├─ category
   │  │           │  │  │  └─ ProductCategoryResponse.java
   │  │           │  │  ├─ color
   │  │           │  │  │  └─ ProductColorResponse.java
   │  │           │  │  ├─ order
   │  │           │  │  │  └─ OrderResponse.java
   │  │           │  │  ├─ product
   │  │           │  │  │  ├─ ProductDetailsResponse.java
   │  │           │  │  │  ├─ ProductResponse.java
   │  │           │  │  │  └─ ProductVariantResponse.java
   │  │           │  │  └─ user
   │  │           │  │     └─ UserResponse.java
   │  │           │  └─ specs
   │  │           │     └─ ProductVariantSpecs.java
   │  │           ├─ security
   │  │           │  ├─ CustomAuthoritiesOpaqueTokenIntrospector.java
   │  │           │  └─ SecurityConfiguration.java
   │  │           ├─ service
   │  │           │  ├─ cache
   │  │           │  │  ├─ ProductCacheService.java
   │  │           │  │  ├─ ProductCacheServiceImpl.java
   │  │           │  │  ├─ ProductCategoryCacheService.java
   │  │           │  │  ├─ ProductCategoryCacheServiceImpl.java
   │  │           │  │  ├─ ProductColorCacheService.java
   │  │           │  │  ├─ ProductColorCacheServiceImpl.java
   │  │           │  │  ├─ ProductVariantCacheService.java
   │  │           │  │  └─ ProductVariantCacheServiceImpl.java
   │  │           │  ├─ CartService.java
   │  │           │  ├─ CartServiceImpl.java
   │  │           │  ├─ DiscountService.java
   │  │           │  ├─ DiscountServiceImpl.java
   │  │           │  ├─ OrderService.java
   │  │           │  ├─ OrderServiceImpl.java
   │  │           │  ├─ ProductCategoryService.java
   │  │           │  ├─ ProductCategoryServiceImpl.java
   │  │           │  ├─ ProductColorService.java
   │  │           │  ├─ ProductColorServiceImpl.java
   │  │           │  ├─ ProductService.java
   │  │           │  ├─ ProductServiceImpl.java
   │  │           │  ├─ TokenService.java
   │  │           │  ├─ TokenServiceImpl.java
   │  │           │  ├─ UserService.java
   │  │           │  └─ UserServiceImpl.java
   │  │           └─ validator
   │  │              ├─ CustomEmail.java
   │  │              ├─ CustomEmailValidator.java
   │  │              ├─ PasswordMatches.java
   │  │              └─ PasswordMatchesValidator.java
   │  └─ resources
   │     └─ application.yml
   └─ test
      └─ java
         └─ com
            └─ commerce
               └─ backend
                  ├─ api
                  │  ├─ CartControllerTest.java
                  │  ├─ CategoryControllerTest.java
                  │  ├─ ColorControllerTest.java
                  │  ├─ DiscountControllerTest.java
                  │  ├─ IndexControllerTest.java
                  │  ├─ OrderControllerTest.java
                  │  ├─ ProductControllerTest.java
                  │  ├─ PublicUserControllerTest.java
                  │  └─ UserControllerTest.java
                  ├─ BackendApplicationTests.java
                  ├─ config
                  │  └─ CachingConfigurationTest.java
                  └─ service
                     ├─ CartServiceImplTest.java
                     ├─ DiscountServiceImplTest.java
                     ├─ OrderServiceImplTest.java
                     ├─ ProductCategoryServiceImplTest.java
                     ├─ ProductColorServiceImplTest.java
                     ├─ ProductServiceImplTest.java
                     ├─ TokenServiceImplTest.java
                     └─ UserServiceImplTest.java

```