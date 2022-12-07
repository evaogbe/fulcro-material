(ns ogbe.fulcro.mui.icons.family-restroom
  #?(:cljs (:require
            ["@mui/icons-material/FamilyRestroom" :default FamilyRestroom]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-family-restroom
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FamilyRestroom)))