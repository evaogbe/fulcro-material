(ns ogbe.fulcro.mui.icons.dangerous
  #?(:cljs (:require
            ["@mui/icons-material/Dangerous" :default Dangerous]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dangerous
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Dangerous)))