(ns ogbe.fulcro.mui.icons.battery60
  #?(:cljs (:require
            ["@mui/icons-material/Battery60" :default Battery60]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery60
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Battery60)))