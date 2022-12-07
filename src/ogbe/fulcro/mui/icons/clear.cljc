(ns ogbe.fulcro.mui.icons.clear
  #?(:cljs (:require
            ["@mui/icons-material/Clear" :default Clear]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-clear
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Clear)))