(ns ogbe.fulcro.mui.icons.apartment
  #?(:cljs (:require
            ["@mui/icons-material/Apartment" :default Apartment]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-apartment
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Apartment)))