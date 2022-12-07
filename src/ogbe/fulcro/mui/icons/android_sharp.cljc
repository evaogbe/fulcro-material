(ns ogbe.fulcro.mui.icons.android-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AndroidSharp" :default AndroidSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-android-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AndroidSharp)))