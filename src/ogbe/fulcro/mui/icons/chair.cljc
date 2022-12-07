(ns ogbe.fulcro.mui.icons.chair
  #?(:cljs (:require
            ["@mui/icons-material/Chair" :default Chair]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chair
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Chair)))