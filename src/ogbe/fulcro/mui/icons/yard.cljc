(ns ogbe.fulcro.mui.icons.yard
  #?(:cljs (:require
            ["@mui/icons-material/Yard" :default Yard]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-yard
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Yard)))