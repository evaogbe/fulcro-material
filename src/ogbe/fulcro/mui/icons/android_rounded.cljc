(ns ogbe.fulcro.mui.icons.android-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AndroidRounded" :default AndroidRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-android-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AndroidRounded)))