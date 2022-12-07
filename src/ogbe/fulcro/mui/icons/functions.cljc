(ns ogbe.fulcro.mui.icons.functions
  #?(:cljs (:require
            ["@mui/icons-material/Functions" :default Functions]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-functions
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Functions)))