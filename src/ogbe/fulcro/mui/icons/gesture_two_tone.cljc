(ns ogbe.fulcro.mui.icons.gesture-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/GestureTwoTone" :default GestureTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gesture-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GestureTwoTone)))