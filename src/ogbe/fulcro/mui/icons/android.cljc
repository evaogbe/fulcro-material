(ns ogbe.fulcro.mui.icons.android
  #?(:cljs (:require
            ["@mui/icons-material/Android" :default Android]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-android
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Android)))