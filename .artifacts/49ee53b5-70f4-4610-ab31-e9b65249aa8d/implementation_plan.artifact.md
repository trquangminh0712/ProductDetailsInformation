# Create "Add to Cart" Button

The user wants to create a button as shown in the provided image. This button features a shopping cart icon, "Thêm vào giỏ" text, a specific color scheme, and highly rounded corners.

## Proposed Changes

### Resources

#### [MODIFY] [strings.xml](file:///C:/Users/HP/AndroidStudioProjects/ProductDetailsrInformation/app/src/main/res/values/strings.xml)
- Update `add_to_cart` string to "Thêm vào giỏ" to match the image.

#### [MODIFY] [add_to_cart.xml](file:///C:/Users/HP/AndroidStudioProjects/ProductDetailsrInformation/app/src/main/res/drawable/add_to_cart.xml)
- Increase corner radius to `25dp` to achieve the pill-shaped look seen in the image.

#### [NEW] [ic_shopping_cart.xml](file:///C:/Users/HP/AndroidStudioProjects/ProductDetailsrInformation/app/src/main/res/drawable/ic_shopping_cart.xml)
- Create a vector drawable for the shopping cart icon.

### Layout

#### [MODIFY] [activity_main.xml](file:///C:/Users/HP/AndroidStudioProjects/ProductDetailsrInformation/app/src/main/res/layout/activity_main.xml)
- Add a `MaterialButton` at the end of the `MotionLayout` inside the `ScrollView`.
- Style the button with the `add_to_cart` background, `ic_shopping_cart` icon, and appropriate colors/padding.

## Verification Plan

### Manual Verification
- Deploy the app and verify the button appears as expected at the bottom of the screen (or where it fits best in the layout).
- Check the icon, text, and rounded corners against the provided image.
