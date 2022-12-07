(ns ogbe.fulcro.mui.icons.android-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/AndroidTwoTone" :default AndroidTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-android-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AndroidTwoTone)))