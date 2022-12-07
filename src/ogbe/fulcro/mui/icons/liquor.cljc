(ns ogbe.fulcro.mui.icons.liquor
  #?(:cljs (:require
            ["@mui/icons-material/Liquor" :default Liquor]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-liquor
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Liquor)))