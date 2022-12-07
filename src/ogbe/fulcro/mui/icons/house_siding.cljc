(ns ogbe.fulcro.mui.icons.house-siding
  #?(:cljs (:require
            ["@mui/icons-material/HouseSiding" :default HouseSiding]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-house-siding
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HouseSiding)))