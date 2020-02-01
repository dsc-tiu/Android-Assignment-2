package com.example.aman_dsc.databinding;
import com.example.aman_dsc.R;
import com.example.aman_dsc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.button, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener ageandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of MyData.age
            //         is MyData.setAge((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(age);
            // localize variables for thread safety
            // MyData != null
            boolean myDataJavaLangObjectNull = false;
            // MyData.age
            java.lang.String myDataAge = null;
            // MyData
            com.example.aman_dsc.MyClass myData = mMyData;



            myDataJavaLangObjectNull = (myData) != (null);
            if (myDataJavaLangObjectNull) {




                myData.setAge(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener nameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of MyData.name
            //         is MyData.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(name);
            // localize variables for thread safety
            // MyData != null
            boolean myDataJavaLangObjectNull = false;
            // MyData.name
            java.lang.String myDataName = null;
            // MyData
            com.example.aman_dsc.MyClass myData = mMyData;



            myDataJavaLangObjectNull = (myData) != (null);
            if (myDataJavaLangObjectNull) {




                myData.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener occupationandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of MyData.occupation
            //         is MyData.setOccupation((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(occupation);
            // localize variables for thread safety
            // MyData.occupation
            java.lang.String myDataOccupation = null;
            // MyData != null
            boolean myDataJavaLangObjectNull = false;
            // MyData
            com.example.aman_dsc.MyClass myData = mMyData;



            myDataJavaLangObjectNull = (myData) != (null);
            if (myDataJavaLangObjectNull) {




                myData.setOccupation(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener sentandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of MyData.sent
            //         is MyData.setSent((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(sent);
            // localize variables for thread safety
            // MyData != null
            boolean myDataJavaLangObjectNull = false;
            // MyData
            com.example.aman_dsc.MyClass myData = mMyData;
            // MyData.sent
            java.lang.String myDataSent = null;



            myDataJavaLangObjectNull = (myData) != (null);
            if (myDataJavaLangObjectNull) {




                myData.setSent(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[2]
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.age.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        this.occupation.setTag(null);
        this.sent.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.MyData == variableId) {
            setMyData((com.example.aman_dsc.MyClass) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMyData(@Nullable com.example.aman_dsc.MyClass MyData) {
        this.mMyData = MyData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.MyData);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String myDataOccupation = null;
        java.lang.String myDataSent = null;
        java.lang.String myDataAge = null;
        java.lang.String myDataName = null;
        com.example.aman_dsc.MyClass myData = mMyData;

        if ((dirtyFlags & 0x3L) != 0) {



                if (myData != null) {
                    // read MyData.occupation
                    myDataOccupation = myData.getOccupation();
                    // read MyData.sent
                    myDataSent = myData.getSent();
                    // read MyData.age
                    myDataAge = myData.getAge();
                    // read MyData.name
                    myDataName = myData.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.age, myDataAge);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, myDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.occupation, myDataOccupation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sent, myDataSent);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.age, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, ageandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.name, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.occupation, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, occupationandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.sent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, sentandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): MyData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}