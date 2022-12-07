(ns ogbe.fulcro.mui.icons.house-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HouseSharp" :default HouseSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-house-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HouseSharp)))