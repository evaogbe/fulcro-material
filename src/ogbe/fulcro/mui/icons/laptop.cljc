(ns ogbe.fulcro.mui.icons.laptop
  #?(:cljs (:require
            ["@mui/icons-material/Laptop" :default Laptop]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-laptop
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Laptop)))