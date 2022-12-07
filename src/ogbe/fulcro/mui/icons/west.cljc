(ns ogbe.fulcro.mui.icons.west
  #?(:cljs (:require
            ["@mui/icons-material/West" :default West]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-west
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory West)))