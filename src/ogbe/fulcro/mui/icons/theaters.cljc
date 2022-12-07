(ns ogbe.fulcro.mui.icons.theaters
  #?(:cljs (:require
            ["@mui/icons-material/Theaters" :default Theaters]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-theaters
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Theaters)))