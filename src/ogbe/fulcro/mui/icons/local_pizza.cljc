(ns ogbe.fulcro.mui.icons.local-pizza
  #?(:cljs (:require
            ["@mui/icons-material/LocalPizza" :default LocalPizza]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-pizza
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalPizza)))